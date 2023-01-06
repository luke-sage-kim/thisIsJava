package homework;

public class DittoExample {
public static void main(String[] args) {
	Ditto <chorus, String,chorus,String,chorus> c = new Ditto<>();
	c.setMinji(new chorus());
	c.setHanni("Like you a little");
	String ch1 = c.getHanni(); 
	System.out.println(ch1); 
	c.setDANIELLE(new chorus());
	c.setHAERIN("말해줘 say it back, oh, say it ditto");
	String ch2 = c.getHAERIN(); 
	System.out.println(ch2); 
	c.setHYEIN(new chorus());
}
}

 class chorus {}