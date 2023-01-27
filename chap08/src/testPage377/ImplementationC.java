package testPage377;
//하위 인터페이스 구현
public class ImplementationC implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("ImplementationC-methodA() 실행");

	}

	@Override					
	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");//A와 B의 실체 메소드 있어야함
	}

	@Override
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");		
	} 
}
