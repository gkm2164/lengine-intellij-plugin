package io.lengine.lengineintellijplugin

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class LengineFile(viewProvider: FileViewProvider): PsiFileBase(viewProvider, LengineLanguage.INSTANCE) {
    override fun getFileType(): FileType {
        return LengineFileType.INSTANCE
    }

    override fun toString(): String {
        return "Lengine File"
    }
}