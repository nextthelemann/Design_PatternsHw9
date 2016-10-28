class LispVisitor implements Visitor {


  public void visitLeaf(Leaf numberVal) {
    System.out.print(" " + numberVal + " ");
  }

  public void visitPlusOperator(PlusOperator plus) {
    int n = plus.numOfChild;
    System.out.print("(" + plus);
    for (int i = 0; i < n; i++) {
      plus.getChild(i).accept(this);
    }
    System.out.print(")");
  }

  public void visitMultiplyOperator(MultiplyOperator multiply) {
    int n = multiply.numOfChild;
    System.out.print("(" + multiply);
    for (int i = 0; i < n; i++) {
      multiply.getChild(i).accept(this);
    }
    System.out.print(")");
  }

  public void visitDivideOperator(DivideOperator divide) {
    int n = divide.numOfChild;
    System.out.print("(" + divide);
    for (int i = 0; i < n; i++) {
      divide.getChild(i).accept(this);
    }
    System.out.print(")");
  }

  public void visitSubtractOperator(SubtractOperator subtract) {
    int n = subtract.numOfChild;
    System.out.print("(" + subtract);
    for (int i = 0; i < n; i++) {
      subtract.getChild(i).accept(this);
    }
    System.out.print(")");
  }
}
