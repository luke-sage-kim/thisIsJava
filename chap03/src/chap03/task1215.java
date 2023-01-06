package chap03;

public class task1215 {
	public static void main(String[] args) {
		
		int v1 = 100;
		int v2 = ~v1 * 3;
		
		
			System.out.println(v2);
		
		
			
				
			
		}

		private static String toBinaryString(int value) {
			String str = Integer.toBinaryString(value);
			while(str.length()<32){
				str = "0"+str;
			}
			// TODO Auto-generated method stub
			return str;
		}
}
