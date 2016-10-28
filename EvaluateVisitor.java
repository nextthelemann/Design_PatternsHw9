import java.util.Stack;

class EvaluateVisitor implements Visitor {
    Stack<Float> numberStack = new Stack<Float>();
    Stack<String> operatorStack = new Stack<String>();

    public void visitLeaf(Leaf numberVal) {
      numberStack.push((float)numberVal.getVal());
    }

    public void visitPlusOperator(PlusOperator plus) {
      int n = plus.numOfChild;
      operatorStack.push(plus.toString());
      for (int i = 0; i < n; i++) {
        plus.getChild(i).accept(this);
      }
      float sum = 0;
      operatorStack.pop();
      for(int i = 0; i < n; i++) {
        sum += numberStack.pop();
      }
      numberStack.push(sum);
      if (operatorStack.isEmpty()) {
        System.out.println(numberStack.pop());
      }
    }

    public void visitMultiplyOperator(MultiplyOperator multiply) {
      int n = multiply.numOfChild;
      operatorStack.push(multiply.toString());
      for (int i = 0; i < n; i++) {
        multiply.getChild(i).accept(this);
      }
      float product = 1;
      operatorStack.pop();
      for(int i = 0; i < n; i++) {
        product = product * numberStack.pop();
      }
      numberStack.push(product);
      if (operatorStack.isEmpty()) {
        System.out.println(numberStack.pop());
      }
    }

    public void visitDivideOperator(DivideOperator divide) {
      int n = divide.numOfChild;
      operatorStack.push(divide.toString());
      for (int i = 0; i < n; i++) {
        divide.getChild(i).accept(this);
      }
      float quotient = 1;
      operatorStack.pop();
      for(int i = 0; i < n; i++) {
        quotient = numberStack.pop() / quotient;
      }
      numberStack.push(quotient);
      if (operatorStack.isEmpty()) {
        System.out.println(numberStack.pop());
      }
    }

    public void visitSubtractOperator(SubtractOperator subtract) {
      int n = subtract.numOfChild;
      operatorStack.push(subtract.toString());
      for (int i = 0; i < n; i++) {
        subtract.getChild(i).accept(this);
      }
      float difference = 0;
      operatorStack.pop();
      for(int i = 0; i < n; i++) {
        difference = numberStack.pop() - difference;
      }
      numberStack.push(difference);
      if (operatorStack.isEmpty()) {
        System.out.println(numberStack.pop());
      }
    }
}
