#include <stdio.h>
#include <stdlib.h>
#include<malloc.h>
#include<conio.h>
struct node
{
    int info;
    struct node *link;
};
void display(struct node *temp)
{
    int z=0;
    if(temp==NULL)
    {
        printf("linkedlist is empty\n");
    }
    else{
        while(temp!=NULL)
        {
            z++;
            printf(" %d th element=%d\n",z,temp->info);
            temp=temp->link;
        }
    }
}
void addatfirst(struct node **p,int data)
{
    struct node *new1;
    new1=(struct node *)malloc(sizeof(struct node));
    new1->link=*p;
    *p=new1;
    new1->info=data;
}

void search(int q,struct node *p)
{
    struct node *temp=p;
    while(temp->link!=NULL)
    {
        if(temp->info==q)
        {
             printf("its present");
             break;
        }
        else{
            temp=temp->link;
        }
    }
    if(temp->link==NULL)
    {
        if(temp->info==q)
        printf("its present");
    }
}
void count(struct node *temp)
{
    struct node *p=temp;
    int q=0;
    while(p->link!=NULL)
    {
        q++;
        p=p->link;
    }
    if(p->link==NULL)
    {
       q++;
    }
    printf("\nthere are %d number of elements",q);
}
int main()
{
    struct node *start=NULL;
    display(start);
    printf("enter the number of element to be inserted:");
    int p,i;
    scanf("%d",&p);
    for( i=1;i<=p;i++)
    {
        int o;
        scanf("%d",&o);
           addatfirst(&start,o);
    }
    display(start);
    printf("enter a element to be searched:");
    int n;
    scanf("%d",&n);
    search(n,start);
    count(start);
    return 0;
}
