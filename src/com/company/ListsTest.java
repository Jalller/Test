package com.company;

import static org.junit.jupiter.api.Assertions.*;
class ListsTest {
    Lists list = new Lists(); //Hver gang ny test, laver en ny liste så en tom


    @org.junit.jupiter.api.Test
    void insertFromHead() {
        Node n = new Node("Bo");
        assertEquals("Bo", list.insertFromHead(n).name);
        Node n1 = new Node("Ib");
        assertEquals("Ib", list.insertFromHead(n1).name);
    }

    @org.junit.jupiter.api.Test
    void insertFromTail() {
        Node n = new Node("1");
        assertEquals("1", list.insertFromTail(n).name);
        Node n1 = new Node("Ib");
        assertEquals("Ib", list.insertFromTail(n1).name);
    }

    @org.junit.jupiter.api.Test
    void printFromHead() {
        //assertEquals("",liste.printFromHead());

        Node n = new Node("1");
        Node n1 = new Node("2");
        Node n2 = new Node("3");

        list.insertFromHead(n);
        list.insertFromHead(n1);
        list.insertFromHead(n2);
        //liste.insertFromHead(New Node(navn"1"));

        assertEquals("321", list.printFromHead());

    }

    @org.junit.jupiter.api.Test
    void printFromTail() {
        Node n = new Node("1");
        Node n1 = new Node("2");
        Node n2 = new Node("3");
        Node n3 = new Node("4");
        assertEquals(1234, list.printFromTail());


    }

    @org.junit.jupiter.api.Test
    void removeFromHead() {
        assertEquals(null, list.removeFromHead());
        Node n = new Node("1");
        list.insertFromHead(n);
        assertEquals(n, list.removeFromHead());

        Node n1 = new Node("2");
        Node n2 = new Node("3");

        list.insertFromHead(n);
        list.insertFromHead(n1);
        list.insertFromHead(n2);

        assertEquals(n2, list.removeFromHead());


    }

    @org.junit.jupiter.api.Test
    void removeFromTail() {
        assertEquals(null, list.removeFromTail());
        Node n = new Node("1");
        list.insertFromTail(n);
        assertEquals(n, list.removeFromTail());

        Node n1 = new Node("2");
        Node n2 = new Node("3");

        list.insertFromTail(n);
        list.insertFromTail(n1);
        list.insertFromTail(n2);

        assertEquals(n, list.removeFromTail());

    }
}