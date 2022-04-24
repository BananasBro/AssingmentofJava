package com.company;
import java.util.LinkedList;
public class MyQueue<T> {
    private  LinkedList<T> linkedList;

    public MyQueue(){
        linkedList = new LinkedList<>();
    }

    public boolean isEmpty(){
        return linkedList.isEmpty();
    }
    public T peek(){
        return get(0);
    }
    private T get(int i) {
        return null;
    }

    public void endqueue(T element){
        linkedList.addLast(element);
    }
    public T dequeue(){
        return linkedList.removeFirst();
    }

    public LinkedList<T> getLinkedList() {
        return linkedList;
    }
}


