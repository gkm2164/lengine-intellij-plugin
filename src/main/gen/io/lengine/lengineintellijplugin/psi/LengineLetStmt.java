// This is a generated file. Not intended for manual editing.
package io.lengine.lengineintellijplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface LengineLetStmt extends PsiElement {

  @NotNull
  List<LengineLetDeclStmt> getLetDeclStmtList();

  @NotNull
  LengineValues getValues();

}
