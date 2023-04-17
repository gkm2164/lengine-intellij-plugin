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

public class LengineValuesImpl extends ASTWrapperPsiElement implements LengineValues {

  public LengineValuesImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LengineVisitor visitor) {
    visitor.visitValues(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LengineVisitor) accept((LengineVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LengineArray getArray() {
    return findChildByClass(LengineArray.class);
  }

  @Override
  @Nullable
  public LengineComplexNumber getComplexNumber() {
    return findChildByClass(LengineComplexNumber.class);
  }

  @Override
  @Nullable
  public LengineLambdaStmt getLambdaStmt() {
    return findChildByClass(LengineLambdaStmt.class);
  }

  @Override
  @Nullable
  public LengineNumbersValue getNumbersValue() {
    return findChildByClass(LengineNumbersValue.class);
  }

  @Override
  @Nullable
  public LengineObjectValue getObjectValue() {
    return findChildByClass(LengineObjectValue.class);
  }

}
