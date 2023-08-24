package day1;

public class Stars3 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) { // 아래 들여쓰기 된 for문을 5회 반복한다.
			
			//스페이스는 0개부터 시작하고 (횟수-1)까지 1개씩 점진적으로 실행된다.
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			//별은 5개부터 시작하고 i값보다 클 때까지 1개씩 감소되며 실행된다.
			for(int k=5; k>i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
