
public class CompositionOfPrintf {

	public static void main(String[] args) {
		
		double num1 = 10.1234;
		double num2 = 12.3456789;
		
		System.out.printf("%f%n", num1);
		System.out.printf("%.0f%n", num2);
		System.out.printf("%.1f%n", num2);
		System.out.printf("%.2f%n", num2);
		System.out.printf("%.3f%n", num2);
		System.out.printf("%.4f%n", num2);
		System.out.printf("%.5f%n", num2);
		System.out.printf("%.6f%n", num2);
		System.out.printf("%.7f%n", num2);
		
		String str = "hello";
		int num3 = 15;
		char let = 'A';
		
		System.out.printf("%.2s%n", str); //s=string
		System.out.printf("%.3b%n", true); //b=boolean
		System.out.printf("%.2h%n", str); //h=heximal
//		System.out.printf("%.3d%n", num1); It's error!!You can't specify precision on int
//		System.out.printf("%.2c%n", let); It's error!!You can't specify precision on char
		

	}

}
