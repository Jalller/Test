package com.company;

public class Lists
{
    Node head = null;
    Node tail = null;

    public Node insertFromHead(Node n){
        if (head == null) { //head og tail pejer nu på den knude der indsættes (n)
            head = n;
            tail = n;
            return head;
        }
        //Her ved jeg at listen ikke er tom
//        if (head != null) { //unødvendigt da vi ved head ikke er null her
//        }
        head.previous = n; //pejer den modsatte vej
        n.next = head; //nye knudes næste pejer på den her nu (pejer frem og tilbage)
        head = n;
        return head;
    }

    public Node insertFromTail(Node n){
        if (tail == null) { //head og tail pejer nu på den knude der indsættes (n)
            head = n; //*
            tail = n; //*
            return tail;
        }
        tail.next = n;
        n.previous = tail; //nye knudes næste pejer på den her nu (pejer frem og tilbage)
        tail = n;
        return tail;
    }

    public String printFromHead(){ //fejl null321 string sat til null.

        Node n = head;
        String res = "";

        while (n != null) {
            res = res + n.name;
            n = n.next;
        }
        return res;
    }

    public String printFromTail() {
        Node n = tail;
        String res = "";
        while (n != null) {
            res = res + n.name;
            n = n.next;
        }
        return res;
    }


    public Node removeFromHead() {
        if (head==null) {
            return null;
        }
        if (head==tail) {
            return head;
        }
        //Her er der flere elementer i listen
        Node n = head;
        head.next.previous = null;
        head = head.next;
        return n;
    }
    //removeFromTail + PrintfromHead + printFromTail
    public Node removeFromTail(){
        if (tail==null) {
            return tail;
        }
        if (head==tail) {
            return tail;
        }
        Node n = head;
        tail.next = null;
        tail = tail.previous;
        return n;
    }
}
