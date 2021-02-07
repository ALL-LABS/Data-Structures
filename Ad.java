import java.util.*;
class Array
{
Scanner s=new Scanner(System.in);
int a[]=new int[20];
int n;
void create()
{
System.out.println("enter n value");
n=s.nextInt();
for(int i=0;i<n;i++)
a[i]=s.nextInt();
}
void display()
{
System.out.println("elements are");
for(int i=0;i<n;i++)
System.out.println(a[i]);
}
void insert()
{
int p,e;
System.out.println("enter position");
p=s.nextInt();
System.out.println("enter ele to be inserted");
e=s.nextInt();
for(int i=n-1;i>=p;i--)
a[i+1]=a[i];
a[p]=e;
n++;
display();
}
void delete()
{
int p;
System.out.println("enter pos to be deleted");
p=s.nextInt();
for(int i=p;i<n-1;i++)
a[i]=a[i+1];
n--;
display();
}
}
class Ad
{
public static void main(String[] args)
{
Array obj=new Array();
obj.create();
obj.display();
obj.insert();
obj.delete();
}
}
