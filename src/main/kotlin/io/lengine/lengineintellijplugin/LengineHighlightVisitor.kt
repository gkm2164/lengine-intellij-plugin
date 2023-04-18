package io.lengine.lengineintellijplugin

import com.intellij.codeInsight.daemon.RainbowVisitor
import com.intellij.codeInsight.daemon.impl.HighlightInfo
import com.intellij.codeInsight.daemon.impl.HighlightInfoType
import com.intellij.codeInsight.daemon.impl.HighlightVisitor
import com.intellij.codeInsight.daemon.impl.analysis.HighlightInfoHolder
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.util.elementType
import io.ktor.util.reflect.*
import io.lengine.lengineintellijplugin.psi.LengineElementType
import io.lengine.lengineintellijplugin.psi.LengineFnSymbol
import io.lengine.lengineintellijplugin.psi.LengineTypes

class LengineHighlightVisitor: HighlightVisitor {
    private var infoHolder: HighlightInfoHolder? = null

    override fun suitableForFile(file: PsiFile): Boolean {
        return file.instanceOf(LengineFile::class)
    }

    override fun visit(element: PsiElement) {
        if (element.elementType == LengineTypes.SYMBOL) {
            if (element.parent.elementType == LengineTypes.FN_SYMBOL) {
                this.infoHolder?.add(
                    HighlightInfo
                        .newHighlightInfo(
                            HighlightInfoType.HighlightInfoTypeImpl(
                                HighlightSeverity.INFORMATION,
                                LengineSyntaxHighlighter.FUNCTION
                            )
                        ).range(element).create()
                )
            } else if (element.parent.elementType == LengineTypes.DEF_SYMBOL) {
                this.infoHolder?.add(
                    HighlightInfo
                        .newHighlightInfo(
                            HighlightInfoType.HighlightInfoTypeImpl(
                                HighlightSeverity.INFORMATION,
                                LengineSyntaxHighlighter.FIELD
                            )
                        ).range(element).create()
                )
            }
        }
    }

    override fun analyze(
        file: PsiFile,
        updateWholeFile: Boolean,
        holder: HighlightInfoHolder,
        action: Runnable
    ): Boolean {
        this.infoHolder = holder
        try {
            action.run()
        } finally {
            this.infoHolder = null
        }
        return true
    }

    override fun clone(): HighlightVisitor {
        return LengineHighlightVisitor()
    }
}