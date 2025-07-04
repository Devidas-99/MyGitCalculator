package Test;

import Interface.Calculator;
import InterfaceImpl.CalculatorImpl;

public class Demo {

	public static void main(String[] args) {
		 Calculator cal = new  CalculatorImpl();
        int sum =    cal.sum(12, 15);
            System.out.println(sum);
	}

}
