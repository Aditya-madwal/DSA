// Import the LinkedList class

import java.util.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linked_list_java {

    public static void traverse(Node head) {
        Node current = head;

        if (current == null) {
            System.out.println("list is empty");
        } else {
            while (current != null) {
                System.out.print(current.data + "-->");
                current = current.next;
            }
        }
    } // time complexity of this kinda traverse is O(n) where n is the no. of nodes in
      // the list.

    public static int countNodes(Node head) {
        Node current = head;
        int count = 0;
        while (current != null) {
            // System.out.println(current.data + "-->");
            current = current.next;
            count = count + 1;
        }
        return count;
    }

    public static Node insert_at_begin(Node head, int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        // head = new_node;
        return new_node;
    }
    // time complexity of this insertion in the beginning of the list is O(1)

    public static void main(String[] args) {
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        Node node3 = new Node(40);
        Node node4 = new Node(50);
        Node node5 = new Node(60);
        // int value[] = { 25, 14, 19, 33, 10, 21, 39, 90, 58, 45 };
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        head = insert_at_begin(head, 23);
        head = insert_at_begin(head, 34);

        traverse(head);
        System.out.println("\n");
        System.out.println(countNodes(head));
    }
}