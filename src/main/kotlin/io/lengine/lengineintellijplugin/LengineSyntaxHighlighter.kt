package io.lengine.lengineintellijplugin

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import io.ktor.util.reflect.*
import io.lengine.lengineintellijplugin.psi.LengineElementType
import io.lengine.lengineintellijplugin.psi.LengineTokenType
import io.lengine.lengineintellijplugin.psi.LengineTypes

class LengineSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return LengineLexerAdaptor()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return when (tokenType) {
            LengineTypes.LEFT_PARENTHESIS -> PARENTHESIS_KEYS
            LengineTypes.RIGHT_PARENTHESIS -> PARENTHESIS_KEYS
            LengineTypes.COMPLEX_NUMBER_PARENTHESIS -> PARENTHESIS_KEYS
            LengineTypes.LAMBDA_PARENTHESIS -> PARENTHESIS_KEYS
            LengineTypes.MODULE,
            LengineTypes.IMPORT,
            LengineTypes.REQUIRE,
            LengineTypes.FN,
            LengineTypes.LET,
            LengineTypes.DEF,
            LengineTypes.LOOP,
            LengineTypes.IN,
            LengineTypes.FOR,
            LengineTypes.LAMBDA,
            LengineTypes.TRY,
            LengineTypes.RECOVER -> KEY_KEYS
            LengineTypes.STRING, LengineTypes.CHARACTER -> STRING_KEYS
            LengineTypes.FN_SYMBOL -> FN_KEYS
            LengineTypes.DEF_SYMBOL -> FIELD_KEYS
            LengineTypes.SYMBOL -> IDENTIFIER_KEYS
            LengineTypes.OBJECT_SYMBOL -> FIELD_KEYS
            LengineTypes.COMMENT -> COMMENT_KEYS
            LengineTypes.NUMBER -> NUMBER_KEYS
            LengineTypes.RATIO_NUMBER -> NUMBER_KEYS
            LengineTypes.COMPLEX_NUMBER -> NUMBER_KEYS
            TokenType.BAD_CHARACTER -> BAD_CHAR_KEYS
            else -> EMPTY_KEYS
        }
    }

    companion object {
        val KEY = createTextAttributesKey("LENGINE_KEY",
            DefaultLanguageHighlighterColors.KEYWORD)
        val IDENTIFIER = createTextAttributesKey("LENGINE_IDENTIFIER",
            DefaultLanguageHighlighterColors.IDENTIFIER)
        val FIELD = createTextAttributesKey("LENGINE_FIELD",
            DefaultLanguageHighlighterColors.INSTANCE_FIELD)
        val STRING = createTextAttributesKey("LENGINE_STRING",
            DefaultLanguageHighlighterColors.STRING)
        val NUMBER = createTextAttributesKey("LENGINE_NUMBER",
            DefaultLanguageHighlighterColors.NUMBER)
        val COMMENT = createTextAttributesKey("LENGINE_COMMENT",
            DefaultLanguageHighlighterColors.LINE_COMMENT)
        val PARENTHESIS = createTextAttributesKey("LENGINE_PARENTHESIS",
            DefaultLanguageHighlighterColors.PARENTHESES)
        val FUNCTION = createTextAttributesKey("LENGINE_FUNCTION",
            DefaultLanguageHighlighterColors.FUNCTION_DECLARATION)
        val BAD_CHARACTER = createTextAttributesKey("LENGINE_BAD_CHARACTER",
            HighlighterColors.BAD_CHARACTER)

        val BAD_CHAR_KEYS = arrayOf(BAD_CHARACTER)
        val IDENTIFIER_KEYS = arrayOf(IDENTIFIER)
        val FIELD_KEYS = arrayOf(FIELD)
        val KEY_KEYS = arrayOf(KEY)
        val STRING_KEYS = arrayOf(STRING)
        val NUMBER_KEYS = arrayOf(NUMBER)
        val COMMENT_KEYS = arrayOf(COMMENT)
        val PARENTHESIS_KEYS = arrayOf(PARENTHESIS)
        val FN_KEYS = arrayOf(FUNCTION)
        val EMPTY_KEYS = arrayOf<TextAttributesKey>()
    }
}