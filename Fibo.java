import java.util.*;
class Fibo
{
public static int fibsrh(int a[],int n,int key)
{
int initpos=0,pos,k;
int fib[]={0,1,2,3,5,8,13,21,34,55,89,114};
if(n==-1)
return -1;
k=0;
while(fib[k]<n)
k++;
while(k>0)
{
pos=initpos+fib[--k];
if(key==a[pos])
return pos;
else if(key>a[pos])
{
initpos=pos+1;
k--;
}
else
continue;
}
return -1;
}
public static void main(String[] args)
{
int a[];
Scanner s=new Scanner(System.in);
System.out.println("enter n value");
int n=s.nextInt();
a=new int[n];
System.out.println("enter elements");
for(int i=0;i<n;i++)
a[i]=s.nextInt();
System.out.println("array elements are");
for(int i=0;i<n;i++)
System.out.println(a[i]+" ");
System.out.println("enter element to be search");
int key=s.nextInt();
//key=Integer.parseInt(args[0]);
int pos=fibsrh(a,n,key);
if(pos==-1)
System.out.println("no such item found");
else
System.out.println("key found at location:"+pos);
}
}
