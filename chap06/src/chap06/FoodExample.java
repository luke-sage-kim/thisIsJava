package chap06;

public class FoodExample {
	public static void main(String[] args) {
		Food food1 = new Food("고기", 6, "혼자");
		
		food1.setWho("김명현");
		food1.setFood("고기");
		food1.setAmount(1);
		food1.setMember("혼자");
		System.out.print(food1.getWho()+"이 ");
		System.out.print(food1.getFood()+"를 ");
		System.out.print(food1.getAmount()+"인분을 ");
		System.out.print(food1.getMember()+"먹었다."); 
	}
}
