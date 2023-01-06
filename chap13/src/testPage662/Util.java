package testPage662;

public class Util {
	// compare 메소드 : 두 개의 Pare 객체를 받아 비교하는 메소드
		// p1과 p2의 K, V가 모두 일치하면 true 반환, 하나라도 다르면 false 반환
		public static <K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
			boolean keyCompare = p1.getKey().equals(p2.getKey());
			boolean valueCompare = p1.getValue().equals(p2.getValue());
			return keyCompare && valueCompare;
		}



}
