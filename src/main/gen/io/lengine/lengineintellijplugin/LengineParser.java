// This is a generated file. Not intended for manual editing.
package io.lengine.lengineintellijplugin;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static io.lengine.lengineintellijplugin.psi.LengineTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class LengineParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return lengineFile(b, l + 1);
  }

  /* ********************************************************** */
  // LEFT_BRACKET values* RIGHT_BRACKET
  public static boolean array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array")) return false;
    if (!nextTokenIs(b, LEFT_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACKET);
    r = r && array_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, ARRAY, r);
    return r;
  }

  // values*
  private static boolean array_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!values(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "array_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LEFT_PARENTHESIS CASE cond_stmt* DEFAULT values RIGHT_PARENTHESIS
  public static boolean case_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_stmt")) return false;
    if (!nextTokenIs(b, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_PARENTHESIS, CASE);
    r = r && case_stmt_2(b, l + 1);
    r = r && consumeToken(b, DEFAULT);
    r = r && values(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, CASE_STMT, r);
    return r;
  }

  // cond_stmt*
  private static boolean case_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_stmt_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!cond_stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "case_stmt_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (LEFT_PARENTHESIS values* RIGHT_PARENTHESIS)
  //         |   (LAZY_PARENTHESIS values* RIGHT_PARENTHESIS)
  public static boolean clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clause")) return false;
    if (!nextTokenIs(b, "<clause>", LAZY_PARENTHESIS, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLAUSE, "<clause>");
    r = clause_0(b, l + 1);
    if (!r) r = clause_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LEFT_PARENTHESIS values* RIGHT_PARENTHESIS
  private static boolean clause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clause_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PARENTHESIS);
    r = r && clause_0_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, null, r);
    return r;
  }

  // values*
  private static boolean clause_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clause_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!values(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "clause_0_1", c)) break;
    }
    return true;
  }

  // LAZY_PARENTHESIS values* RIGHT_PARENTHESIS
  private static boolean clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clause_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LAZY_PARENTHESIS);
    r = r && clause_1_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, null, r);
    return r;
  }

  // values*
  private static boolean clause_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clause_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!values(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "clause_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // COMPLEX_NUMBER_PARENTHESIS numbers_value numbers_value RIGHT_PARENTHESIS
  public static boolean complex_number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complex_number")) return false;
    if (!nextTokenIs(b, COMPLEX_NUMBER_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMPLEX_NUMBER_PARENTHESIS);
    r = r && numbers_value(b, l + 1);
    r = r && numbers_value(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, COMPLEX_NUMBER, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_PARENTHESIS values values RIGHT_PARENTHESIS
  public static boolean cond_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cond_stmt")) return false;
    if (!nextTokenIs(b, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PARENTHESIS);
    r = r && values(b, l + 1);
    r = r && values(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, COND_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_PARENTHESIS DEF def_symbol values RIGHT_PARENTHESIS
  public static boolean def_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "def_stmt")) return false;
    if (!nextTokenIs(b, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_PARENTHESIS, DEF);
    r = r && def_symbol(b, l + 1);
    r = r && values(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, DEF_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean def_symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "def_symbol")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, DEF_SYMBOL, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_PARENTHESIS DO values* RETURN values RIGHT_PARENTHESIS
  public static boolean do_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "do_stmt")) return false;
    if (!nextTokenIs(b, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_PARENTHESIS, DO);
    r = r && do_stmt_2(b, l + 1);
    r = r && consumeToken(b, RETURN);
    r = r && values(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, DO_STMT, r);
    return r;
  }

  // values*
  private static boolean do_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "do_stmt_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!values(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "do_stmt_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LEFT_PARENTHESIS EXPORT export_symbol values? RIGHT_PARENTHESIS
  public static boolean export_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export_stmt")) return false;
    if (!nextTokenIs(b, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_PARENTHESIS, EXPORT);
    r = r && export_symbol(b, l + 1);
    r = r && export_stmt_3(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, EXPORT_STMT, r);
    return r;
  }

  // values?
  private static boolean export_stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export_stmt_3")) return false;
    values(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean export_symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export_symbol")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, EXPORT_SYMBOL, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_PARENTHESIS FN fn_symbol LEFT_PARENTHESIS SYMBOL* RIGHT_PARENTHESIS values RIGHT_PARENTHESIS
  public static boolean fn_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_stmt")) return false;
    if (!nextTokenIs(b, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_PARENTHESIS, FN);
    r = r && fn_symbol(b, l + 1);
    r = r && consumeToken(b, LEFT_PARENTHESIS);
    r = r && fn_stmt_4(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    r = r && values(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, FN_STMT, r);
    return r;
  }

  // SYMBOL*
  private static boolean fn_stmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_stmt_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, SYMBOL)) break;
      if (!empty_element_parsed_guard_(b, "fn_stmt_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean fn_symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_symbol")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, FN_SYMBOL, r);
    return r;
  }

  /* ********************************************************** */
  // FOR SYMBOL IN values
  public static boolean for_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_stmt")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOR, SYMBOL, IN);
    r = r && values(b, l + 1);
    exit_section_(b, m, FOR_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_PARENTHESIS FOR values WHEN (LEFT_PARENTHESIS values values RIGHT_PARENTHESIS)* OTHERWISE values RIGHT_PARENTHESIS
  public static boolean for_when_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_when_stmt")) return false;
    if (!nextTokenIs(b, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_PARENTHESIS, FOR);
    r = r && values(b, l + 1);
    r = r && consumeToken(b, WHEN);
    r = r && for_when_stmt_4(b, l + 1);
    r = r && consumeToken(b, OTHERWISE);
    r = r && values(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, FOR_WHEN_STMT, r);
    return r;
  }

  // (LEFT_PARENTHESIS values values RIGHT_PARENTHESIS)*
  private static boolean for_when_stmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_when_stmt_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!for_when_stmt_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "for_when_stmt_4", c)) break;
    }
    return true;
  }

  // LEFT_PARENTHESIS values values RIGHT_PARENTHESIS
  private static boolean for_when_stmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_when_stmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PARENTHESIS);
    r = r && values(b, l + 1);
    r = r && values(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_PARENTHESIS IF values values values RIGHT_PARENTHESIS
  public static boolean if_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_stmt")) return false;
    if (!nextTokenIs(b, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_PARENTHESIS, IF);
    r = r && values(b, l + 1);
    r = r && values(b, l + 1);
    r = r && values(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, IF_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_PARENTHESIS IMPORT SYMBOL RIGHT_PARENTHESIS
  public static boolean import_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_statement")) return false;
    if (!nextTokenIs(b, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_PARENTHESIS, IMPORT, SYMBOL, RIGHT_PARENTHESIS);
    exit_section_(b, m, IMPORT_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_PARENTHESIS IMPORT SYMBOL RIGHT_PARENTHESIS
  public static boolean import_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_stmt")) return false;
    if (!nextTokenIs(b, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_PARENTHESIS, IMPORT, SYMBOL, RIGHT_PARENTHESIS);
    exit_section_(b, m, IMPORT_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // statement | COMMENT | CRLF
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    r = statement(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    return r;
  }

  /* ********************************************************** */
  // LAMBDA_PARENTHESIS LEFT_PARENTHESIS SYMBOL* RIGHT_PARENTHESIS values RIGHT_PARENTHESIS
  //              |  LEFT_PARENTHESIS LAMBDA LEFT_PARENTHESIS SYMBOL* RIGHT_PARENTHESIS values RIGHT_PARENTHESIS
  public static boolean lambda_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_stmt")) return false;
    if (!nextTokenIs(b, "<lambda stmt>", LAMBDA_PARENTHESIS, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LAMBDA_STMT, "<lambda stmt>");
    r = lambda_stmt_0(b, l + 1);
    if (!r) r = lambda_stmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LAMBDA_PARENTHESIS LEFT_PARENTHESIS SYMBOL* RIGHT_PARENTHESIS values RIGHT_PARENTHESIS
  private static boolean lambda_stmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_stmt_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LAMBDA_PARENTHESIS, LEFT_PARENTHESIS);
    r = r && lambda_stmt_0_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    r = r && values(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, null, r);
    return r;
  }

  // SYMBOL*
  private static boolean lambda_stmt_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_stmt_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, SYMBOL)) break;
      if (!empty_element_parsed_guard_(b, "lambda_stmt_0_2", c)) break;
    }
    return true;
  }

  // LEFT_PARENTHESIS LAMBDA LEFT_PARENTHESIS SYMBOL* RIGHT_PARENTHESIS values RIGHT_PARENTHESIS
  private static boolean lambda_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_stmt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_PARENTHESIS, LAMBDA, LEFT_PARENTHESIS);
    r = r && lambda_stmt_1_3(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    r = r && values(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, null, r);
    return r;
  }

  // SYMBOL*
  private static boolean lambda_stmt_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_stmt_1_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, SYMBOL)) break;
      if (!empty_element_parsed_guard_(b, "lambda_stmt_1_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // item_*
  static boolean lengineFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lengineFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "lengineFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LEFT_PARENTHESIS SYMBOL values RIGHT_PARENTHESIS
  public static boolean let_decl_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_decl_stmt")) return false;
    if (!nextTokenIs(b, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_PARENTHESIS, SYMBOL);
    r = r && values(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, LET_DECL_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // (LEFT_PARENTHESIS | LAZY_PARENTHESIS) LET LEFT_PARENTHESIS let_decl_stmt* RIGHT_PARENTHESIS values RIGHT_PARENTHESIS
  public static boolean let_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_stmt")) return false;
    if (!nextTokenIs(b, "<let stmt>", LAZY_PARENTHESIS, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LET_STMT, "<let stmt>");
    r = let_stmt_0(b, l + 1);
    r = r && consumeTokens(b, 0, LET, LEFT_PARENTHESIS);
    r = r && let_stmt_3(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    r = r && values(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LEFT_PARENTHESIS | LAZY_PARENTHESIS
  private static boolean let_stmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_stmt_0")) return false;
    boolean r;
    r = consumeToken(b, LEFT_PARENTHESIS);
    if (!r) r = consumeToken(b, LAZY_PARENTHESIS);
    return r;
  }

  // let_decl_stmt*
  private static boolean let_stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_stmt_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!let_decl_stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "let_stmt_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LEFT_PARENTHESIS LOOP for_stmt* values RIGHT_PARENTHESIS
  public static boolean loop_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_stmt")) return false;
    if (!nextTokenIs(b, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_PARENTHESIS, LOOP);
    r = r && loop_stmt_2(b, l + 1);
    r = r && values(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, LOOP_STMT, r);
    return r;
  }

  // for_stmt*
  private static boolean loop_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_stmt_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!for_stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "loop_stmt_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LEFT_PARENTHESIS MODULE SYMBOL RIGHT_PARENTHESIS
  public static boolean module_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_statement")) return false;
    if (!nextTokenIs(b, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_PARENTHESIS, MODULE, SYMBOL, RIGHT_PARENTHESIS);
    exit_section_(b, m, MODULE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_PARENTHESIS NATIVE SYMBOL type RIGHT_PARENTHESIS
  public static boolean native_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "native_stmt")) return false;
    if (!nextTokenIs(b, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_PARENTHESIS, NATIVE, SYMBOL);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, NATIVE_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // NUMBER
  //                |  RATIO_NUMBER
  public static boolean numbers_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numbers_value")) return false;
    if (!nextTokenIs(b, "<numbers value>", NUMBER, RATIO_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMBERS_VALUE, "<numbers value>");
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, RATIO_NUMBER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LEFT_BRACE object_value_entry* RIGHT_BRACE
  public static boolean object_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_value")) return false;
    if (!nextTokenIs(b, LEFT_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACE);
    r = r && object_value_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, OBJECT_VALUE, r);
    return r;
  }

  // object_value_entry*
  private static boolean object_value_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_value_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!object_value_entry(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "object_value_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // OBJECT_SYMBOL values
  public static boolean object_value_entry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_value_entry")) return false;
    if (!nextTokenIs(b, OBJECT_SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OBJECT_SYMBOL);
    r = r && values(b, l + 1);
    exit_section_(b, m, OBJECT_VALUE_ENTRY, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_PARENTHESIS RECOVER SYMBOL values RIGHT_PARENTHESIS
  public static boolean recover_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_stmt")) return false;
    if (!nextTokenIs(b, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_PARENTHESIS, RECOVER, SYMBOL);
    r = r && values(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, RECOVER_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_PARENTHESIS REQUIRE values RIGHT_PARENTHESIS
  public static boolean require_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "require_statement")) return false;
    if (!nextTokenIs(b, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_PARENTHESIS, REQUIRE);
    r = r && values(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, REQUIRE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // module_statement
  //            |  import_statement
  //            |  require_statement
  //            |  stmt
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = module_statement(b, l + 1);
    if (!r) r = import_statement(b, l + 1);
    if (!r) r = require_statement(b, l + 1);
    if (!r) r = stmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // fn_stmt
  //        | def_stmt
  //        | export_stmt
  //        | import_stmt
  //        | values
  public static boolean stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STMT, "<stmt>");
    r = fn_stmt(b, l + 1);
    if (!r) r = def_stmt(b, l + 1);
    if (!r) r = export_stmt(b, l + 1);
    if (!r) r = import_stmt(b, l + 1);
    if (!r) r = values(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STRING
  public static boolean string_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_value")) return false;
    if (!nextTokenIs(b, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    exit_section_(b, m, STRING_VALUE, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_PARENTHESIS TRY values recover_stmt RIGHT_PARENTHESIS
  public static boolean try_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_stmt")) return false;
    if (!nextTokenIs(b, LEFT_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_PARENTHESIS, TRY);
    r = r && values(b, l + 1);
    r = r && recover_stmt(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, m, TRY_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // VAR | FN
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    if (!nextTokenIs(b, "<type>", FN, VAR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = consumeToken(b, VAR);
    if (!r) r = consumeToken(b, FN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL
  //         |  OBJECT_SYMBOL
  //         |  string_value
  //         |  TRUE
  //         |  FALSE
  //         |  CHARACTER
  //         |  array
  //         |  numbers_value
  //         |  complex_number
  //         |  lambda_stmt
  //         |  object_value
  //         |  do_stmt
  //         |  if_stmt
  //         |  let_stmt
  //         |  loop_stmt
  //         |  try_stmt
  //         |  native_stmt
  //         |  for_when_stmt
  //         |  case_stmt
  //         |  clause
  public static boolean values(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "values")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUES, "<values>");
    r = consumeToken(b, SYMBOL);
    if (!r) r = consumeToken(b, OBJECT_SYMBOL);
    if (!r) r = string_value(b, l + 1);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, CHARACTER);
    if (!r) r = array(b, l + 1);
    if (!r) r = numbers_value(b, l + 1);
    if (!r) r = complex_number(b, l + 1);
    if (!r) r = lambda_stmt(b, l + 1);
    if (!r) r = object_value(b, l + 1);
    if (!r) r = do_stmt(b, l + 1);
    if (!r) r = if_stmt(b, l + 1);
    if (!r) r = let_stmt(b, l + 1);
    if (!r) r = loop_stmt(b, l + 1);
    if (!r) r = try_stmt(b, l + 1);
    if (!r) r = native_stmt(b, l + 1);
    if (!r) r = for_when_stmt(b, l + 1);
    if (!r) r = case_stmt(b, l + 1);
    if (!r) r = clause(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
