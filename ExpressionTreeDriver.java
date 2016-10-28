public class ExpressionTreeDriver {
  public static void main(String[] args) {

    //build 1 / (3 + 2 + (9 * 11))
    Component op1 = new MultiplyOperator(new Leaf(9), new Leaf(11));
    Component op2 = new PlusOperator(new Leaf(3), new Leaf(2), op1);
    Component op3 = new DivideOperator(new Leaf(1), op2);

    Visitor visitor1 = new EvaluateVisitor();
    op3.accept(visitor1);
    System.out.println(visitor1.getAnswer());


    //System.out.print(op3);

  }
}
