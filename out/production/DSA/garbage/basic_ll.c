#include <stdio.h>

struct student
{
    // char name[10];
    int roll; // int age;  //float cgpa;
    struct student *next;
};
int main()
{
    struct student *head;
    struct student s1, s2, s3, s4;
    head = &s1; ////////// referencing
    s1.next = &s2;
    s1.roll = 23;
    s2.next = &s3;
    s2.roll = 34;
    s3.next = NULL;
    s3.roll = 454;
    // next operation
    // s4.next = s1.next;
    // s1.next = &s4;
    return 0;

    struct student *temp = head;
    while (temp)
    {
        printf("%d", temp->roll);
        if ((*temp).next == NULL)
        {
            break;
        }
        printf(" --> ");
        temp = (*temp).next;
    }
}