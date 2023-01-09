package testPage669;

public class ChildProductAndStorageExample {
	public static void main(String[] args) {
		// 1. 제네릭 타입의 자식 클래스로부터 인스턴스 생성

		ChildProduct<Tv, String, String> product = new ChildProduct<>(); // 제네릭 생성 (1)

		product.setKind(new Tv());  
		product.setModel("smartTV");
		product.setCompany("Samsung");//세팅을하자
		
		System.out.println(product.getKind());
		System.out.println(product.getModel());
		System.out.println(product.getCompany());
		
		// Lvalue 변수 타입 자체가 인터페이스
		Storage<Tv> storage = new StorageImpl<Tv>(100); // public StorageImpl (int capacity)
			//배열 객체를
		storage.add(new Tv(), 0); // 다형성2
		Tv tv = storage.get(0); // 다형성2  꺼집어내는것을 받아라
		System.out.println(tv);
		System.out.println(storage.get(1));

		Storage<String> storage1 = new StorageImpl<String>(100); // public StorageImpl (int capacity)
		//배열 객체를
	storage1.add("Samsung", 0); // 다형성2
	String tv1 = storage1.get(0); // 다형성2  꺼집어내는것을 받아라
		System.out.println(storage1.get(0));
		
		
		
	} // main


}

class Tv{}