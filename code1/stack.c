#include<stdio.h>
#include<stdlib.h>
#define MAX 15
#include<conio.h>
#include"stack.h"
void main(){
STACK* stack;
stack=createstack();
int n;
printf("enter the number of elements to be pushed into stack=");
scanf("%d",&n);
int i,p[n];
for(i=0;i<n;i++)
{
    printf("enter the number to be pushed and press enter=");
    scanf("%d",&p[i]);
    int a1=pushstack(stack,&p[i]);
    if(a1==1)
    {
        printf("element pushed\n");
    }
    else
    printf("failed to push\n");
}

for(i=0;i<n;i++)
{
printf("do u want to pop the elements,then press 1 or else 0 to exit=");
int n1;
scanf("%d",&n1);
if(n1==1)
{

   int* p=(int*) popstack(stack);

   printf("poped element is=%d\n",*p);
}
else{
    exit(0);
}
}
}




