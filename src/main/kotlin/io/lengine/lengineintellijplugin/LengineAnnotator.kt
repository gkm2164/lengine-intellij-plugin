package io.lengine.lengineintellijplugin

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import io.ktor.util.reflect.*
import io.lengine.lengineintellijplugin.psi.impl.LengineFnSymbolImpl

class LengineAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        println(element)
        if (element.instanceOf(LengineFnSymbolImpl::class)) {

        }
    }
}
