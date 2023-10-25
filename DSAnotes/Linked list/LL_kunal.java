public class LL_kunal {

    public static Node head;
    public static Node tail;
    public static int size;

    public LL_kunal() {
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

    public static void insert_at_begin(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;

        if (tail == null) {
            // if the tail is null i.e. the list has no tail then the head is the tail only.
            tail = head;
        }

        size++;
    }

    // INSERTING AT THE END OF THE LINKED LIST

    public static void insert_at_end(int data) {
        Node new_node = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;
        tail = new_node; // tail got updated

        LL_kunal.size++; // linked list ka size updated
    }

    // INSERTING THE NODE AT SOME POSITION OF THE LIST :

    public static void insert_at_pos(int data, int index) {
        if (index == 0) {
            insert_at_begin(data);
        } else {
            Node newnode = new Node(data);
            Node temp = head;

            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }

            newnode.next = temp.next;
            temp.next = newnode;

            LL_kunal.size++;

            if (index == LL_kunal.size - 1) {
                tail = newnode;
            }

        }
    }

    // DELETION OF NODE FROM THE LIST :

    public static void delete_node(int index) {
        if (index == 0) {
            head = head.next;
            size--;
        } else {
            // Node target = get(index);
            Node prev = get(index - 1);

            prev.next = prev.next.next;
        }
        LL_kunal.size--;
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

    public static void main(String[] args) {
        System.out.println("linked list by kunal kushwaha");
        System.out.println("****************************");
        insert_at_begin(23);
        insert_at_begin(12);
        insert_at_begin(45);
        insert_at_begin(78);
        insert_at_begin(890);
        insert_at_end(566);
        insert_at_end(344);
        insert_at_end(589);
        insert_at_end(234);
        insert_at_pos(232, 0);
        insert_at_pos(676, 4);
        insert_at_pos(32, 10);
        delete_node(0);
        delete_node(4);
        insert_at_end(23444);
        insert_at_pos(8008, 10);
        insert_at_pos(67352635, 11);
        System.out.println("target is " + get(5).data);

        System.out.println("tail data is " + tail.data);
        System.out.println("head data is " + head.data);

        System.out.println("size of list is " + LL_kunal.size);

        display();
        System.out.println("****************************");
    }
}
