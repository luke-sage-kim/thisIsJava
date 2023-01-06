package chap12;

public class ExerciseFivonach {
	public static void main(String[] args) {

		Fibonach(5);
	};



public static void Fibonach(int x) {
	int num1,num2,sum;
	num1=0; // 첫번째와 두번째 값이 1이어야 하므로 초기값을 0과
	num2=1; // 1로 준다
	sum=1; // 첫번째 1은 그냥 초기값으로 설정

	for(int i=0; i<x; i++)
	{
    System.out.print(sum+" ");
    sum=num1+num2; // 두 값을 더한 후
    num1=num2;
    num2=sum; // 두번째 연산자에 더한 값을 넣어준다.
}}}
