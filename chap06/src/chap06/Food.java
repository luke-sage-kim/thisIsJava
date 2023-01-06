package chap06;

public class Food {

	String who;
	public String getWho() {
		return who;
	}

	public void setWho(String who) {
		this.who = who;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		
		this.amount = amount;
	}

	public String getMember() {
		return member;
	}

	public void setMember(String member) {
		this.member = member;
	}

	String food;
	int amount;
	String member;

	Food(String food, int amount, String member) {

		this.food = food;
		this.amount = amount;
		this.member = member;
	}
}