//cannot be compiled directly it contain different programs ,almost 15 ,divide and check it
//1)print mail address as follows
#include<stdio.h>
void main()
{
    printf("      %s","first line");
    printf("%10c",':');
    printf("      %s","saicharan");
    printf("\n      %s","second line");
    printf("%9c",':');
    printf("      %s","HNO-10-193/A,kkkk");
    printf("\n      %s","third line");
    printf("%10c",':');
    printf("      %s","eeeeeeeee,111111");
}
----------------------------------------------------------------------
//2)print the border lines for above
#include<stdio.h>
void main()
{
    printf("      ______________________________________________\n");
    printf("     %s","| first line");
    printf("%10c",':');
    printf("      %s","saicharan");
    printf("%11c",'|');
    printf("\n     %s","| second line");
    printf("%9c",':');
    printf("      %s","HNO_15-193/A,ngkl  |");
    printf("\n     %s","| third line");
    printf("%10c",':');
    printf("      %s","mahabubnagar,509209|");
    printf("\n     |______________________________________________|\n");
    getch();
}
----------------------------------------------------------------------
//3)print a pattern
#include<stdio.h>
void main()
{
    int i=1,j=1;
    while(i<=4)
    {
        while(i>=j)
        {
            printf("* ");
              j=j+1;
        }
        j=1;
        i=i+1;
        printf("\n");
    }

}
---------------------------------------------------------------------
//4)print the following pattern
#include<stdio.h>
void main()
{
    printf("\n");
    printf("%s","         ______                     ______\n");
    printf("%s","        |______|  >>------>  |______|\n");
}
--------------------------------------------------------------------
//5)area of circle ,given radius
#include<stdio.h>
#define PI 3.141
void main()
{
int radius=3;
float area;
area=PI*radius*radius;
printf("%4.4f",area);

}
--------------------------------------------------------------------
//6)print the table of 5
#include<stdio.h>
void main()
{
    int i=1;
    while(i<=10)
    {
       printf("5 x %d",i);
       i=i+1;
        printf("\n");
    }

}
------------------------------------------------------------------
//7)addition and subtraction using the functions
#include<stdio.h>
int add(int ,int );
int sub(int ,int );
void main()
{
int a=20,b=10;
int c=add(a,b);
printf("%d + %d = %d\n",a,b,c);
int p=sub(a,b);
printf("%d - %d = %d",a,b,p);

}
int add(int a ,int b)
{
    int c=a+b;
    return c;
}
int sub(int a,int b)
{
    int c=a-b;
    return c;
}
-----------------------------------------------------------------------
//8)calculate the value of x given equation of x
#include<stdio.h>
void main()
{
    int a=300,b=85,c=85;
    float x;
    x=a/(b-c);
    printf("%f",x);
}
----------------------------------------------------------------------
//9)conversion of celsius to fahrenheit or reverse
#include<stdio.h>
void main()
{
 float f,c=10;
 f=(9*c)/5+32;
 printf("%f",f);
 //c=(f-32)*5/9;
 //printf("%f",c);
}
--------------------------------------------------------------------
//10)area of triangle using a formulea
#include<stdio.h>
#include<math.h>
#include<conio.h>
void main()
{
    int a=3,b=4,c=5;
   float s;
    s=(a+b+c)/2;
    printf("%f",s);
    float p=sqrt(s*(s-a)*(s-b)*(s-c));
    printf("area:%f",p);
}
-------------------------------------------------------------------
//11)distance b/w two points
#include<stdio.h>
#include<math.h>
#include<conio.h>
void main()
{
   int x1=3,x2=4,y1=5,y2=5;
   float p=sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
   printf("area:%f",p);

}
------------------------------------------------------------------
//12)given center and a point on circumference find radius,perimeter and area
#include<stdio.h>
#include<math.h>
#include<conio.h>
void main()
{
   int x1=0,x2=4,y1=0,y2=5;
   float p=sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
   printf("radius:%f\n",p);
   printf("perimeter:%f\n",2*3.14*p);
   printf("area:%f\n",3.14*p*p);

}
-----------------------------------------------------------------
//13)given ends of diameter find the area
#include<stdio.h>
#include<math.h>
#include<conio.h>
void main()
{
   int x1=2,x2=5,y1=2,y2=6;
   float p=sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
   printf("radius:%f\n",p/2);
   printf("area:%f\n",3.14*(p/2)*(p/2));
}
------------------------------------------------------------------
//14)display the equation of given form
#include<stdio.h>
#include<math.h>
#include<conio.h>
void main()
{
  int a=5,b=8,c=18;
  printf("%dx + %dy = %d",a,b,c);
}
----------------------------------------------------------------
//15)program to display the following simple calculator
#include<stdio.h>
void main()
{
    int x=4,y=2;
    printf("\n\n%s","                         ___________                    ___________\n");
    printf("                        |           |                  |           |");
    printf("\n              x=");
    printf("        |     %d     |     y=           |     %d     |\n",x,y);
    printf("%s","                        |___________|                  |___________|\n");//
     printf("\n\n\n\n%s","                         ___________                    ___________\n");
    printf("                        |           |                  |           |");
    printf("\n              sum=");
    printf("      |     %d     |     difference=  |     %d     |\n",x+y,x-y);
    printf("%s","                        |___________|                  |___________|\n");
     printf("\n\n\n\n%s","                         ___________                    ___________\n");//
    printf("                        |           |                  |           |");
    printf("\n              product=");
    printf("  |     %d     |     division=    |     %d     |\n",x*y,x/y);
    printf("%s","                        |___________|                  |___________|\n\n\n");
}
----------------------------------------------------------------------
