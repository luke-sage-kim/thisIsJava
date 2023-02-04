package testPage521;

public class Member implements Comparable<Member> {

	  String name;

	  Member(String name) {

	     this.name = name;

	  }

	  @Override

	  public int compareTo(Member o){

	     return name.compareTo(o.name); // 리턴 값은 오름 차순일 때 자신이 매개 값보다 낮을 경우 음수, 같을 경우 0, 높을 경우 양수를 리턴하도록 하고, 내림 차순일 경우 반대로 하면 됩니다. 

	  }

	}