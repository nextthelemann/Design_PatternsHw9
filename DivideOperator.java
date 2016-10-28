public class DivideOperator extends Operator {
  //constructor
  public DivideOperator(Component... parts) {
    instanceID = "/";
    for (Component part : parts) {
      add(part);
    }
  }

  @Override
  public void accept(Visitor v) {
    v.visitDivideOperator(this);
  }
}
