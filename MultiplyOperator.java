public class MultiplyOperator extends Operator {
  //constructor
  public MultiplyOperator(Component... parts) {
    instanceID = "*";
    for (Component part : parts) {
      add(part);
    }
  }

  @Override
  public void accept(Visitor v) {
    v.visitMultiplyOperator(this);
  }
}
