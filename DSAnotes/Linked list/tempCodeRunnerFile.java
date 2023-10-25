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

    // INSERTING AT THE BEGGINING OF THE LINKED LIST

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    // // INSERTING AT THE END OF THE LINKED LIST

    // public static void insert_at_end(int data) {
    // Node new_node = new Node(data);
    // Node temp = head;
    // while (temp.next != null) {
    // temp = temp.next;
    // }
    // temp.next = new_node;
    // tail = new_node; // tail got updated

    // LL_kunal.size++; // linked list ka size updated
    // }

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

        System.out.println("size of list is " + LL_kunal.size);

        display();
        System.out.println("****************************");
    }
}
