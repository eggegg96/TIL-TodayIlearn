package day1;

public class Stars {

	public static void main(String[] args) {
		int n = 1;
		for(int i=0; i<5; i++) { //5번 실행한다
			for(int j=0; j<n; j++) {  //j 작업을  
				System.out.print("*");
			}
			System.out.println();
			n++;
		}
	}

}
