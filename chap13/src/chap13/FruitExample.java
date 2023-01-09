package chap13;

public class FruitExample {

		public static void main(String[]args) {
			Fruit<String> color = new Fruit<String>();
			color.set("red");//set void에 red를 입력한다
			String apple = color.get();
			System.out.println(apple);
			
			Fruit<Integer> box = new Fruit<Integer>();
			box.set(10);
			int appleBox = box.get();
			System.out.println(appleBox);
		}
	} 

