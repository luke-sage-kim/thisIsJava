package testPage595;

public class Calculator {
	private int memory;
	
	public int getMemory(){
		return memory;
	}
	
	public synchronized void setmemory(int memory){
										//공유객체인 Calculator의 참조
		this.memory = memory;
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){}
		
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
}
}