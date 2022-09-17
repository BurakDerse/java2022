
public class main {

	public static void main(String[] args) {
		int aranacak = 2;
		int [] sayilar = new int [] {0,1,2,3,6,7} ;
		boolean var = false;
		
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				var = true;
				break;
			}
		}
		if(var) {
			System.out.println("var");
		}else{
			System.out.println("yok");
		}
	}

}
