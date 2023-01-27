package testPage463;
//해시 코드메소드를 재정의 추가
public class Key {
	public int number;

	public Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (this.number == compareKey.number) {
				return true;
			}
		}

		return false;
	}
	
	@Override
	public int hashCode() {
		return number;
	}
}