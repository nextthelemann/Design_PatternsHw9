class TextTreeVisitor implements Visitor {
  int layers = 0;

  public void visitLeaf(Leaf numberVal) {
    System.out.print("[" + numberVal + "]\n");
  }

  public void visitPlusOperator(PlusOperator plus) {
    int n = plus.numOfChild;
    //++layers;
    int myLayer = ++layers;
    System.out.print("[" + plus + "]\n");
    for(int i = 0; i < n; i++) {
      System.out.print(getTab(myLayer) + " +---");
      plus.getChild(i).accept(this);
    }
  }

  public void visitMultiplyOperator(MultiplyOperator multiply) {
    int n = multiply.numOfChild;
    int myLayer = ++layers;
    System.out.print("[" + multiply + "]\n");
    for(int i = 0; i < n; i++) {
      System.out.print(getTab(myLayer) + " +---");
      multiply.getChild(i).accept(this);
    }
  }

  public void visitDivideOperator(DivideOperator divide) {
    int n = divide.numOfChild;
    int myLayer = ++layers;
    System.out.print("[" + divide + "]\n");
    for(int i = 0; i < n; i++) {
      System.out.print(getTab(myLayer) + " +---");
      divide.getChild(i).accept(this);
    }
  }

  public void visitSubtractOperator(SubtractOperator subtract) {
    int n = subtract.numOfChild;
    int myLayer = ++layers;
    System.out.print("[" + subtract + "]\n");
    for(int i = 0; i < n; i++) {
      System.out.print(getTab(myLayer) + " +---");
      subtract.getChild(i).accept(this);
    }
  }

  public String getTab(int layer) {
    if (layer == 1) {
      return "";
    }
    else {
      String tabular = "";
      for (int i = 1; i < layer; i++) {
        tabular = tabular + " |   ";
      }
      return tabular;
    }
  }

}
