package com.company;

public class Node
{
    public String name;


    Node previous = null;
    Node next = null;

    public String getName() {
        return name;
    }

    public Node(String name) {
        this.name = name;
    }
}
