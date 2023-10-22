public class DLL_kunal {

    // basic global variable declaration : head, tail, size

    public static Node head;
    public static Node tail;
    public int size = 0;

    // node class and constructor :

    public static class Node {
        public int data;
        public Node prev;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // insert at the beginning of the linked list :

    public void insert_at_begin(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            head = new_node;
            head.prev = null;
            tail = new_node;
            size++;
        } else {
            head.prev = new_node;
            new_node.next = head;
            new_node.prev = null;
            head = new_node;
            size++;
        }
    }

    // insert at the end :

    public void insert_at_end(int data) {
        Node new_node = new Node(data);

        if (head == null || tail == null) {
            head = new_node;
            tail = new_node;
            size++;
        } else {
            tail.next = new_node;
            new_node.prev = tail;
            tail = new_node;
            size++;
        }
    }

    // insert at some postion :

    public void insert_at_pos(int data, int index) {
        Node new_node = new Node(data);

        if (index == 0) {
            insert_at_begin(data);
        } else if (index == size - 1) {
            insert_at_end(data);
        } else if (index >= size) {
            System.out.println("ERROR : index out of range");
            size--;
        } else {
            Node curr = head;

            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }

            new_node.next = curr.next;
            curr.next.prev = new_node;
            curr.next = new_node;
            new_node.prev = curr;
        }
        size++;
    }

    // getting any node by its index :

    public static Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // display the linked list :

    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("end");
    }

    // display reverse :
    public void display_reverse() {
        Node current = tail;

        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.prev;
        }
        System.out.println("end");
    }

    // main function :

    public static void main(String[] args) {
        DLL_kunal dll1 = new DLL_kunal();

        dll1.insert_at_begin(234);
        dll1.insert_at_begin(2354);
        dll1.insert_at_begin(43231);
        dll1.insert_at_begin(223132);
        dll1.insert_at_begin(867867);
        dll1.insert_at_begin(22112);

        dll1.insert_at_end(678);
        System.out.println("the head is " + dll1.head.data);
        System.out.println("the tail is " + dll1.tail.data);

        System.out.println("3rd index is  " + get(4).data);
        System.out.println(get(4).prev.data);
        System.out.println("tail ka previous : " + tail.prev.data);

        dll1.insert_at_pos(67216722, 2);
        dll1.insert_at_pos(16722, 23);

        dll1.display();
        dll1.display_reverse();
        System.out.println("size of the list " + dll1.size);
    }
}
