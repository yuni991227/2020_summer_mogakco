package Week_03;

import java.util.*;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> queue = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); //명령의 수 입력
		int add_num = 0; //큐에 추가할 숫자를 저장하는 변수
		for(int i = 0; i < num; i++) { //명령의 수만큼 반복
			String input = sc.next(); //명령어 입력(push, pop, size, empty, front, back 중 하나)
			
			if(input.equals("push")) { //입력이 push 일 때
				add_num = sc.nextInt(); //큐에 추가할 숫자 입력
				queue.add(add_num); //큐에 숫자 추가
			}
			
			else if(input.equals("pop")) { //입력이 pop 일 때
				System.out.println(queue.isEmpty()? -1 : queue.poll()); //큐가 비었으면 -1, 아니면 큐의 첫 번째 원소 출력 후 제거
			}
			
			else if(input.equals("size")) { //입력이 size 일 때
				System.out.println(queue.size()); //큐의 원소의 갯수 출력
			}
			
			else if(input.equals("empty")) { //입력이 empty 일 때
				System.out.println(queue.isEmpty()? 1 : 0); //큐가 비었으면 1, 아니면  0 출력
			}
			
			else if(input.equals("front")) { //입력이 front 일 때
				System.out.println(queue.isEmpty()? -1: queue.peek()); //큐가 비었으면 -1, 아니면 큐의 첫 번째 원소 출력
			}
			
			else if(input.equals("back")) { //입력이 back 일 때
				System.out.println(queue.isEmpty()? -1 : add_num); //큐가 비었으면 -1, 아니면 큐의 마지막 원소 출력
			}
		}
	}
}