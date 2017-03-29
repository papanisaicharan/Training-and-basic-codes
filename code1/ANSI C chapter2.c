// all these are different programs ,there totally 5 different programs in this file
#include<stdio.h>
#include<conio.h>
//sum of hp series
void main()
{
 int n;
 float sum=0,i=1;
 printf("enter the value of n=");
 scanf("%d",&n);
 while(i<=n)
 {
     sum=sum+(1/i);
     i=i+1;
 }
 printf("sum of hp series till %d numbers is=%f",n,sum);
 getch();
}
//---------------------------------------------------------------------------
#include<stdio.h>
#include<conio.h>
//conversion of rupees to paise
void main()
{
    float n;
    printf("enter the value in rupees of n=");
    scanf("%f",&n);
    int i=n*100;
    printf("value of %4.2f ruppes in paise  is =%d",n,i);
    getch();
}
//---------------------------------------------------------------------------------------
#include<stdio.h>
#include<conio.h>
//even numbers less than 100
void main()
{
    int i=0;
 while(i<=100)
 {
     if(i%2==0)
     {
        printf("%d\n",i);
     }
     i++;
 }
}
//------------------------------------------------------------------------------
#include<stdio.h>
#include<conio.h>
//simple division
void main()
{
    printf("enter two numbers:");
    float x,y;
    scanf("%f%f",&x,&y);
    float c=x/y;
    printf("result of their division is=%f",c);
}
//----------------------------------------------------------------------------
#include<stdio.h>
#include<conio.h>
//enter the value and print them in specified order
void main()
{
 float x,y;
 printf("enter the values of prices of sugar and rice\n");
 printf("\t***LIST OF ITEMS***\n");
 printf("\tItem\tPrice\n\tRice\t");
 scanf("%f",&x);
 printf("\tSugar\t");
 scanf("%f",&y);
 printf("\t***LIST OF ITEMS***\n");
 printf("\tItem\tPrice\n");
 printf("\tRice\t%f\n",x);
 printf("\tSugar\t%f\n",y);
}
//----------------------------------------------------------------------
