package chap10;

public class Battery {
	
		private int remain = 100;
		public int getRemain() {
			return remain;
		}
		public void usedBattery(int used) throws NormalException {
		if(remain<used) {
		       throw new NormalException("배터리 부족 충전하세요.");
		}else {
		       System.out.println("잔여 배터리 : "+(remain -= used)+"%");
			}
		}
	}