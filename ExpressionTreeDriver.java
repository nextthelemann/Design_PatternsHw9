public class ExpressionTreeDriver {
  public static void main(String[] args) {

    //build 1 / (3 + 2 + (9 * 11))
    Component op1 = new MultiplyOperator(new Leaf(9), new Leaf(11));
    Component op2 = new PlusOperator(new Leaf(3), new Leaf(2), op1);
    Component op3 = new DivideOperator(new Leaf(1), op2);

    Visitor visitor1 = new InfixVisitor();
    Visitor visitor2 = new LispVisitor();
    Visitor visitor3 = new EvaluateVisitor();
    Visitor visitor4 = new TextTreeVisitor();
    op3.accept(visitor1);
    System.out.println("");
    op3.accept(visitor2);
    System.out.print("\n\n");
    op3.accept(visitor3);
    System.out.println("");
    op3.accept(visitor4);


    //System.out.print(op3);

  }
}
