// code through arrow

struct node
{
    int info;
    struct node *next;
};
struct node *header, *tail;

void create(int info)
{
    struct node *newnode;
    if (header == 0)
    {
        newnode = (struct node *)malloc(sizeof(struct node));
        header = newnode;
        newnode->info = info;
        tail = newnode;
    }
    else
    {
        newnode = (struct node *)malloc(sizeof(struct node));
        tail->next = newnode;
        tail = newnode;
        newnode->info = info;
        newnode->next = 0;
    }
}
void insert_at_start(int info)
{
    struct node *newnode;
    struct node *temp;
    if (header == 0)
    {
        newnode = (struct node *)malloc(sizeof(struct node));
        header = newnode;
        newnode->info = info;
        tail = newnode;
    }
    else
    {
        newnode = (struct node *)malloc(sizeof(struct node));
        newnode->info = info;
        newnode->next = header;
        header = newnode;
    }
}

void insert_at_pos(int info, int pos)
{
    struct node *newnode;
    struct node *temp = header;
    while (pos - 1)
    {
        temp = temp->next;
        pos--;
    }

    newnode = (struct node *)malloc(sizeof(struct node));
    newnode->info = info;
    newnode->next = temp->next;
    temp->next = newnode;
}

void display()
{
    struct node *temp = header;
    while (1)
    {
        printf("%d", temp->info);
        if (temp->next == 0)
        {
            break;
        }
        printf(" --> ");
        temp = temp->next;
    }
}
void main()
{
    create(200);
    create(400);
    insert_at_start(123);
    // insert_at_start(456);
    insert_at_pos(555, 2);
    // insert_at_pos(999, 4);

    display();
}