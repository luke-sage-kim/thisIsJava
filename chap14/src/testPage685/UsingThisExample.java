package testPage685;

public class UsingThisExample {
	public static void main(String[] args) {
		UsingThis usingThis = new UsingThis();//이거 만든이유가 아래꺼 써야되서 한거임
		UsingThis.Inner inner = usingThis.new Inner();
		inner.method();
	}
}
