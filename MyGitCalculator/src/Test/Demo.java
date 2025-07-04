package Test;
import Interface.Calculator;
import InterfaceImpl.CalculatorImpl;

public class Demo {
	public static void main(String[] args) {
	
		Calculator c = new CalculatorImpl();
		
		int add = c.add(12, 15);
		System.out.println(add);
		
		int mul = c.mul(12, 5);
		System.out.println(mul);
		
		
		
		
	}

	
	}


