package Week_01;

import java.util.*;

public class Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> queue = new LinkedList<>();
		
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine(); //숫자 입력(2개)
		String[] s = line.split(" "); //빈 칸으로 입력을 나눔
		
		int n = Integer.parseInt(s[0]); //사람의 수
		int k = Integer.parseInt(s[1]); //k번째 사람을 제거
		int index = k - 1; //제거할 사람의 인덱스
		
		sb.append("<");
		for(int i = 1; i <= n; i++) { //입력한 사람의 수만큼 반복
			queue.add(i); //1부터 n까지 큐에 추가
		}
		
		while(queue.size() != 1) { //큐의 크기가 1이 아닐 때까지
            sb.append(queue.get(index) + ", "); //index에 해당하는 사람 sb에 추가
            queue.remove(index); //index에 해당하는 사람 큐에서 제거
            index = (index + k - 1) % queue.size(); //index 조정
		}
		
		sb.append(queue.poll() + ">"); //마지막에 남은 사람 sb에 추가
		System.out.println(sb); //콘솔에 sb 출력
	}

}
