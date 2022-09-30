package ch03;

public class _01_CalculatorMain {
	//8.0 4.0
	
	
	public static void main(String[] args) {
		
		_01_Calculator cal = new _01_Calculator();
			double d1 = 8.0;
			double d2 = 4.0;
			
			double addR = cal.add(d1, d2);
			System.out.println(d1+" + "+d2 +" = "+addR);
			
			double subR = cal.sub(d1, d2);
			System.out.println(d1+" - "+d2+" - "+subR);
			
			double mulR = cal.mul(d1, d2);
			System.out.println(d1+" * "+d2+" = "+mulR);
			
			double divR = cal.div(d1, d2);
			System.out.println(d1+" / "+d2+" = "+divR);
			
			
	}
}
