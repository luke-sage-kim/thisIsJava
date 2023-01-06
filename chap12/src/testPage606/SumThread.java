package testPage606;

public class SumThread extends Thread {
 
    private long sum;
    
    
    public long getSum() {  //조인으로 보내기
        return sum;
    }
    
    public void setSum(long sum) {
        this.sum = sum;
    }
    

    public void run() {
        for(int i=1; i<=100; i++) {
            sum+=i;
        }
    }
}
