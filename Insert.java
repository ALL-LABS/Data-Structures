//Insertion sort
class Insert
{
public static void main(String[] args)
{
int j,temp;
int[] a={5,1,6,2,4,3};
for(int i=1;i<a.length;i++)
{
temp=a[i];
j=i;
while(j>0 && a[j-1]>temp)
{
a[j]=a[j-1];
j=j-1;
}
a[j]=temp;
}
System.out.println("after sorting");
for(int i=0;i<a.length;i++)
System.out.print(a[i]+ " ");
}
}
