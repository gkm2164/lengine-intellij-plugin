package io.lengine.lengineintellijplugin

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class LengineFileType: LanguageFileType(LengineLanguage.INSTANCE) {
    override fun getName(): String {
        return "Lengine"
    }

    override fun getDescription(): String {
        return "Lengine script"
    }

    override fun getDefaultExtension(): String {
        return "lg"
    }

    override fun getIcon(): Icon {
        return LengineIcons.FILE
    }

    companion object {
        val INSTANCE = LengineFileType()
    }
}