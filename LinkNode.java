package csc.data.linkedstack;

public class LinkNode<E> {

  private LinkNode<E> next;
  private E element;

  public LinkNode() {
    this.next = null;
    this.element = null;
  }

  public LinkNode(E element) {
    this.next = null;
    this.element = element;
  }

  public LinkNode<E> getNext() {
    return this.next;
  }

  public void setNext(LinkNode<E> node) {
    this.next = node;
  }

  public E getElem() {
    return this.element;
  }

  public void setElem(E element) {
    this.element = element;
  }
}

