package testPage707;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {

	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;
		
		binaryOperator = BinaryOperator.minBy( (f1,f2)->Integer.compare(f1.price, f2.price));
		
	
	}
}
