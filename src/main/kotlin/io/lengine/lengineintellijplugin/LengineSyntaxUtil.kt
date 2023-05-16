package io.lengine.lengineintellijplugin

import com.intellij.codeInsight.daemon.impl.HighlightInfo
import com.intellij.codeInsight.daemon.impl.HighlightInfoType
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiWhiteSpace
import com.intellij.psi.tree.IElementType
import com.intellij.psi.util.elementType
import com.intellij.psi.util.siblings
import io.ktor.util.reflect.*
import io.lengine.lengineintellijplugin.psi.LengineTypes

class LengineSyntaxUtil {
    companion object {
        fun isSymbol(element: PsiElement): Boolean = element.elementType == LengineTypes.SYMBOL

        private fun isFnSymbol(parent: PsiElement?): Boolean {
            return parent?.elementType == LengineTypes.FN_SYMBOL
        }

        private fun isDefSymbol(parent: PsiElement?): Boolean {
            return parent?.elementType == LengineTypes.DEF_SYMBOL
        }

        fun isFunctionSymbol(element: PsiElement): Boolean {
            return isSymbol(element) && isFnSymbol(element.parent)
        }

        fun isFunctionLikeSymbol(element: PsiElement): Boolean {
            if (!isVariableSymbol(element) && !isExportSymbol(element)) {
                return false
            }

            val siblingNode = element.parent.siblings(
                forward = true,
                withSelf = false
            ).firstOrNull { !it.instanceOf(PsiWhiteSpace::class) } ?: return false

            return (siblingNode.elementType == LengineTypes.VALUES
                    && siblingNode.firstChild.elementType == LengineTypes.LAMBDA_STMT)
        }

        private fun isExportSymbol(element: PsiElement): Boolean {
            return isSymbol(element) && element.parent.elementType == LengineTypes.EXPORT_SYMBOL
        }

        fun isNativeFunction(element: PsiElement): Boolean {
            if (!isVariableSymbol(element) && !isExportSymbol(element)) {
                return false
            }

            val siblingNode = element.parent.siblings(
                forward = true,
                withSelf = false
            ).firstOrNull { !it.instanceOf(PsiWhiteSpace::class) } ?: return false

            return (siblingNode.elementType == LengineTypes.VALUES
                    && siblingNode.firstChild.elementType == LengineTypes.NATIVE_STMT
                    && isNativeFn(siblingNode.firstChild))
        }

        private fun isNativeFn(nativeStmt: PsiElement): Boolean {
            return nativeStmt.children
                .last()
                .text == "fn"
        }

        fun isNativeVariable(element: PsiElement): Boolean {
            if (!isVariableSymbol(element) && !isExportSymbol(element)) {
                return false
            }

            val siblingNode = element.parent.siblings(
                forward = true,
                withSelf = false
            ).firstOrNull { !it.instanceOf(PsiWhiteSpace::class) } ?: return false

            return (siblingNode.elementType == LengineTypes.VALUES
                    && siblingNode.firstChild.elementType == LengineTypes.NATIVE_STMT
                    && isNativeVar(siblingNode.firstChild))
        }

        private fun isNativeVar(nativeStmt: PsiElement): Boolean {
            return nativeStmt.children
                .last()
                .text == "fn"
        }

        fun isVariableSymbol(element: PsiElement): Boolean {
            return isSymbol(element) && isDefSymbol(element.parent)
        }

        fun getHighlighterFor(elementType: IElementType?): (PsiElement) -> HighlightInfo? {
            val highlighter = when (elementType) {
                LengineTypes.FN_SYMBOL -> LengineSyntaxHighlighter.FUNCTION
                LengineTypes.DEF_SYMBOL -> LengineSyntaxHighlighter.FIELD
                else -> LengineSyntaxHighlighter.EMPTY_KEYS[0]
            }
            return { element ->
                HighlightInfo
                    .newHighlightInfo(
                        HighlightInfoType.HighlightInfoTypeImpl(
                            HighlightSeverity.INFORMATION,
                            highlighter
                        )
                    ).range(element).create()
            }
        }
    }
}
