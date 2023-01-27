package testPage469;

import java.util.Arrays;
//클론을 재정의해서 깊은 복제로 변경
public class Member	implements Cloneable{ //Cloneable 인터페이스 구현하는 클래스
		
		//필드
		public String name; //이름
		public int age; //나이
		
		//참조 타입 필드 (깊은 복제의 대상이됨!!!!)
		public int[] scores; //배열타입의 점수
		public Car car; //Car 클래스
		
		//생성자
		public Member(String name, int age, int[] scores, Car car) {
			this.name = name;
			this.age = age;
			this.scores = scores;
			this.car = car;
		}
		
		//얕은 복제 한번 해주기!
		//깊은 복제를 하기 위해서는 얕은 복제를 한번 한 후, Object의 clone()메소드를 오버라이딩 해야함
		//이 Override를 하지 않을 경우, 아래 나올 Override는 얕은복제가 되어버림
		@Override
		public Object clone() throws CloneNotSupportedException{ //예외 떠넘기기 (getMember()메소드에서 예외 처리해야함)
			//먼저 얕은 복사를 해서 name, age 복제하기
			Member cloned = (Member) super.clone(); //Object의 clone()메소드 쓰기위해 super를 사용
			//그다음 scores 복제
			cloned.scores = Arrays.copyOf(this.scores, this.scores.length); //복제된 배열에는 arrays.copyof 메소드 이용
			//그다음 car 복제
			cloned.car = new Car(this.car.model);
			//깊은 복제된 Member 객체 리턴하기
			return cloned;
		}
		
		//이제 깊은 복제 할 차례!!!!
		public Member getMember() {
			Member cloned = null;
			try { //예외 발생 가능 코드 작성하기
				cloned = (Member) clone(); //clone()메소드가 Object 타입이니까 Member 타입으로 강제 변환
			}catch(CloneNotSupportedException e) { //예외 처리하기
				e.printStackTrace();
			}
			return cloned; //cloned값 리턴해주기
		}
	


}