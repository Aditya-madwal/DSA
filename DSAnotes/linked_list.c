#include <stdio.h>
#include <string.h>
#include <stdlib.h>

struct node {
   int data;
   struct node *next;
};
// struct node *head = NULL;
// struct node *current = NULL;

void printlist(node_t *head){

        node_t *temp = head;

        while (temp != NULL)
        {
                printf("%d - ", temp->value);
                temp = temp->next;
        }
        printf("\n");

}

void printlist(node_t *head);

void main(){
    int* head = NULL;
    struct node node1;
    node1.data = 78;
    node1.next = NULL;

    head = &node1;

    printlist(head);
}