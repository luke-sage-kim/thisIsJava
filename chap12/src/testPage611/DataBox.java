package testPage611;

// 두 스레드의 작업 내용을 동기화 메소드로 작성한 공유 객체
public class DataBox {
	private String data;

	public synchronized String getData() {
		if (this.data == null) {	// data필드가 null 이면 소비자 스레드를 일시정지상태로 만듬
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		String returnValue = data;
		System.out.println("ConsummerThread가 읽은 데이터" + returnValue);
		data = null;
		notify();
		return returnValue;
	}//data필드를 null로 만들고 생산자 스레드를 실행 대기 상태로 만듬


	public synchronized void setData(String data) {
		if (this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO: exception
			}
		}

		this.data = data;
		System.out.println("ProducerThread가 읽은 데이터" + data);
		notify();
	}

}
