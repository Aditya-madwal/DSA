# NAME - ADITYA MADWAL
# CS-3A
# R.NO. 2200290120011

# TOPIC : stack implementation using array
# language used : python

# ------------------------------------------
# push function :
# algorithm :

# begin
# if TOP = n-1 then "stack is full"
# TOP = TOP + 1
# stack[top] --> item to be pushed
# end
# ------------------------------------------

# pop function :
# algorithm :

# begin
# if top = 0 then "stack is empty"
# top = top - 1
# end

# ------------------------------------------

stack = []

TOP = len(stack) - 1
print(f"current top is {TOP}")


def is_empty():
    if TOP == -1:
        return True
    else:
        return False


def push(item):
    stack.append(item)


def pop():
    if not is_empty():
        stack.pop()
    else:
        print("Stack is empty. Cannot pop element.")


def peek():
    if not is_empty():
        return stack[-1]
    else:
        print("Stack is empty. Cannot peek.")
        return None


push(23)
push(34)

print(f"last element is {peek()}")
