import java.util.*;
//Quick Sort
class Quick
{
public static void main(String[] args)
{
int a[]=new int[20];
Scanner s=new Scanner(System.in);
int i,n;
System.out.println("enter n value");
n=s.nextInt();
System.out.println("enter array elemnts");
for(i=0;i<n;i++)
a[i]=s.nextInt();
quicksort(a,0,n-1);
System.out.println("elements after sorting");
for(i=0;i<n;i++)
System.out.println(a[i]);
}
static void quicksort(int a[],int f,int l)
{
int i,j,p,t;
if(f<l)
{
p=f;
i=f;
j=l;
while(i<j)
{
while(a[i]<=a[p] && i<l)
i++;
while(a[j]>a[p])
j--;
if(i<j)
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
t=a[p];
a[p]=a[j];
a[j]=t;
quicksort(a,f,j-1);
quicksort(a,j+1,l);
}
}
}
