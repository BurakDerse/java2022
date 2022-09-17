
public class main {

	public static void main(String[] args) {
		int sayi = 837;
		int top = 0;
		
		for (int i=1; i<sayi; i++) {
			if(sayi % i ==0) {
				top=top+i;
			}
		}
		if(sayi==top) {
			System.out.println("mük sayı");
		}else {
			System.out.println("değil");
		}		
	}
}
