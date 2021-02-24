import java.util.*;
class Binary
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter n value");
int n=s.nextInt();
int a[]=new int[10];
System.out.println("Enter array elements");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("enter search element");
int se=s.nextInt();
int f=0;
int m;
int l=a.length-1,flag=0;
while(f<=l)
{
m=(f+l)/2;
if(se<a[m])
l=m-1;
else if(se>a[m])
f=m+1;
else
{
System.out.println("element found at index"+m);
flag=1;
break;
}
}
if(flag==0)
System.out.println("element not found");
}
}
