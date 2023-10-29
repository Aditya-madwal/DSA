public class detect_loop {

    public static Node head;
    public static Node tail;
    public static int size;

    public detect_loop() {
        this.size = 0;
    }

    public static class Node {
        public int data;
        public Node next;
        public boolean visited;

        public Node(int data) {
            this.visited = false;
            this.data = data;
            this.next = null;
        }
    }

    // INSERTING AT THE END OF THE LINKED LIST

    public static void insert_at_end(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            head = new_node;
            size++;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;
        tail = new_node; // tail got updated

        detect_loop.size++; // linked list ka size updated
    }

    // GET THE NODE AT n INDEX :

    public static Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // TRAVERSING THE LINKED LIST :

    public static void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("end");
    }

    // DETECTION OF A LOOP IN A LINKED LIST (METHOD - 1)

    public static boolean detect_loop() {
        Node temp = head;

        for (int index = 0; index < size - 1; index++) {
            if (temp.visited == true) {
                return true;
            }
            temp.visited = true;
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("****************************");

        insert_at_end(234);
        insert_at_end(34);
        insert_at_end(566);
        insert_at_end(1092);
        insert_at_end(1278);
        insert_at_end(423);
        insert_at_end(2323);

        System.out.println("head ka visited :" + head.visited);

        System.out.println(get(0).next); // returns the address of the node next to the 0th index i.e 1st index node.
        System.out.println(get(1)); // returns the address of node at index 1
        get(1).data = 543;
        get(2).data = 890;
        get(5).next = get(2);
        // get(2).next = get(0);
        // this above statement will make thisa circular LL.

        System.out.println("tail data is " + tail.data);
        System.out.println("head data is " + head.data);

        System.out.println("size of list is " + detect_loop.size);

        System.out.println("detection of loop says : " + detect_loop());

        // display();
        System.out.println("****************************");
    }
}
