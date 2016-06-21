
public class ForTest2 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i+=2) {
			System.out.println(i);		
		}
		
		for (int i = 0; i < 10; i++) {
			if ( i % 2 == 0 ) {
				System.out.println(i);
			} // i % 2 = 0 인 값은 짝수
		} 
	
	}
}
