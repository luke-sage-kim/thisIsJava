package testPage469;

public class MemberExample {
	public static void main(String[] args) {
		//원본 객체 생성
		//이때 들어갈 매개변수들 중, scores랑 car는 참조 객체이니까 new 붙여야,,?
		Member original = new Member("홍길동", 25, new int[] {90,90}, new Car("소나타"));
		
		//복제 객체를 얻은 후 참조 객체 값 변경해주기
		Member cloned = original.getMember(); //깊은 복제한 복제 객체 얻어옴
		cloned.scores[0] = 100; //배열의 0번째 인덱스를 100으로 변경
		cloned.car.model = "그랜저"; //차량 타입을 model로 변경
		
		//복제 객체 필드값 출력
		System.out.println("[복제 객체의 필드값]");
		System.out.println("name : " + cloned.name);
		System.out.println("age : " + cloned.age);
		
		System.out.print("scores : {");
		for(int i=0 ; i<cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i==(cloned.scores.length-1))?"":",");
		}
		
		System.out.println("}");
		System.out.println("car : " + cloned.car.model);
		System.out.println();
		
		//원본 객체 필드값 출력
		System.out.println("[원본 객체의 필드값]");
		System.out.println("name : " + original.name);
		System.out.println("age : " + original.age);
		
		System.out.print("scores : {");
		for(int i=0 ; i<original.scores.length; i++) {
			System.out.print(original.scores[i]);
			System.out.print((i==(original.scores.length-1))?"":",");
		}
		System.out.println("}");
		System.out.println("car : " + original.car.model);
	}


}