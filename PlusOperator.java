public class PlusOperator extends Operator {
  // constructor
  public PlusOperator(Component... parts) {
    instanceID = "+";
    for (Component part : parts) {
      add(part);
    }
  }

  @Override
  public void accept(Visitor v) {
    v.visitPlusOperator(this);
  }
}
