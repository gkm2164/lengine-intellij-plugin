package io.lengine.lengineintellijplugin

import com.intellij.codeInsight.daemon.RainbowVisitor
import com.intellij.codeInsight.daemon.impl.HighlightVisitor
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile

class LengineHighlightVisitor: RainbowVisitor() {
    override fun suitableForFile(file: PsiFile): Boolean {
        return file.fileType == LengineFileType.INSTANCE
    }

    override fun visit(element: PsiElement) {
    }

    override fun clone(): HighlightVisitor {
        return LengineHighlightVisitor()
    }
}