package testPage149;
//배열 복사
public class ArrayCopyByForExample {
	public static void main(String[] args) {
		int[] oldIntArray = { 1, 2, 3 }; //
		int[] newIntArray = new int[5];
		
		
		//for 문으로 배열 복사
		for(int i=0; i<oldIntArray.length; i++) { //올드의 방갯수만큼 반복한다
			newIntArray[i] = oldIntArray[i];   //올드를 셀동안 올드에있는 각각을 뉴로 옮긴다
			
		}
		
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");  //옮긴거 확인 1 2 3 은 옮겨졌고 나머지 4번째 5번쨰칸은 아직 넣은것이없어서 0 0 뜸
			
		}
		System.out.println();
		newIntArray[3] = 4;//  4번째칸은 3이다 왜냐   0시작해서 0 1 2 3 45
		newIntArray[4] = 5;
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");  //옮긴거 확인 1 2 3 은 옮겨졌고 나머지 4번째 5번쨰칸은 아직 넣은것이없어서 0 0 뜸
		}
	}
	
	
}
