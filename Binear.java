import java.util.*;
//Binear Search
class Binear
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a[]={12,27,39,45,56,60};
int se;
int l=0,h=a.length-1;
int flag=0,mid;
System.out.println("enter searching element");
se=s.nextInt();
while(l<=h)
{
mid=(l+h)/2;
if(se<a[mid])
h=mid-1;
else if(se>a[mid])
l=mid+1;
else
{
flag=1;
System.out.println("element found"+mid);
break;
}
}
if(flag==0)
System.out.println("element not found");
}
}