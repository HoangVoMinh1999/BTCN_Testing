package BTCN_02;

public class mainClass {
	public static String checkTriangle(float a,float b,float c) {
		String sMessage = "";
		if (a >= b+c || b >= a+c || c>=a+b ) {
			sMessage = "Không phải tam giác";
		}
		else {
			if (a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a+b*b) {
				sMessage = "Tam giác vuông";
			}
			else if( a == b && a == c && b == c) {
				sMessage = "Tam giác đều";
			}
			else if( a == b || a == c || b == c) {
				sMessage = "Tam giác cân";
			}
			else if (a*a > b*b+c*c || b*b > a*a+c*c || c*c > a*a+b*b) {
				sMessage = "Tam giác tù";
			}
			else {
				sMessage = "Tam giác nhọn";
			}
		}
		return sMessage;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = checkTriangle(4,4,4);
		System.out.print(result);
	}

}
