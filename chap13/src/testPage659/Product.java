package testPage659;
//제네릭 클래스
public class Product <T,M> {//두개이상의 멀티타입 파라미터
	private T kind;  //타입이 정해지지않은 객체
	private M model;
	
	public T getKind() {return  this.kind;}
	public M getModel() {return  this.model;}
	
	public void setKind(T kind) {this.kind = kind; }
	public void setModel(M model) {this.model = model; }
}
