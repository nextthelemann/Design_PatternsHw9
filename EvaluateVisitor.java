class EvaluateVisitor implements Visitor {
    double answer = 0;

    public void visitLeaf(Leaf numberVal) {
      System.out.print(super.this);
    }

    public void visitPlusOperator(PlusOperator plus) {
      int n = multiply.numOfChild;
      for (int i = 0; i < n; i++) {
        answer += plus.getChild(i).accept(this);
      }
    }

    public void visitMultiplyOperator(MultiplyOperator multiply) {
      int n = multiply.numOfChild;
      for (int i = 0; i < n; i++) {
        answer *= multiply.getChild(i).accept(this);
      }
    }

    public void visitDivideOperator(DivideOperator divide) {
      int n = divide.numOfChild;
      for (int i = 0; i < n; i++) {
        answer /= divide.getChild(i).accept(this);
      }
    }

    public void visitSubtractOperator(SubtractOperator subtract) {
      int n = subtract.numOfChild;
      for (int i = 0; i < n; i++) {
        answer -= subtract.getChild(i).accept(this);
      }
    }

    public double getAnswer() {
      return this.answer;
    }
}
