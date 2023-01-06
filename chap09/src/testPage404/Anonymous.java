package testPage404;

public class Anonymous {
	// 필드 초기값으로 대입
		Person field = new Person() {  //부모타입의 필드로 만들어졌다
		String name = "안유진";

			void work() {//(2)
				System.out.println(name + "은 출근합니다.");
			}

			@Override
			void wake() {//부모꺼사용 (1)
				System.out.println(name + "은 6시에 일어납니다.");
				work();//워크 발동(2)
			}
		};

		void method1() {
			// 로컬 변수값으로 대입
			Person localVar = new Person() {
				
				void walk() {//(3)
					System.out.println("산책합니다.");
				}
				@Override
				void wake() {//(2)
					System.out.println("7시에 일어납니다.");
					walk(); //월크 발동
				}
			};
			
			localVar.wake();//로컬 웨이크발동  이게 사용되서 웨이크먼저 쓰는거구나    (1)
		}

		void method2(Person person) {
			person.wake();
		}
}
