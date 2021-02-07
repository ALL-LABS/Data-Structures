import java.util.*;
//Queue
class Queue
{
int f,r,max;
Scanner s=new Scanner(System.in);
int stk[];
Queue()
{
max=5;
f=r=-1;
stk=new int[max];
}
void enqueue(int e)
{
if(!isFull())
{
stk[++r]=e;
if(f==-1)
f++;
}
else
System.out.println("queue is full");
}
void dequeue()
{
if(!isEmpty())
{
System.out.println("deleted element"+stk[f]);
if(f==r)
f=r=-1;
else
f++;
}
else
System.out.println("queue is empty");
}
/*
int peek()
{
if(!isEmpty())
return stk[top];
else
return -1;
}
*/
boolean isEmpty()
{
if(f==-1)
return true;
else
return false;
}
boolean isFull()
{
if(r==max-1)
return true;
else
return false;
}
void display()
{
if(!isEmpty())
{
for(int i=f;i<=r;i++)
System.out.println(stk[i]);
}
else
System.out.println("queue is empty");
}
}
class Queue1
{
public static void main(String[] args)
{
Queue x=new Queue();
Scanner s=new Scanner(System.in);
int ch;
while(true)
{
System.out.println("enter your choice");
ch=s.nextInt();
switch(ch)
{
case 1:x.enqueue(s.nextInt());
        break;
case 2:x.dequeue();
         break;
//case 3:System.out.println(x.peek());
  //      break;
case 3:x.display();
         break;
default:
return;
}
}
}
}
