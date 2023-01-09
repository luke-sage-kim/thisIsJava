package testPage664;

public class BoundedTypeParameterExample {
	 public static void main(String[] args) {
	        //String str = Util.compare("a", "b");	(x) -> String은 Number 타입이 아니다
	        
	        int result1 = Util.compare(10, 20);	//int -> Integer (자동 Boxing)
	        System.out.println(result1);
	        
	        int result2 = Util.compare(4.5, 3);	//double -> Double (자동 Boxing)
	        System.out.println(result2);
	    }
}

//메소드 첫번째 매개값이 작으면 -1 같으면 0 크면 1
