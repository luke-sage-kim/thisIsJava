package SecondHomework;

public class Container <T, S> {
    private T t;
    private S s;
    public T getKey() {return t;}
    public S getValue() {return s;}
    public void set(T t, S s){
    	this.s = s;
    	this.t = t;
    }
} 