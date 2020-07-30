package Week_05;

import java.util.*;

public class BFS {
	static ArrayList<Integer>[] list;
    static int n;
    static boolean[] check;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        int start = sc.nextInt();
 
        list = new ArrayList[n + 1];
 
        for (int i = 1; i < n + 1; i++) {
            list[i] = new ArrayList<Integer>();
        }
 
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
 
            list[u].add(v);
            list[v].add(u);
        }
        for (int i = 1; i < n + 1; i++) {
            Collections.sort(list[i]);
        }
        check = new boolean[n + 1];
        DFS(start);
        System.out.println();
 
        check = new boolean[n + 1];
        BFS(start);
        System.out.println();
 
        sc.close();
    }
	
	private static void DFS(int x) {
        if (check[x]) {
            return;
        }
 
        check[x] = true;
        System.out.print(x + " ");
        for (int y : list[x]) {
            if (!check[y])
                DFS(y);
        }
 
    }
	
	private static void BFS(int start) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(start);
        check[start] = true;
 
        while (!queue.isEmpty()) {
            int x = queue.poll();
            System.out.print(x + " ");
            for (int y : list[x]) {
                if (!check[y]) {
                    check[y] = true;
                    queue.add(y);
                }
            }
        }
	}
}
