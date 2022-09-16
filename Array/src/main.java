
public class main {

	public static void main(String[] args) {
		String[] ogrenciler = new String[3];
		ogrenciler[0]="eren";
		ogrenciler[1]="burak";
		ogrenciler[2]="hüseyin";
		
		for(int i=0; i<ogrenciler.length;i++) {
			System.out.println("isim = "+ ogrenciler[i]);
		}
		
		for(String ogr:ogrenciler) {
			
			System.out.println(ogr);
			
		}
	}
}