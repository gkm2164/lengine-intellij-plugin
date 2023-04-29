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

public class LengineClauseImpl extends ASTWrapperPsiElement implements LengineClause {

  public LengineClauseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LengineVisitor visitor) {
    visitor.visitClause(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LengineVisitor) accept((LengineVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<LengineValues> getValuesList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LengineValues.class);
  }

}
