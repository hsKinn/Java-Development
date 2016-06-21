import java.util.Scanner;

public class Convert {
	
	public void convertCeltoFah( Scanner userInput ) {
		
		System.out.println();
		System.out.print("섭씨 온도 입력 : ");
		int cel = userInput.nextInt();
		double fah = cel * 1.8 + 32;
		System.out.println("섭씨 " + cel + "도 = 화씨 " + fah + "도");
		
	}
	
	public void convertFahtoCel( Scanner userInput ) {
		
		System.out.println();
		System.out.print("화씨 온도 입력 : ");
		int fah = userInput.nextInt();
		double cel = (fah - 32) / 1.8;
		System.out.println("화씨 " + fah + "도 =  섭씨 " + cel + "도");
	}
	
}
