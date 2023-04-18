// This is a generated file. Not intended for manual editing.
package io.lengine.lengineintellijplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface LengineStmt extends PsiElement {

  @Nullable
  LengineDefStmt getDefStmt();

  @Nullable
  LengineExportStmt getExportStmt();

  @Nullable
  LengineFnStmt getFnStmt();

  @Nullable
  LengineImportStmt getImportStmt();

  @Nullable
  LengineLetStmt getLetStmt();

  @Nullable
  LengineLoopStmt getLoopStmt();

  @Nullable
  LengineNativeStmt getNativeStmt();

  @NotNull
  List<LengineStmt> getStmtList();

  @Nullable
  LengineTryStmt getTryStmt();

  @Nullable
  LengineValues getValues();

}
