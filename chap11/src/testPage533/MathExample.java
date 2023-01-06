package testPage533;

public class MathExample {
	public static void main(String[] args) {
		//Math.abs() - 절대값을 구하는 메소드
		//:파라메터가 int, double 처럼 다르면 다른 메소드이다. 이름은 같다. :overload라고 한다.
		int v1= Math.abs(-5);
		double v2 = Math.abs(-3.14);   //abs absolute
		System.out.println("v1=" + v1); //5
		System.out.println("v2=" + v2); //3.14
		
		System.out.println();
		
		//Math.ceil() -  소수점 이하에서 올림을 한다.
		double v3 =Math.ceil(5.3);// ceil올림
		double v4 =Math.ceil(-5.3);
		System.out.println("v3=" + v3); //6.0
		System.out.println("v4=" + v4); // -5.0
		
		System.out.println();
		
		//Math.floor() - 소수점 이하에서 내림을 한다.
		double v5 =Math.floor(5.3);
		double v6 =Math.floor(-5.3);
		System.out.println("v5=" + v5); //5.0
		System.out.println("v6=" + v6); //-6.0
		
		
		System.out.println();

		//Math.max() - 2개의 숫자 중에서 최대값을 구한다.
		int v7 =Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7=" + v7); //9
		System.out.println("v8=" + v8); //5.3
		
		System.out.println();

		
		//Math.min() - 2개의 숫자 중에서 최소값을 구한다.
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9=" + v9); //5
		System.out.println("v10=" + v10); //2.5
		
		System.out.println();

		
		//Math.random() - 0 <= r <1 사이의 랜덤 double 숫자를 준다.
		double v11 = Math.random();
		System.out.println("v11=" + v11);
		
		System.out.println();

		
		//Math.rint() - 근접한 int 값에 맞는 double 값을 준다. -> 반올림에 적용된다.
		double v12 =Math.rint(5.3);
		double v13 =Math.rint(5.7);
		System.out.println("v12=" + v12);//5.0
		System.out.println("v13=" + v13);//6.0
		System.out.println();

		//Math.round() - 반올림 - 무조건 소수점 아래서 반올림한다.
		long v14 = 	Math.round(5.3); 
		long v15 = 	Math.round(5.7); 
		System.out.println("v14=" + v14);//5
		System.out.println("v15=" + v15);//6
		System.out.println();

		// 소숫점 3째 자리에서 반올림해서 2째짜리 까지 표시
		double value = 12.3456;
		//System.out.println(Math.round(value*100)/100.0);
		double temp1 = value*100;
		long temp2 = Math.round(temp1);
		double v16 = temp2/100.0;
		System.out.println("v16=" + v16);//12.35
		
		
		
		//0~9 사이의 랜덤 숫자. - 10개의 데이터 -> int data 
		System.out.println((int)(v11 * 10));
		//1~10 사이 데이터
		System.out.println((int)(v11 * 10) + 1);
		//1~45 : 로또
		System.out.println((int)(v11 * 45) + 1);
	}


}
