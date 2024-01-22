package collection_Framework;
import java.util.*;
public class Priority_Queue {
	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.add(50);
		pq.add(20);
		pq.add(40);
		pq.add(30);
		pq.add(10);
		System.out.println(pq);
		PriorityQueue pq1=new PriorityQueue();
		pq1.add("java");
		pq1.add("sql");
		pq1.add("html");
		pq1.add("css");
		System.out.println(pq1);
	}
}
