abstract class Component {
  // member variales: reference to parent, componentID
  private Component parent = null;
  protected String instanceID;

  // composite methods
  final public Component add(Component part) {
    try {
      // let operators define how children are managed
      doAdd(part);

      // set this Component as the parent of the added part
      part.parent = this;
    } catch(RuntimeException e) {
      throw e;
    }
    return this;
  }

  final public Component remove(Component part) {
    try {
      // let operators define how children are managed
      doRemove(part);

      // remove this Component as the parent of the added parent
      part.parent = null;
    } catch(RuntimeException e) {
      throw e;
    }
    return this;
  }

  protected Component getParent() {
    return parent;
  }

  // Methods that Operators need to Override
  public int getSize() {
    return 1;
  }

  public Component getChild(int number) {
    return null;
  }

  protected void doAdd(Component part) {
    throw new RuntimeException("add() not supported");
  }

  protected void doRemove(Component part) {
    throw new RuntimeException("remove() not supported");
  }

  public abstract void accept(Visitor v);

  //operation methods
  public String toString() {
    throw new UnsupportedOperationException();
  }

  public String getIndention() {
    //count number of tab characters needed to indent
    String indention = "";
    Component parent = this.parent;
    while(parent != null) {
      indention += "\t";
      parent = parent.parent;
    }
    return indention;
  }

}
