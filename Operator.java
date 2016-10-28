abstract class Operator extends Component {
  //member variables, linked list of children
  private Node<Component> rootNode = null;
  int numOfChild = 0;

  @Override
  public Component getChild(int number) {
    Node<Component> currentNode = rootNode;
    if (number == 0) {
      return currentNode.data;
    }
    for (int i = 1; i <= number; i++) {
      currentNode = currentNode.next;
    }
    return currentNode.data;
  }
  @Override
  public void doAdd(Component part) {
    numOfChild++;
    if (rootNode == null) {
      rootNode = new Node<Component>(part);
    } else {
      Node<Component> currentNode = rootNode;
      while (currentNode.next != null) {
        currentNode = currentNode.next;
      }
      currentNode.next = new Node<Component>(part);
    }
  }
  @Override
  public void doRemove(Component part) {
    boolean notHere = true;
    Node<Component> currentNode = rootNode;

    if (currentNode.data != null) {
      notHere = false;
      rootNode = currentNode.next;
    } else {
      while (currentNode.next != null) {
        if (currentNode.next.data == part) {
          notHere = false;
          currentNode.next = currentNode.next.next;
          break;
        }
        currentNode = currentNode.next;
      }
    }
    if(notHere) {
      throw new RuntimeException("Couldn't find Component within Operator Composite.");
    }
  }
  @Override
  public String toString() {
    return instanceID;
  }
}
