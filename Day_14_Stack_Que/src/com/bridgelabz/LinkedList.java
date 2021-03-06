package com.bridgelabz;

public class LinkedList<K> {

    Node<K> head, tail;

    public void push(K key) {
        Node<K> newNode = new Node<>(key);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
    }

    public void print() {
        Node<K> temp = head;
        while (temp != null) {
            System.out.print(temp.key + " ");
            temp = temp.next;
        }
    }

    public void add(K key) {
        Node<K> newNode = new Node<>(key);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public Node<K> search(K key) {
        Node<K> temp = head;
        Node<K> foundKey = null;

        while (temp != null) {
            if (temp.key == key) {
                foundKey = temp;
                break;
            }
            temp = temp.next;
        }
        return foundKey;
    }

    public void insert(K key, K afterKey) {
        Node<K> searchedNode = search(afterKey);
        Node<K> insertValue = new Node<>(key);
        insertValue.next = searchedNode.next;
        searchedNode.next = insertValue;
    }

    public void pop() {
        head = head.next;
    }

    public void popLast() {
        Node<K> temp = head;
        Node<K> lastSecond = null;

        while (temp.next != null) {
            lastSecond = temp;
            temp = temp.next;
        }
        lastSecond.next = null;
        head = lastSecond;
    }

    public void delete(K key){
        Node<K> temp = head;
        Node<K> previousNode = null;

        while(temp!=null){
            if(temp.key.equals(key)){
                break;
            }
            previousNode = temp;
            temp = temp.next;
        }
        previousNode.next=temp.next;
    }

    public void sort(){
        Node<K> temp = head;
        Node<K> index= temp.next;
        Integer value=0;

        while(temp!=null){
            while(index!=null) {
                if ((Integer) temp.key > (Integer) index.key) {
                    value = (Integer) temp.key;
                    temp.key = index.key;
                    index.key = (K) value;
                }
                index=index.next;
            }
            temp=temp.next;
        }
    }
}