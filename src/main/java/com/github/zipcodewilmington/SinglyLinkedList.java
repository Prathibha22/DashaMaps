package com.github.zipcodewilmington;
public class SinglyLinkedList<T extends Comparable<T>> {

    private Node<T> head;

    public SinglyLinkedList<T> add(T data) {
        Node<T> add = new Node<>(data);
        if (this.head == null) head = add;
        else {
            Node<T> currNode = head;
            while (currNode.hasNext()) {
                currNode = currNode.getNext();
            }
            currNode.setNext(add);
        }
        return this;
    }

    public void remove(int index) throws IndexOutOfBoundsException {
        Node<T> currNode = this.head;
        if (index == 0) this.head = this.head.getNext();
        else {
            for (int i = 0; i < index - 1; i++) {
                if (currNode.hasNext()) currNode = currNode.getNext();
                else throw new IndexOutOfBoundsException();
            }
            currNode.setNext(currNode.getNext().getNext());
        }
    }
    public T get(int index) throws IndexOutOfBoundsException {
        Node<T> currNode = this.head;
        for (int i = 0; i < index; i++) {
            if (currNode.hasNext()) currNode = currNode.getNext();
             else throw new IndexOutOfBoundsException();
        }
        return currNode.getData();
    }
    public int size() {
        Node<T> currNode = this.head;
        int count = 0;
        while (currNode != null) {
            count += 1;
            currNode = currNode.getNext();
        }
        return count;
    }
    public int find(T data) {
        Node<T> currNode = this.head;
        int count = 0;
        while (currNode != null) {
            if (data.compareTo(currNode.getData()) == 0) {
                return count;
            }
            count += 1;
            currNode = currNode.getNext();
        }
        return -1;
    }
    public boolean contains(T data) {
        return this.find(data) != -1;
    }

    public SinglyLinkedList<T> copy() {
        SinglyLinkedList<T> copyList = new SinglyLinkedList<>();
        Node<T> currNode = this.head;
        while (currNode != null) {
            copyList.add(currNode.getData());
            currNode = currNode.getNext();
        }
        return copyList;
    }
}