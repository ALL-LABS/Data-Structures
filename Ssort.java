import java.util.*;
//Selection Sort
public class Ssort
{
public static void main(String[] args)
{
int[] a;
Scanner s=new Scanner(System.in);
System.out.println("enter the size");
int n=s.nextInt();
a=new int[n];
System.out.println("enter array elements");
int i;
for(i=0;i<n;i++)
a[i]=s.nextInt();
System.out.println("\n before sorting...");
display(a,n);
sort(a,n);
System.out.println("\n after sorting...");
display(a,n);
}
public static void sort(int a[],int n)
{
int i,j,temp,min;
for(i=0;i<n;i++)
{
min=i;
for(j=i+1;j<n;j++)
{
if(a[min]>a[j])
min=j;
}
if(min!=i)
{
temp=a[min];
a[min]=a[i];
a[i]=temp;
}
}
}
public static void display(int a[],int n)
{
for(int i=0;i<n;i++)
System.out.print(a[i]+" ");
}
}
