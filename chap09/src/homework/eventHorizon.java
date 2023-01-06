package homework;

public class eventHorizon {
	void verse1() {
		YounHa song = new YounHa() {
			void sing() {
				System.out.println("1절을 부릅니다.");
				chorus();
			}
		};
		song.sing();
	}

	void verse2() {
		YounHa song = new YounHa() {
			void sing() {
				System.out.println("2절을 부릅니다.");
				chorus();
				bridge();
			}
		};
		song.sing();
	}

	void chorus() {
		System.out.println("후렴을 부릅니다.");
	}

	void bridge() {
		System.out.println("브릿지를 부릅니다.");
	}

}
