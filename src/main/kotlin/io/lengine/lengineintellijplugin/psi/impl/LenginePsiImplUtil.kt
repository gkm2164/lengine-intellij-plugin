package io.lengine.lengineintellijplugin.psi.impl

import com.intellij.openapi.project.Project
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import io.lengine.lengineintellijplugin.LengineFileType
import io.lengine.lengineintellijplugin.psi.LengineModuleStatement

fun registerModule(moduleStatement: LengineModuleStatement) {
    println(moduleStatement)
    println(moduleStatement.children.toList())
    moduleStatement.children.forEach { println(it) }
}

fun findReference(project: Project) {
    val files = FileTypeIndex.getFiles(LengineFileType.INSTANCE, GlobalSearchScope.allScope(project))
    files.forEach { f -> println(f.name) }
}