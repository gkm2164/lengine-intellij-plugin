package io.lengine.lengineintellijplugin

import com.intellij.codeInsight.daemon.impl.HighlightInfo
import com.intellij.codeInsight.daemon.impl.HighlightVisitor
import com.intellij.codeInsight.daemon.impl.analysis.HighlightInfoHolder
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import io.ktor.util.reflect.*
import io.lengine.lengineintellijplugin.psi.LengineTypes

class LengineHighlightVisitor : HighlightVisitor {
    private var infoHolder: HighlightInfoHolder? = null

    override fun suitableForFile(file: PsiFile): Boolean {
        return file.instanceOf(LengineFile::class)
    }

    override fun visit(element: PsiElement) {
        if (LengineSyntaxUtil.isFunctionSymbol(element)) {
            val highlighter = LengineSyntaxUtil.getHighlighterFor(LengineTypes.FN_SYMBOL)
            val highlightInfo: HighlightInfo? = highlighter(element)
            this.infoHolder?.add(highlightInfo)
        } else if (LengineSyntaxUtil.isFunctionLikeSymbol(element)) {
            val highlighter = LengineSyntaxUtil.getHighlighterFor(LengineTypes.FN_SYMBOL)
            val highlightInfo: HighlightInfo? = highlighter(element)
            this.infoHolder?.add(highlightInfo)
        } else if (LengineSyntaxUtil.isNativeFunction(element)) {
            val highlighter = LengineSyntaxUtil.getHighlighterFor(LengineTypes.FN_SYMBOL)
            val highlightInfo: HighlightInfo? = highlighter(element)
            this.infoHolder?.add(highlightInfo)
        } else if (LengineSyntaxUtil.isVariableSymbol(element)) {
            val highlighter = LengineSyntaxUtil.getHighlighterFor(LengineTypes.DEF_SYMBOL)
            val highlightInfo: HighlightInfo? = highlighter(element)
            this.infoHolder?.add(highlightInfo)
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