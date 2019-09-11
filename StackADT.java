package csc.data.linkedstack;

public interface StackADT<E> {

  public void push(E element);

  public E pop();

  public E peek();

  public boolean isEmpty();

  public int size();

  public String toString();

}
