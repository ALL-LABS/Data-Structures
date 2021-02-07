import java.util.*;
class Linear
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a[]=new int[10];
int flag=0;
System.out.println("enter n value");
int n=s.nextInt();
System.out.println("array elements are");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("enter ele to be search");
int ele=s.nextInt();
for(int i=0;i<n;i++)
{
if(a[i]==ele)
{
flag=1;
System.out.println("element found at index"+i);
}
}
if(flag==0)
System.out.println("element not found");
}
}



