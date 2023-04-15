// This is a generated file. Not intended for manual editing.
package io.lengine.lengineintellijplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import io.lengine.lengineintellijplugin.psi.impl.*;

public interface LengineTypes {

  IElementType PROPERTY = new LengineElementType("PROPERTY");

  IElementType COMMENT = new LengineTokenType("COMMENT");
  IElementType CRLF = new LengineTokenType("CRLF");
  IElementType KEY = new LengineTokenType("KEY");
  IElementType SEPARATOR = new LengineTokenType("SEPARATOR");
  IElementType VALUE = new LengineTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new LenginePropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
