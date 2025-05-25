package Jobsheet12;

public class Node09 {
    int data;
    Node09 prev;
    Node09 next;

    Node09(Node09 prev, int data, Node09 next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}