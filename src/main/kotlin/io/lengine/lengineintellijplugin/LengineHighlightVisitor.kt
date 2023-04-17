package io.lengine.lengineintellijplugin

import com.intellij.codeInsight.daemon.RainbowVisitor
import com.intellij.codeInsight.daemon.impl.HighlightInfo
import com.intellij.codeInsight.daemon.impl.HighlightVisitor
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import io.ktor.util.reflect.*
import io.lengine.lengineintellijplugin.psi.LengineElementType
import io.lengine.lengineintellijplugin.psi.LengineTypes

class LengineHighlightVisitor: RainbowVisitor() {
    override fun suitableForFile(file: PsiFile): Boolean {
        println(file.fileType)
        return file.fileType == LengineFileType.INSTANCE
    }

    override fun visit(element: PsiElement) {
        if (element == LengineTypes.SYMBOL) {
            println(element)
            val hello: HighlightInfo = highlighter.getInfo(0, element, LengineSyntaxHighlighter.FUNCTION)
            addInfo(hello)
        }
    }

    override fun clone(): HighlightVisitor {
        return LengineHighlightVisitor()
    }
}