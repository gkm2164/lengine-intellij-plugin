package io.lengine.lengineintellijplugin

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import com.intellij.psi.util.elementType
import io.ktor.util.reflect.*
import io.lengine.lengineintellijplugin.psi.LengineTypes
import io.lengine.lengineintellijplugin.psi.impl.LengineFnSymbolImpl
import io.lengine.lengineintellijplugin.psi.impl.findReference

class LengineAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (element.elementType == LengineTypes.MODULE) {
            findReference(element.project)
        }
    }
}
