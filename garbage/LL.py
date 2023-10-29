class Node:
    def __init__(self, data) -> None:
        self.data = data
        self.next = None


class LL:
    def __init__(self):
        self.size = 0
        self.head = None
        self.tail = None

    def insert_at_begin(self, data):
        new_node = Node(data)
        if self.head == None:
            self.head = new_node
            self.tail = new_node
        else:
            new_node.next = self.head
            self.head = new_node
        self.size += 1
        return

    def insert_at_end(self, data):
        new_node = Node(data)

        if self.tail == None:
            self.tail = new_node
            self.size += 1
            return
        else:
            self.tail.next = new_node
            self.tail = new_node
            self.size += 1
            return

    def insert_at_pos(self, data, index):
        new_node = Node(data)

        if index >= self.size:
            print("out of range!")
            return
        if index == 0:
            self.insert_at_begin(data)
            self.size += 1
            return
        if index == self.size - 1:
            self.insert_at_end(data)
            self.size += 1
            return

        prev = self.get(index-1)
        temp = prev.next
        prev.next = new_node
        new_node.next = temp

    def delete_node(self, index):
        if index == self.size - 1:
            self.get(self.size-1).next = None
            self.tail = self.get(self.size-1)
            self.size -= 1
            return

        self.get(index-1).next = self.get(index-1).next.next
        self.size -= 1
        return

    def get(self, index) -> Node:
        node = self.head
        for i in range(0, index):
            node = node.next
        return node

    def display(self):
        temp = self.head

        while temp != None:
            print(temp.data, end="-->")
            temp = temp.next
        print("END")
        return


LL1 = LL()

LL1.insert_at_begin(34)
LL1.insert_at_begin(56)
LL1.insert_at_begin(90)
LL1.insert_at_begin(23)
LL1.insert_at_begin(67)
# print(LL1.get(2).data)
LL1.insert_at_end(897)
LL1.insert_at_end(908)
LL1.insert_at_end(4521)

LL1.insert_at_pos("aditya", 3)
LL1.delete_node(7)
LL1.delete_node(3)

print(LL1.size)
print(f"the head is {LL1.head.data}")
print(f"the tail is {LL1.tail.data}")
LL1.display()
