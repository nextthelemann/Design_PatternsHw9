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
    //v.visitSubtractOperator(this);
    /*int childCount = this.getNumOfChildren();
    for (int i = 0; i < childCount; i++) {
      this.getChild(i).accept(v);
    }*/
    v.visitSubtractOperator(this);
  }
}
