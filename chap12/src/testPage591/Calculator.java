package testPage591;

public class Calculator {
	//592페이지
	 //private int memory;
	  
	  //public int getMemory(){ return memory; }
	  
	  //public void setmemory(int memory){ this.memory = memory; try{
	  //Thread.sleep(2000); }catch(InterruptedException e){}
	  
	  //System.out.println(Thread.currentThread().getName() + ": " + this.memory); }
	
	//595페이지
private int memory;
	
	public int getMemory(){
		return memory;
	}
	
	public synchronized void setmemory(int memory){
		this.memory = memory;
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){}
		
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}
