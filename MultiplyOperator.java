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
    //v.visitMultiplyOperator(this);
    /*int childCount = this.getNumOfChildren();
    for (int i = 0; i < childCount; i++) {
      this.getChild(i).accept(v);
    }*/
    v.visitMultiplyOperator(this);
  }
}
