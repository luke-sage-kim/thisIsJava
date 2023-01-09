package testPage707;

	public class Fruit <C,P> {
		private C c;
		private P p;
		public int price;
		
		
		public void set(C c, P p) {
			this.c = c;
			this.p = p;
		}
		
		public C getColor() {return c;}
		public P getPrice() {return p;}
		
		public void setColor(C c) {	this.c = c;	}
		public void setPrice(P p) {	this.p = p;	}
		
	}


