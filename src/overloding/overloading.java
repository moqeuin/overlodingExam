package overloding;

class MyMath{
	
	public MyMath() {
	
	}
	
	int add(int a, int b) {
		System.out.println("add(int a, int b) 실행");
		return a + b;
	}
	
	double add(double a, int b) {
		System.out.println("double add(double a, int b) 실행");
		return a + b;
	}
	
	int add(int a, int b, int c) {
		System.out.println("int add(int a, int b, int c) 실행");
		return a + b + c;
	}	
}

public class overloading {

	public static void main(String[] args) {
		/*
		 	오버 로딩:
		  	한 클래스 내에서 매개변수의 갯수와 타입으로 구별해서 
		  	같은 이름의 여러 개의 메서드를 정의한 것 
		 
		 */
		
		MyMath mm = new MyMath();
		
		mm.add(2, 3);
		mm.add(24.5, 21);
		mm.add(1, 3, 19);
		
		/*
		 	출력문 : 
			add(int a, int b) 실행
			double add(double a, int b) 실행
			int add(int a, int b, int c) 실행		
		*/
	}
}
