package io.lengine.lengineintellijplugin.psi.impl

import io.lengine.lengineintellijplugin.psi.LengineModuleStatement

fun registerModule(moduleStatement: LengineModuleStatement) {
    println(moduleStatement)
    println(moduleStatement.children.toList())
    moduleStatement.children.forEach { println(it) }
}