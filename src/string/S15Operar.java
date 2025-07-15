package string;

public class S15Operar {
	
	public static double operar (String cadena) {
		double num1= 0;
		double num2 = 0;
		double operacion = 0;
		
		int posOperador = 0;
		
		if(cadena.contains("+")) {
			posOperador = cadena.indexOf("+");
			num1 = Double.parseDouble(cadena.substring(0, posOperador));
			num2 = Double.parseDouble(cadena.substring(posOperador +1));
			operacion = num1 + num2;
		}
		if(cadena.contains("-")) {
			posOperador = cadena.indexOf("-");
			
			num1 = Double.parseDouble(cadena.substring(0, posOperador));
			num2 = Double.parseDouble(cadena.substring(posOperador+1));
			operacion = num1 - num2;
			
		}
		if(cadena.contains("*")) {
			posOperador = cadena.indexOf("*");
			
			num1 = Double.parseDouble(cadena.substring(0, posOperador));
			num2 = Double.parseDouble(cadena.substring(posOperador+1));
			operacion = num1 * num2;
			
		}
		if(cadena.contains("/")) {
			posOperador = cadena.indexOf("/");
			
			num1 = Double.parseDouble(cadena.substring(0, posOperador));
			num2 = Double.parseDouble(cadena.substring(posOperador+1));
			operacion = num1 / num2;
			
		}
			
		return operacion;
	}
	public static void main(String[] args) {
		System.out.println(operar("45+45"));
		System.out.println(operar("4543-35"));
		System.out.println(operar("4.5*4.3"));
		System.out.println(operar("45.5/45.5"));
	}
	

}
