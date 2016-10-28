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
    System.out.println("\n");
    op3.accept(visitor2);
    System.out.print("\n\n");
    op3.accept(visitor3);
    System.out.println("");
    op3.accept(visitor4);
    System.out.println("");

    //build 11 + ((1/2) * (3 + -5) - 45)) + -23
    Component op4 = new PlusOperator(new Leaf(3), new Leaf(-5));
    Component op5 = new SubtractOperator(op4, new Leaf(45));
    Component op6 = new DivideOperator(new Leaf(1), new Leaf(2));
    Component op7 = new MultiplyOperator(op6, op5);
    Component op8 = new PlusOperator(new Leaf(11), op7, new Leaf(-23));

    Visitor visitor5 = new InfixVisitor();
    Visitor visitor6 = new LispVisitor();
    Visitor visitor7 = new EvaluateVisitor();
    Visitor visitor8 = new TextTreeVisitor();

    op8.accept(visitor5);
    System.out.println("\n");
    op8.accept(visitor6);
    System.out.print("\n\n");
    op8.accept(visitor7);
    System.out.println("");
    op8.accept(visitor8);
    System.out.println("");

    //build (19*(((6+7)/3)+4))-(7*9)
    Component testTree = new SubtractOperator(new MultiplyOperator(new Leaf(19), new PlusOperator(new DivideOperator(new PlusOperator(new Leaf(6), new Leaf(7)), new Leaf(3)), new Leaf(4))), new MultiplyOperator(new Leaf(7), new Leaf(9)));

    Visitor visitor9 = new InfixVisitor();
    Visitor visitor10 = new LispVisitor();
    Visitor visitor11 = new EvaluateVisitor();
    Visitor visitor12 = new TextTreeVisitor();

    testTree.accept(visitor9);
    System.out.println("\n");
    testTree.accept(visitor10);
    System.out.print("\n\n");
    testTree.accept(visitor11);
    System.out.println("");
    testTree.accept(visitor12);
    System.out.println("");

  }
}
