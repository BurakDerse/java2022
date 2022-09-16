package array2;

public class main {

	public static void main(String[] args) {
		double[] myList = {1.1,2.2,3.3,4.4};
		double toplam = 0;
		double max = myList[0];
		for(double number:myList) {
			if(max<number) {
				max=number;
		}
			toplam = toplam + number;
			System.out.println(number);
	}
		System.out.println("toplam= " +toplam);
		System.out.println("enbüyük= "+ max);
	}
	}