class Queue
{
int que[];
final int MAX=40;
int f,r;
public Queue()
{
que=new int[MAX];
f=r=0;
}
public void enqueue(int p)
{
if(!isqueuefull())
{
que[r++]=p;
}
else
System.out.println("queue is full");
}
public int dequeue()
{
if(!isqueueempty())
{
int v=que[f++];
return v;
}
else 
return -99;
}
public boolean isqueueempty()
{
return (f==r)?true:false;
}
public boolean isqueuefull()
{
return (r==MAX)?true:false;
}
/*
public void viewqueue()
{
if(isqueueempty())
{
System.out.println("queue is empty");
return;
}
System.out.println("the content of queue is");
for(int i=f;i<=r;i++)
System.out.print(que[i]+" ");
*/
}
public class Round
{
public static void main(String[] args)
{
int btime[]={7,4,5,8};
int timeq=2;
Queue q=new Queue();
for(int i=0;i<4;i++)
q.enqueue(i);
System.out.println("order of execution of processes in queue are:");
while(!q.isqueueempty())
{
int pid=q.dequeue();
System.out.print("p "+pid+" ");
btime[pid]-=timeq;
if(btime[pid]>0)
q.enqueue(pid);
}
System.out.println(" \n execution completed");
}
}
