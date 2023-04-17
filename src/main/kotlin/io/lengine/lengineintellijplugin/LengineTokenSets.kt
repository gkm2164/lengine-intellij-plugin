package io.lengine.lengineintellijplugin

import com.intellij.psi.tree.TokenSet
import io.lengine.lengineintellijplugin.psi.LengineTypes

interface LengineTokenSets {

    companion object {
        val IDENTIFIERS: TokenSet = TokenSet.create(LengineTypes.SYMBOL)

        val COMMENTS: TokenSet = TokenSet.create(LengineTypes.COMMENT)
    }

}