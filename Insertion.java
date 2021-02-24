import java.util.*;
class Insertion
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter n value");
int n=s.nextInt();
int a[]=new int[10];
int j,temp; 
System.out.println("enter array elements");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=1;i<n;i++)
{
temp=a[i];
j=i;
while(j>0 && a[j-1]>temp)
{
a[j]=a[j-1];
j--;
}
a[j]=temp;
}
System.out.println("after sorting");
for(int i=0;i<n;i++)
System.out.print(a[i]+" ");
}
}
