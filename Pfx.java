import java.util.*;
class Post
{
double stk[];
int top;
final int MAX=10;
Scanner obj;
public Post()
{
stk=new double[MAX];
top=0;
obj=new Scanner(System.in);
}
public double operation(double p,double q,char op)
{
switch(op)
{
case '^':return Math.pow(p,q);
case '*':return p*q;
case '/':return p/q;
case '+':return p+q;
case '-':return p-q;
case '%':return p/q;
}
return 0;
}
public double evalpfx(String post)
{
double x,y,z;
char ch;
for(int i=0;i<post.length();i++)
{
ch=post.charAt(i);
if(Character.isDigit(ch))
{
System.out.println("enter value for "+ch+"  ");
int val=obj.nextInt();
stk[++top]=val;
}
else
{
y=stk[top--];
x=stk[top--];
z=operation(x,y,ch);
stk[++top]=z;
}
}
return stk[top];
}
}
public class Pfx
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
Post p=new Post();
System.out.println("enter any postfix notation");
String post=s.next();
double resuilt=p.evalpfx(post);
System.out.println("the result="+resuilt);
}
}
