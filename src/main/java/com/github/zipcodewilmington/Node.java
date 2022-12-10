package com.github.zipcodewilmington;

public class Node <T extends Comparable<T>> implements Comparable<Node<T>> {
    private T data;
    private Node next;

    public Node(T data, Node next) {
        this.data = data;
        this.next = null;
    }

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public Node<T> getNext() {
        return next;
    }

    public T getData() {
        return this.data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean hasNext() {
        return this.next != null;
    }
    @Override
    public int compareTo(Node<T> o) {
        return 0;
    }
}