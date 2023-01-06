package testPage659;
//제네릭 객체 생성
public class ProductExample{
	public static void main(String[] args) {
		

	Product<Tv, String> product1 = new Product<>();// 간단히 작성한것
	product1.setKind(new Tv());
	product1.setModel("스마트TV");
	
	Tv tv = product1.getKind(); // new Tv()
	System.out.println(tv);     // chapter07.Tv@15db9742 (패키지.클래스@해시코드)
	
	String tvModel = product1.getModel(); // "스마트TV"
	System.out.println(tvModel); // 스마트 TV

	
	Product<Car, String> product2 = new Product<>();// 간단히 작성한것
	product2.setKind(new Car());
	product2.setModel("디젤");
	
	Car car = product2.getKind();
	System.out.println(car); // chapter07.Car@6d06d69c (패키지.클래스@해시코드)
	
	String carModel = product2.getModel(); //"디젤"
	System.out.println(carModel);
	
}	}

class Tv{ }
class Car{ }

