package com.company;
import java.util.LinkedList;

public class  MyHeap<T extends Comparable<T>> {
    private int size;
    private LinkedList minHeap;

    // In the case of a Min-Heap, the root node key is the smallest or minimum among all the other keys present in the heap
    public MyHeap() {
        minHeap = new LinkedList();
    }

    public boolean empty() {
        if (minHeap.size() == 0) return true;
        else return false;
    }

    public int size() {
        return size; //Returns the size of the heap
    }

    public T getMin() {
        return (T) minHeap.get(1); //Returns a reference to the root element of the heap
    }

    public T extractMin() {
        T remove = (T) minHeap.get(1);
        minHeap.remove(1); //Retrieves and deletes the root element of the heap
        return remove;
    }

    public void insert(T item) {
        minHeap.addLast(item); //Adds the element to the heap
    }

    public void heapify(int ind) { //Heapify(i) – fixes the violation of heap property at any position i
        T left = (T) minHeap.get(leftChild(ind));
        T right = (T) minHeap.get(rightChild(ind));

        if (left.compareTo(right) > 0) {
            swap(leftChild(ind), rightChild(ind));
        }

    }

    private int leftChild(int ind) {
        return ind * 2; //Represents the parent node
    }

    private int rightChild(int ind) {
        return ind * 2 + 1; //Represents the right child node
    }

    private int parent(int ind) {
        return ind / 2; //Represents the parent node

    }

    private void swap(int firstInd, int secondInd) { //swap two nodes of the heap
        T tmp = (T) minHeap.get(firstInd);
        minHeap.add(firstInd, minHeap.get(secondInd));
        minHeap.add(secondInd, tmp);
    }
}
