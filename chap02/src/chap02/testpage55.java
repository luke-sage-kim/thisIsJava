package chap02;
//인트에서 바이트 강제변환코드
public class testpage55 {
	public static void main(String[] args) {
		int i = 128;
		
		if (i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) { // if( i<-128 || i>127)과 동일  바이트에서 최소값
			//바이트에서 최대값  -128보다 낮거나 127 보다 크면
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요");
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}
	}
}
