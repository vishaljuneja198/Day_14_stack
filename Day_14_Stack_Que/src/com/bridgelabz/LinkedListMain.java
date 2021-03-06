package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Data Structure and Algorithm program ");

        LinkedList l1 = new LinkedList();
        l1.push(70);
        l1.push(30);
        l1.push(56);

        l1.print();

        LinkedList l2 = new LinkedList();
        l2.add(56);
        l2.add(30);
        l2.add(70);

        System.out.println();
        l2.print();

        LinkedList l3 = new LinkedList();
        l3.add(56);
        l3.add(30);

        l3.insert(70, 56);
        System.out.println();
        l3.print();

        l3.pop();
        System.out.println();
        l3.print();

        l3.popLast();
        System.out.println();
        l3.print();

        System.out.println("\nFinding Node value 30");
        Node<Integer> temp = l1.search(30);

        if (temp == null) {
            System.out.println("Data not found");
        } else {
            System.out.println("Data found ");
        }

        l1.insert(40, 30);
        l1.print();

        l1.delete(40);
        System.out.println();
        l1.print();

        l1.sort();
        System.out.println();
        l1.print();

        System.out.println("\n*******************Stacks****************");

        Stack stackVariable = new Stack();
        stackVariable.push(70);
        stackVariable.push(30);
        stackVariable.push(56);

        stackVariable.print();

        System.out.println();
        stackVariable.popPeekTillEmpty();


        System.out.println("\n*******************Queue****************");

        Queue queVariable = new Queue();
        queVariable.enque(56);
        queVariable.enque(30);
        queVariable.enque(70);

        queVariable.print();

        queVariable.pop();
        queVariable.print();




    }
}