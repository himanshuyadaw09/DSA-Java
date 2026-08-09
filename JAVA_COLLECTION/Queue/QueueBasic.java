import java.util.*;
public class QueueBasic{
	public static void main(String[] args){ 

		Queue<Integer> q = new LinkedList<>();

		// offer() -> return false if insertion fails
		// add() -> throw ecpection(error) if insertion fails 

		q.offer(4);
		q.offer(3);
		q.offer(10);
		q.offer(8);

		System.out.println(q);

		q.add(3);
		q.add(9);
		q.add(11);

		System.out.println(q);
	}
}