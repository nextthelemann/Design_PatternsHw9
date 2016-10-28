interface Visitor {
  public void visitLeaf(Leaf numberVal);
  public void visitPlusOperator(PlusOperator plus);
  public void visitMultiplyOperator(MultiplyOperator multiply);
  public void visitDivideOperator(DivideOperator divide);
  public void visitSubtractOperator(SubtractOperator subtract);
}
