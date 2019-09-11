package csc.data.linkedstack;

public class LinkedStack<E> implements StackADT<E> {

  private int count;
  private LinkNode<E> top;

  //Constructor
  public LinkedStack() {
    this.count = 0;
    this.top = null;
  }

  public void push(E element) {
    LinkNode<E> temp = new LinkNode<E>(element);
    temp.setNext(this.top);
    this.top = temp;
    this.count++;
  }

  public E pop() {
    if (isEmpty()) {
      throw new RuntimeException("Not possible when Stack is empty");
    }
    E result = this.top.getElem();
    this.top = this.top.getNext();
    this.count--;

    return result;
  }

  public E peek() {
    if (isEmpty()) {
      throw new RuntimeException("Not possible when Stack is empty");
    }
    return this.top.getElem();
  }

  public boolean isEmpty() {
    return (this.count == 0);
  }

  public int size() {
    return this.count;
  }

  public String toString() {
    String result = "[";
    LinkNode<E> current = this.top;
    while (current != null) {
      result += (current.getElem()).toString();
      if(current.getNext() != null)
        result += ", ";
      current = current.getNext();
    }
    result += "]";
    return result;
  }
}