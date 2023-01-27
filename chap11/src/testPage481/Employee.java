package testPage481;

public class Employee {
	//필드
		public int eno;
		
		//생성자
		public Employee(int eno) {
			this.eno = eno;
			System.out.println("Employee(" + eno + ") 가 메모리에 생성됨");
		}
		
		//메소드 소멸자 -finalize()
		public void finalize() { //소멸된게 어떤것이 있는지 출력
			System.out.println("Employee(" + eno + ")이 메모리에서 제거됨");
		}


}
