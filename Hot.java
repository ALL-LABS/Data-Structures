import java.util.Queue;
import java.util.LinkedList;
class Hot
{
	public static String hotpotato(String[] names,int num) {
		//System.out.println("Hello World");
		Queue<String> gameQueue=new LinkedList<String>();
		int num1=names.length;
		for(int i=0;i<num1;i++)
		{
		    gameQueue.add(names[i]);
		}
		while(gameQueue.size()>1)
		{
		for(int i=0;i<num;i++)
		{
		    gameQueue.add(gameQueue.peek());
		    gameQueue.poll();
		}
		gameQueue.poll();
			}
	return gameQueue.peek();

}
public static void main(String[] args)
{
    String[] names={"A","B","C","D","E","F"};
    System.out.println(hotpotato(names,7));
}
}


