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
    //v.visitDivideOperator(this);
    /*int childCount = this.getNumOfChildren();
    for (int i = 0; i < childCount; i++) {
      this.getChild(i).accept(v);
    }*/
    v.visitDivideOperator(this);
  }
}
