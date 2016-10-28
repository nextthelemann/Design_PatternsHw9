class TextTreeVisitor implements Visitor {

  public void visitLeaf(Leaf numberVal) {
    System.out.print(numberVal);
  }

  public void visitPlusOperator(PlusOperator plus) {
    System.out.print(plus);
  }

  public void visitMultiplyOperator(MultiplyOperator multiply) {
    System.out.print(multiply);
  }

  public void visitDivideOperator(DivideOperator divide) {
    System.out.print(divide);
  }

  public void visitSubtractOperator(SubtractOperator subtract) {
    /*int numOfChildren = subtract.getNumOfChildren();
    for (i = 0; i < numOfChildren; i++) {
      System.out.print(subtract.getChild(i).accept(this));
    }*/
    System.out.print(subtract);
  }

  public double getAnswer() {
    return 0;
  }

}
