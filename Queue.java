package Week_03;

import java.util.*;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> queue = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int add_num = 0;
		for(int i = 0; i < num; i++) {
			String input = sc.next();
			
			if(input.equals("push")) {
				add_num = sc.nextInt();
				queue.add(add_num);
			}
			
			else if(input.equals("pop")) {
				System.out.println(queue.isEmpty()? -1 : queue.poll());
			}
			
			else if(input.equals("size")) {
				System.out.println(queue.size());
			}
			
			else if(input.equals("empty")) {
				System.out.println(queue.isEmpty()? 1 : 0);
			}
			
			else if(input.equals("front")) {
				System.out.println(queue.isEmpty()? -1: queue.peek());
			}
			
			else if(input.equals("back")) {
				System.out.println(queue.isEmpty()? -1 : add_num);
			}
		}
	}
}
