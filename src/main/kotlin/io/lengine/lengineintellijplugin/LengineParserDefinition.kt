package io.lengine.lengineintellijplugin

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import io.lengine.lengineintellijplugin.psi.LengineTypes

class LengineParserDefinition: ParserDefinition {
    override fun createLexer(project: Project?): Lexer {
        return LengineLexerAdaptor()
    }

    override fun createParser(project: Project?): PsiParser {
        return LengineParser()
    }

    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    override fun getCommentTokens(): TokenSet {
        return LengineTokenSets.COMMENTS
    }

    override fun getStringLiteralElements(): TokenSet {
        return TokenSet.EMPTY
    }

    override fun createElement(node: ASTNode?): PsiElement {
        return LengineTypes.Factory.createElement(node)
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return LengineFile(viewProvider)
    }

    companion object {
        val FILE = IFileElementType(LengineLanguage.INSTANCE)

    }
}