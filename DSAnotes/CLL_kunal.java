public class CLL_kunal {

    public static Node head;
    public static Node tail;
    public static int size;

    public CLL_kunal() {
        this.size = 0;
    }

    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // INSERTING AT THE BEGGINING/ END OF THE LINKED LIST

    public static void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;

        size++;
    }

    // GET THE NODE AT n INDEX :

    public static Node get(int index) {
        Node node = head;

        if (index == size - 1) {
            node.next = head;
        }
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // deletion of a node from the list :

    public static void delete(int key) {
        size = size - 1;

        Node temp = head;

        while (temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next.next == head) {

        }

        temp.next = temp.next.next;

    }

    // TRAVERSING THE LINKED LIST :

    public static void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.data + " --> ");
                node = node.next;
            } while (node != head);
        }
        System.out.println("HEAD");
    }

    public static void main(String[] args) {
        System.out.println("linked list by kunal kushwaha");
        System.out.println("****************************");
        insert(23);
        insert(12);
        insert(45);
        insert(78);
        insert(890);

        System.out.println("tail data is " + tail.data);
        System.out.println("head data is " + head.data);

        System.out.println("size of list is " + size);

        delete(45);
        // delete(78);
        delete(890);

        // System.out.println(get(1).next.next.data);

        display();
        System.out.println("****************************");
    }
}
