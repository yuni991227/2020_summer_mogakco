package Week_02;

import java.util.*;

public class BST {
	private static int cnt = 0;
	private int key;
	private BST left, right;

	public BST() {
		left = right = this;
	}

	public BST(int key) {
		this.key = key;
		left = right = null;
	}

	public BST(int key, BST left, BST right) {
		this.key = key;
		this.left = left;
		this.right = right;
	}

	public void insert(int x) {
		// 공백트리일 때 삽입 조건
		if (left == this && right == this) {
			this.key = x;
			this.left = null;
			this.right = null;
		}
		if (x < this.key) {
			cnt++;
			if (left != null) {
				left.insert(x);
			} else {
				left = new BST(x);
			}
		} else if(x > this.key){
			cnt++;
			if (right != null) {
				right.insert(x);
			} else {
				right = new BST(x);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST tree = new BST();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			int input = sc.nextInt();
			tree.insert(input);
			System.out.println(cnt);
		}
	}

}
