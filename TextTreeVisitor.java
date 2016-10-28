class TextTreeVisitor implements Visitor {
  int layers = 0;

  public void visitLeaf(Leaf numberVal) {
    System.out.print("[" + numberVal + "]\n");
  }

  public void visitPlusOperator(PlusOperator plus) {
    int n = plus.numOfChild;
    layers++;
    System.out.print("[" + plus + "]\n");
    for(int i = 0; i < n; i++) {
      System.out.print(getTab() + " +---");
      plus.getChild(i).accept(this);
    }
  }

  public void visitMultiplyOperator(MultiplyOperator multiply) {
    int n = multiply.numOfChild;
    layers++;
    System.out.print("[" + multiply + "]\n");
    for(int i = 0; i < n; i++) {
      System.out.print(getTab() + " +---");
      multiply.getChild(i).accept(this);
    }
  }

  public void visitDivideOperator(DivideOperator divide) {
    int n = divide.numOfChild;
    layers++;
    System.out.print("[" + divide + "]\n");
    for(int i = 0; i < n; i++) {
      System.out.print(getTab() + " +---");
      divide.getChild(i).accept(this);
    }
  }

  public void visitSubtractOperator(SubtractOperator subtract) {
    int n = subtract.numOfChild;
    System.out.print("[" + subtract + "]\n");
    for(int i = 0; i < n; i++) {
      System.out.print(" +---");
      subtract.getChild(i).accept(this);
    }
  }

  public String getTab() {
    if (layers == 1) {
      return "";
    }
    else {
      String tabular = "";
      for (int i = 1; i < layers; i++) {
        tabular = tabular + "     ";
      }
      return tabular;
    }
  }

}
