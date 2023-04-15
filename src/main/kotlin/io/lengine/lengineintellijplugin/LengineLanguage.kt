package io.lengine.lengineintellijplugin

import com.intellij.lang.Language

class LengineLanguage: Language("Lengine") {
    companion object {
        val INSTANCE = LengineLanguage()
    }
}