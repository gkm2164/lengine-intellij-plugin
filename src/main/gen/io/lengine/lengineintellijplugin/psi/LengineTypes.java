// This is a generated file. Not intended for manual editing.
package io.lengine.lengineintellijplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import io.lengine.lengineintellijplugin.psi.impl.*;

public interface LengineTypes {

  IElementType ARRAY = new LengineElementType("ARRAY");
  IElementType COMPLEX_NUMBER = new LengineElementType("COMPLEX_NUMBER");
  IElementType DEF_STMT = new LengineElementType("DEF_STMT");
  IElementType DEF_SYMBOL = new LengineElementType("DEF_SYMBOL");
  IElementType FN_STMT = new LengineElementType("FN_STMT");
  IElementType FOR_STMT = new LengineElementType("FOR_STMT");
  IElementType IMPORT_STATEMENT = new LengineElementType("IMPORT_STATEMENT");
  IElementType LAMBDA_STMT = new LengineElementType("LAMBDA_STMT");
  IElementType LET_DECL_STMT = new LengineElementType("LET_DECL_STMT");
  IElementType LET_STMT = new LengineElementType("LET_STMT");
  IElementType LOOP_STMT = new LengineElementType("LOOP_STMT");
  IElementType MODULE_STATEMENT = new LengineElementType("MODULE_STATEMENT");
  IElementType NUMBERS_VALUE = new LengineElementType("NUMBERS_VALUE");
  IElementType RECOVER_STMT = new LengineElementType("RECOVER_STMT");
  IElementType REQUIRE_STATEMENT = new LengineElementType("REQUIRE_STATEMENT");
  IElementType STATEMENT = new LengineElementType("STATEMENT");
  IElementType STMT = new LengineElementType("STMT");
  IElementType TRY_STMT = new LengineElementType("TRY_STMT");
  IElementType VALUES = new LengineElementType("VALUES");

  IElementType CHARACTER = new LengineTokenType("CHARACTER");
  IElementType COMMENT = new LengineTokenType("COMMENT");
  IElementType COMPLEX_NUMBER_PARENTHESIS = new LengineTokenType("COMPLEX_NUMBER_PARENTHESIS");
  IElementType CRLF = new LengineTokenType("CRLF");
  IElementType DEF = new LengineTokenType("DEF");
  IElementType FN = new LengineTokenType("FN");
  IElementType FOR = new LengineTokenType("FOR");
  IElementType IMPORT = new LengineTokenType("IMPORT");
  IElementType IN = new LengineTokenType("IN");
  IElementType LAMBDA = new LengineTokenType("LAMBDA");
  IElementType LAMBDA_PARENTHESIS = new LengineTokenType("LAMBDA_PARENTHESIS");
  IElementType LEFT_BRACKET = new LengineTokenType("LEFT_BRACKET");
  IElementType LEFT_PARENTHESIS = new LengineTokenType("LEFT_PARENTHESIS");
  IElementType LET = new LengineTokenType("LET");
  IElementType LOOP = new LengineTokenType("LOOP");
  IElementType MODULE = new LengineTokenType("MODULE");
  IElementType NUMBER = new LengineTokenType("NUMBER");
  IElementType OBJECT_SYMBOL = new LengineTokenType("OBJECT_SYMBOL");
  IElementType RATIO_NUMBER = new LengineTokenType("RATIO_NUMBER");
  IElementType RECOVER = new LengineTokenType("RECOVER");
  IElementType REQUIRE = new LengineTokenType("REQUIRE");
  IElementType RIGHT_BRACKET = new LengineTokenType("RIGHT_BRACKET");
  IElementType RIGHT_PARENTHESIS = new LengineTokenType("RIGHT_PARENTHESIS");
  IElementType STRING = new LengineTokenType("STRING");
  IElementType SYMBOL = new LengineTokenType("SYMBOL");
  IElementType TRY = new LengineTokenType("TRY");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARRAY) {
        return new LengineArrayImpl(node);
      }
      else if (type == COMPLEX_NUMBER) {
        return new LengineComplexNumberImpl(node);
      }
      else if (type == DEF_STMT) {
        return new LengineDefStmtImpl(node);
      }
      else if (type == DEF_SYMBOL) {
        return new LengineDefSymbolImpl(node);
      }
      else if (type == FN_STMT) {
        return new LengineFnStmtImpl(node);
      }
      else if (type == FOR_STMT) {
        return new LengineForStmtImpl(node);
      }
      else if (type == IMPORT_STATEMENT) {
        return new LengineImportStatementImpl(node);
      }
      else if (type == LAMBDA_STMT) {
        return new LengineLambdaStmtImpl(node);
      }
      else if (type == LET_DECL_STMT) {
        return new LengineLetDeclStmtImpl(node);
      }
      else if (type == LET_STMT) {
        return new LengineLetStmtImpl(node);
      }
      else if (type == LOOP_STMT) {
        return new LengineLoopStmtImpl(node);
      }
      else if (type == MODULE_STATEMENT) {
        return new LengineModuleStatementImpl(node);
      }
      else if (type == NUMBERS_VALUE) {
        return new LengineNumbersValueImpl(node);
      }
      else if (type == RECOVER_STMT) {
        return new LengineRecoverStmtImpl(node);
      }
      else if (type == REQUIRE_STATEMENT) {
        return new LengineRequireStatementImpl(node);
      }
      else if (type == STATEMENT) {
        return new LengineStatementImpl(node);
      }
      else if (type == STMT) {
        return new LengineStmtImpl(node);
      }
      else if (type == TRY_STMT) {
        return new LengineTryStmtImpl(node);
      }
      else if (type == VALUES) {
        return new LengineValuesImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
