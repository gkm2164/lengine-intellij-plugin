// This is a generated file. Not intended for manual editing.
package io.lengine.lengineintellijplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.lengine.lengineintellijplugin.psi.LengineTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import io.lengine.lengineintellijplugin.psi.*;

public class LengineStmtImpl extends ASTWrapperPsiElement implements LengineStmt {

  public LengineStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LengineVisitor visitor) {
    visitor.visitStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LengineVisitor) accept((LengineVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LengineDefStmt getDefStmt() {
    return findChildByClass(LengineDefStmt.class);
  }

  @Override
  @Nullable
  public LengineExportStmt getExportStmt() {
    return findChildByClass(LengineExportStmt.class);
  }

  @Override
  @Nullable
  public LengineFnStmt getFnStmt() {
    return findChildByClass(LengineFnStmt.class);
  }

  @Override
  @Nullable
  public LengineImportStmt getImportStmt() {
    return findChildByClass(LengineImportStmt.class);
  }

  @Override
  @Nullable
  public LengineLetStmt getLetStmt() {
    return findChildByClass(LengineLetStmt.class);
  }

  @Override
  @Nullable
  public LengineLoopStmt getLoopStmt() {
    return findChildByClass(LengineLoopStmt.class);
  }

  @Override
  @Nullable
  public LengineNativeStmt getNativeStmt() {
    return findChildByClass(LengineNativeStmt.class);
  }

  @Override
  @NotNull
  public List<LengineStmt> getStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LengineStmt.class);
  }

  @Override
  @Nullable
  public LengineTryStmt getTryStmt() {
    return findChildByClass(LengineTryStmt.class);
  }

  @Override
  @Nullable
  public LengineValues getValues() {
    return findChildByClass(LengineValues.class);
  }

}
