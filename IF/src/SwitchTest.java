
public class SwitchTest {
	
	public static void main(String[] args) {
		
		int numberOne = 1;
		
		switch ( numberOne ) {
		case 1 : 
			System.out.println("numberOne : 1");
			break;
		case 2 : 
			System.out.println("numberOne : 2");
			break;
		case 3 : 
			System.out.println("numberOne : 3");
			break;
		default : 
			System.out.println("numberOne : X");
			break;
		}
		
		if ( numberOne == 1 ) {
			System.out.println("numberOne : 1");
		}
		else if ( numberOne == 2 ) {
			System.out.println("numberOne : 2");
		}
		else if ( numberOne == 3 ) {
			System.out.println("numberOne : 3");
		}
		else {
			System.out.println("numberOne : X");
		}
		
		
	}
}
