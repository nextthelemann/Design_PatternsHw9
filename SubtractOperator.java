public class SubtractOperator extends Operator {
  //constructor
  public SubtractOperator(Component... parts) {
    instanceID = "-";
    for (Component part : parts) {
      add(part);
    }
  }

  @Override
  public void accept(Visitor v) {
    v.visitSubtractOperator(this);
  }
}
