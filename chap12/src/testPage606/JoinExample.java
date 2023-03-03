package testPage606;
// 다른 스레드가 종료될 떄까지 일시 정지 상태 유지
public class JoinExample {
	public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();//섬스레드 시작
        
        try {
            sumThread.join();    // sumThread가 종료할 때까지 메인 스레드를 일시 정지시킴
        } catch(InterruptedException e) {
        }
        
        System.out.println("1~100 합: " + sumThread.getSum());
    }
}
//메인은 합을 출력해서 보여주는거고 섬스레드는 계산을하는거니까
//섬스레드 종료될때까지 메인을 일시정지 시켜주어야하는듯