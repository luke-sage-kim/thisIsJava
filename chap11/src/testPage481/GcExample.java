package testPage481;

public class GcExample {
	public static void main(String[] args) {
		//Employee 객체생성후 값 넣기
		Employee em = new Employee(1);
		
		//객체 em에 null 대입하기 -> em은 번지를 잃고, 더이상 그 객체em은 사용 불가
		em = null;

		//객체 em에 다른 객체 참조하기 -> em이 번지를 잃어서, 더이상 객체em은 사용 불가
		em = new Employee(2);
		em = new Employee(3);
		
		System.out.println("em이 최종적으로 참조하는 사원번호 : " + em.eno);
		System.gc(); //gc()메소드 호출할 경우, 소멸자인 finalize()까지 호출됨
		   			 //즉, 제거된 사원번호 2와 1을 호출해서 출력해줌
	}


}