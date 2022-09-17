
public class main {

	public static void main(String[] args) {
		int number = 7569;
		boolean isPrime = true;
		
		for(int i=2; i<number; i++) {
			
			if(number%i==0) {
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.println("sayı asal");
		}else {
			System.out.println("sayı asal değil");
		}
	}
}
