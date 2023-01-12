package s5;

import java.util.*;

public class P2563 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//흰색 도화지 배열로 생성: 100 * 100
		int[][] paper = new int[100][100];
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			//입력받은 (x, y)기준으로 10*10 검은색 색종이 붙이기
			//0: 흰색, 1: 검은색
			for (int a = x; a < x + 10; a++) {
				for (int b = y; b < y + 10; b++) {
					//검은색(1)으로 변경
					paper[a][b] = 1;
				}	
			}
		}
		
		int result = 0;
		//도화지 전체에서 검은색(1)인 부분을 카운트
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				//해당 부분이 검은색인 경우 참
				if (paper[i][j] == 1) {
					result++;
				}
			}	
		}
		
		//output
		System.out.println(result);
	}
}
