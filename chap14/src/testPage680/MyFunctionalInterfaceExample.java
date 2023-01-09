package testPage680;
//람다식
public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {

		MyFunctionalInterface fi;

		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();//메소드를 호출하여 실행시킨다

		fi = () -> {
			System.out.println("method call2");
		};//중괄호있는거
		fi.method();

		fi = () -> System.out.println("method call3");//중괄호없는거
		fi.method();
	}

}
