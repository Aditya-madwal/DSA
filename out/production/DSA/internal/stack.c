#include <stdio.h>
#include <conio.h>

void push(int item, int length, int array[])
{
    if (TOP == length)
        printf("stack is already full.");
    else
    {
        TOP = TOP + 1;
        stack[TOP] = val;
    }
}

void pop()
{
    if (TOP == -1)
    {
        printf("stack is empty, pop not possible");
    }
    else
    {
        TOP = TOP - 1;
    }
}

void push(int item, int length, int array[]);
void pop();

void main()
{
    int sample_stack[10];
    push(34, 10, sample_stack);
}
