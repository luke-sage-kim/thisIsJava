package chap13;

public class Password <S, I> {
	public static <S, I> boolean correct(FirstPw<S, I> firstPw, SecondPw<S, I> secondPw){
		boolean strPw = firstPw.getStr().equals(secondPw.getStr());
		boolean numPw = firstPw.getNum().equals(secondPw.getNum());
		return strPw && numPw;
	}}