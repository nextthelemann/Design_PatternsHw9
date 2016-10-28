public class Leaf extends Component {
  // member variables
  private int val;

  //constructor
  public Leaf(int val) {
    this.val = val;
  }

  // operation methods
  @Override
  public String toString() {
    //String indention = getIndention();
    //return indention + String.valueOf(val) + "\n";
    return String.valueOf(val);
  }
  @Override
  public void accept(Visitor v) {
    v.visitLeaf(this);
  }
  public int getVal() {
    return val;
  }
}
