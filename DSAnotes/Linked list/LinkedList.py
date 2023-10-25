class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        # self.head = None


# creating head :
head = Node(None)
head.next = None

# Creating nodes
node1 = Node(34)
node2 = Node(78)

# Link the nodes
head.next = node1
node1.next = node2

# Display the linked list

current = node1
while current:
    print(current.data, end=" --> ")
    current = current.next
print("None")

# to add node 4 between node 1 and node 2 :


def add_a_node(ahead_of_whom, value):
    new_node = Node(value)
    temp = ahead_of_whom.next
    ahead_of_whom.next = new_node
    new_node.next = temp


add_a_node(node1, 345)


current = node1
while current:
    print(current.data, end=" --> ")
    current = current.next
print("None")

# ----------------------------------------
# linked list w/o using constructors :


# class Node2:
#     def __init__(self):
#         self.data = None
#         self.next = None
#     pass

node3 = Node()


# head = Node2()

# sample_node = Node2()

# sample_node.data = 'aditya'
# sample_node.next = None

# sample_node_2 = Node2()

# sample_node_2.data = 'ayush'
# sample_node_2.next = None

# head.next = sample_node
# sample_node.next = sample_node_2

# current_node = sample_node

# while current_node:
#     print(current_node.data, end="-->")
#     current_node = current_node.next
# print("list over")

# print(type(node1))
# print(type(sample_node))
# print(type(node1.next))

# print(id(node1))
