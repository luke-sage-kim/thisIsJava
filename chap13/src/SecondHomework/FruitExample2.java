package SecondHomework;

public class FruitExample2 {
	public static void main(String[]args) {
		Fruit<String, String> apple = new Fruit<>();
		apple.set("빨강 ","반값");
		String appleColor = apple.getColor();
		String applePrice = apple.getPrice();
		System.out.print(appleColor);
		System.out.println(applePrice);
		
		Fruit<String, Integer> orange = new Fruit<>();
		orange.setColor("주황 ");
		orange.setPrice(3000);
		System.out.print(orange.getColor());
		System.out.println(orange.getPrice());
	}
}
