package Week_01;

import java.util.*;

public class Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> queue = new LinkedList<>();
		
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine(); 
		String[] s = line.split(" ");
		
		int n = Integer.parseInt(s[0]); 
		int k = Integer.parseInt(s[1]); 
		int index = k - 1; 
		
		sb.append("<");
		for(int i = 1; i <= n; i++) { 
			queue.add(i); 
		}
		
		while(queue.size() != 1) {
            		sb.append(queue.get(index) + ", ");
            		queue.remove(index);
            		index = (index + k - 1) % queue.size();
		}
		
		sb.append(queue.poll() + ">");
		System.out.println(sb);
	}

}
