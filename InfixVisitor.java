class InfixVisitor implements Visitor {
  public void visitLeaf(Leaf numberVal) {
    System.out.print(numberVal);
  }

  public void visitPlusOperator(PlusOperator plus) {
    int n = plus.numOfChild;
    System.out.print("(");
    for(int i = 0; i < n; i++) {
      plus.getChild(i).accept(this);
      if (i+1 == n) {
        System.out.print(")");
      } else {
        System.out.print(plus);
      }
    }
  }

  public void visitMultiplyOperator(MultiplyOperator multiply) {
    int n = multiply.numOfChild;
    System.out.print("(");
    for(int i = 0; i < n; i++) {
      multiply.getChild(i).accept(this);
      if (i+1 == n) {
        System.out.print(")");
      } else {
        System.out.print(multiply);
      }
    }
  }

  public void visitDivideOperator(DivideOperator divide) {
    int n = divide.numOfChild;
    System.out.print("(");
    for(int i = 0; i < n; i++) {
      divide.getChild(i).accept(this);
      if (i+1 == n) {
        System.out.println(")");
      } else {
        System.out.print(divide);
      }
    }
  }

  public void visitSubtractOperator(SubtractOperator subtract) {
    int n = subtract.numOfChild;
    for(int i = 0; i < n; i++) {
      subtract.getChild(i).accept(this);
      if (i+1 == n) {

      } else {
        System.out.print(subtract);
      }
    }
  }

  public double getAnswer() {
    return 0;
  }

}
