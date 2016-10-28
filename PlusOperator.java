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
    //v.visitPlusOperator(this);
    /*int childCount = this.numOfChild;
    for (int i = 0; i < childCount; i++) {
      this.getChild(i).accept(v);
    }*/
    v.visitPlusOperator(this);
  }
}
