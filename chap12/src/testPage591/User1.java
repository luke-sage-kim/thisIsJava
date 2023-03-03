package testPage591;

public class User1 extends Thread{
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	@Override
	public void run() {		//공유객체인 calculator 메모리 100 저장
		calculator.setmemory(100);
	}
}