package testPage324;
//강제 타입변환   부모타입을 자식타입으로 변환하는것
//모든 부모가 자식으로 강제 못하고 자식이 부모로 자동변환후 다시 자식타입으로 변환
public class childExample {
	
	public static void main(String[] args) {
		
		Parent parent = new Child(); //자식에서 부모로 자동타입변환
		Parent ad = new Parent(); // 그냥 부모님 객체
		
		if(parent instanceof Child) {
		
		System.out.println(parent instanceof Child); //친자 검사 ㅋㅋㅋ 
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		}
		else {System.out.println("변환할수없습니다");}

	//	parent.field2 = "data2"; //강제 타입변환을 안해서 에러가 생긴다
	//	parent.method3();
		
		
		Child child = (Child) parent;    //  부모에서 자식으로 강제 타입변환

		child.field2 = "data2";
		child.method3();
		System.out.println(parent instanceof Child); //친자 검사 ㅋㅋㅋ 
	}
}
