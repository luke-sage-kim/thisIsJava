package testPage289;
//자식클래스
public class DmbCellphone extends Cellphone {   //Cellphone을 상속받는다
	// 필드
		int channel;

		// 생성자
		public DmbCellphone(String model, String color, int channel) {
			this.model = model; //모델 생성자 선언Cellphone에서 모델가져옴
			this.color = color; //제네레이트하면 만들어짐
			this.channel = channel;
		}

		 //메소드
		void turnOnDmb() {
			System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
		}
		void changeChannelDmb(int channel) {
			this.channel = channel;
			System.out.println("채널 " + channel + "번으로 바꿉니다.");
		}
		void turnOffDmb() {
			System.out.println("DMB 방송 수신을 멈춥니다.");
		}
}
