package testPage591;

public class Calculator {
	// 592페이지
	private int memory;

	public int getMemory() {
		return memory;
	}

	public void setmemory(int memory) { //계산기 메모리에 값을 저장하는 메소드
		this.memory = memory;   //매개값을 메모리 필드에 저장
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}

		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}

	// 595페이지
//private int memory;
//	
//	public int getMemory(){
//		return memory;
//	}
//	
//	public synchronized void setmemory(int memory){
//		this.memory = memory;
//		try{
//			Thread.sleep(2000);
//		}catch(InterruptedException e){}
//		
//		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
//	}
}
