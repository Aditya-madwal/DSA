class Node:
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next


class LinkedList:
    def __init__(self):
        self.head = None

    def insert_at_begining(self, data):
        node = Node(data, self.head)
        self.head = node

    def print_list(self):

        # if theres no head :

        if self.head is None:
            print("Linked list is empty")
            return

        # if theres already a head :

        current = self.head
        while current:
            print(current.data, end="-->")
            current = current.next

    def insert_at_end(self, data):

        # new_node = Node(data)

        if self.head is None:
            self.head = Node(data, None)
            return

        current = self.head
        while current.next:
            current = current.next
        # now the current is the end node with none next attribute
        # so we add new node to this
        current.next = Node(data, None)

    def delete_last_node(self):
        if self.head == None:
            print("empty list")
        else:
            current = self.head
            while current.next:
                prev = current
                current = current.next
            prev.next = None

    def insert_at(self, k, data):
        current = self.head
        curr_pos = 1

        while curr_pos != k:
            current = current.next
            curr_pos += 1

        print(f"this is the current node {current.data}")
        current.next = Node(data)


        # print(llstr)
ll = LinkedList()

node2 = Node('ayush')

ll.insert_at_end('aditya')
# ll.insert_at_end(node2.data)
ll.insert_at_end('rahul')
ll.insert_at_end('rahul1')
ll.insert_at_end('rahul2')
ll.insert_at_end('somet23')
ll.insert_at_end('sample')
# ll.insert_values(["banana", "mango", "grapes", "orange"])
# ll.insert_at(1, "blueberry")
# ll.remove_at(2)
ll.insert_at_end('end wala')

ll.print_list()
print("\n")

# ll.insert_at(4, 'hui')

# print(ll.head)
# print(ll.head.next.next)
# print(node2)
