package day1;

public class Stars2 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) { //5번 실행한다
			for(int j=0; j<=i; j++) {  //j 작업을  
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
