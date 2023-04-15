package io.lengine.lengineintellijplugin

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import io.lengine.lengineintellijplugin.psi.LengineTypes

class LengineSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return LengineLexerAdaptor()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return when (tokenType) {
            LengineTypes.SEPARATOR -> SEPARATOR_KEYS
            LengineTypes.KEY -> KEY_KEYS
            LengineTypes.VALUE -> VALUE_KEYS
            LengineTypes.COMMENT -> COMMENT_KEYS
            TokenType.BAD_CHARACTER -> BAD_CHAR_KEYS
            else -> EMPTY_KEYS
        }
    }

    companion object {
        val SEPARATOR = createTextAttributesKey("LENGINE_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN)
        val KEY = createTextAttributesKey("LENGINE_KEY", DefaultLanguageHighlighterColors.KEYWORD)
        val VALUE = createTextAttributesKey("LENGINE_VALUE", DefaultLanguageHighlighterColors.STRING)
        val COMMENT = createTextAttributesKey("LENGINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val BAD_CHARACTER = createTextAttributesKey("LENGINE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)

        val BAD_CHAR_KEYS = arrayOf(BAD_CHARACTER)
        val SEPARATOR_KEYS = arrayOf(SEPARATOR)
        val KEY_KEYS = arrayOf(KEY)
        val VALUE_KEYS = arrayOf(VALUE)
        val COMMENT_KEYS = arrayOf(COMMENT)
        val EMPTY_KEYS = arrayOf<TextAttributesKey>()
    }
}