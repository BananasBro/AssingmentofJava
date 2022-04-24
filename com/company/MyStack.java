package com.company;
import java.util.LinkedList;

public class MyStack<T> {
    private LinkedList symlinked;

    public MyStack(){
        symlinked = new LinkedList();
    }

    public boolean empty(){
        if (symlinked.size() != 0) {
            return false;
        }
        return true;
    }
    public int size() {
        return size();
    }
    public T peek(){
        return (T) symlinked.get(0);
    }

    public T push(T item){
        symlinked.addFirst(item);
        return item;
    }
    public T pop(){
        T remove = peek();
        symlinked.removeFirst();
        return remove;
    }


}

