package chap11;

public class obj1Wrapper {
	public static void main(String[] args) {

		char[] arr1 = {'E','C','L','P','S','E'};
		char[] arr2 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		for(int i =0; i<arr2.length;i++)
		{
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
	}
}
// Happy Monday
// Happy Monday?
//
