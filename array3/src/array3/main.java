package array3;

public class main {

	public static void main(String[] args) {
		String[][] sehirler = new String [3][3];
		sehirler[0][0] = "istanbul";
		sehirler[0][1] = "izmir";
		sehirler[0][2] = "bursa";
		sehirler[1][0] = "eskişehir";
		sehirler[1][1] = "trabzon";
		sehirler[1][2] = "kayseri";
		sehirler[2][0] = "aksaray";
		sehirler[2][1] = "antalya";
		sehirler[2][2] = "tekirdağ";
		
		for(int i=0; i<=2; i++) 
		{
		for(int j=0; j<=2; j++) 
		{
			System.out.println(sehirler[i][j]);
		}	
		}
	}
}
