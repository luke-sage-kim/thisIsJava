package testPage350;
//상수필드 선언
public interface RemoteControl {
 public int MAX_VOLUME = 10;  //상수일때 대문자를 썼었다   static final 생략
 public int MIN_VOLUME = 0; 
 
 public  void turnOn();//abstract 가 생략  인터페이스안에있는 모든메소드들은 추상메소드
 public  void turnOff();
 public  void setVolume(int volume);
}
