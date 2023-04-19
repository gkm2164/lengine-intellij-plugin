// This is a generated file. Not intended for manual editing.
package io.lengine.lengineintellijplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface LengineLoopStmt extends PsiElement {

  @NotNull
  List<LengineForStmt> getForStmtList();

  @NotNull
  LengineValues getValues();

}
