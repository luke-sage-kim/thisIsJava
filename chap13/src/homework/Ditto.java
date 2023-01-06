package homework;

public class Ditto<NJ1, NJ2, NJ3, NJ4, NJ5> {
	private NJ1 Minji;
	private NJ2 Hanni;
	private NJ3 DANIELLE;
	private NJ4 HAERIN;
	private NJ5 HYEIN;

	// get
	public NJ1 getMinji() {return this.Minji;}
	public NJ2 getHanni() {return this.Hanni;}
	public NJ3 getDANIELLE() {return this.DANIELLE;}
	public NJ4 getHAERIN() {return this.HAERIN;}
	public NJ5 getHYEIN() {return this.HYEIN;}

	// set
	public void setMinji(NJ1 minji) {
		System.out.println("Stay in the middle");
		this.Minji = minji;}

	public void setHanni(NJ2 Hanni) {this.Hanni = Hanni;}

	public void setDANIELLE(NJ3 DANIELLE) {
		System.out.println("Don't want no riddle");
		this.DANIELLE = DANIELLE;
	}
	public void setHAERIN(NJ4 HAERIN) {this.HAERIN = HAERIN; }
	
	public void setHYEIN(NJ5 HYEIN) {
		System.out.println("아침은 너무 멀어 so say it ditto");
		this.HYEIN = HYEIN;}

}
