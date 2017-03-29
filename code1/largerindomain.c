 #include <iostream>
//wap to read n numbers ,display the largest number b/t 4 numbers 3,2, by using switch case statements
using namespace std;
class hi1
{
private:
    int a[4];
public :
    void input()
    {
        for(int i=0;i<=3;i++)
    {
     cin>>a[i];
    }
    }
    void swap(int l)
    {
        int b[l];
            for(int i=0;i<=l-1;i++)
            {
            b[i]=a[i];
            }
            for(int i=l-2;i>=0;i--)
            {
            for(int j=0;j<=i;j++)
            {
          if(b[j]>b[j+1])
          {
              int k;
              k=b[j];
              b[j]=b[j+1];
              b[j+1]=k;

          }
            }
            }
            cout<<b[l-1];
    }
    void largest(int k)
    {
        switch(k)
        {
            case 1:
                swap(4);
                break;
            case 2:
                 swap(3);
                   break;
            case 3:
                 swap(2);
                   break;
            case 4:
                  swap(1);
                    break;
        }
    }
};
int main()
{
   cout<<"enter the 4 values";
   hi1 a;
   a.input();
   cout<<"select a case to find largest of 4 numbers- (1),largest of 3 numbers (2)..";
   int i;
   cin>>i;
   a.largest(i);
    return 0;
}
