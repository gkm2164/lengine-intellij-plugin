package io.lengine.lengineintellijplugin.psi

import com.intellij.psi.tree.IElementType
import io.lengine.lengineintellijplugin.LengineLanguage

class LengineElementType(debugName: String): IElementType(debugName, LengineLanguage.INSTANCE) {
    override fun toString(): String {
        return "LengineElementType.${super.toString()}"
    }
}