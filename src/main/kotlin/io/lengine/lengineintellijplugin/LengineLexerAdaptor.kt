package io.lengine.lengineintellijplugin

import com.intellij.lexer.FlexAdapter

class LengineLexerAdaptor: FlexAdapter(LengineLexer(null)) {
}