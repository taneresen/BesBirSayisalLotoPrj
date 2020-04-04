import java.util.Random;

import com.bilisimegitim.sayisalloto.SayisalLoto;

public class Calistir {

	public static void main(String[] args) {
		
		
		int sayi1;
		int sayi2;
		int sayi3;
		int sayi4;
		int sayi5;
		int sayi6;
		
		
		SayisalLoto loto = new SayisalLoto(); //Class'tan Obje Yarattik
		
		sayi1 = loto.sayiGetir(); // Sayigetiri tiklayip Open declaration secersek o classa gider ve duyenleme yapariz.
		sayi2 = loto.sayiGetir();
		
		
		while (sayi2 == sayi1) 
		{
			sayi2 = loto.sayiGetir();
		}
		
		do {
			
			sayi3 = loto.sayiGetir();
			
		} while (sayi3==sayi1 || sayi3==sayi2);
		
		
		do {
			
			sayi4 = loto.sayiGetir();
			
		} while (sayi4==sayi1 || sayi4==sayi2 || sayi4==sayi3);
	
		do {
			
			sayi5 = loto.sayiGetir();
			
		} while (sayi5==sayi1 || sayi5==sayi2 || sayi5==sayi3 || sayi5==sayi4);
		
		do {
			
			sayi6 = loto.sayiGetir();
			
		} while (sayi6==sayi1 || sayi6==sayi2 || sayi6==sayi3 || sayi6==sayi4 || sayi6==sayi5);
	
	
		
		//Yazdir:
		
		System.out.println(sayi1+"-"+sayi2+"-"+sayi3+"-"+sayi4+"-"+sayi5+"-"+sayi6);
		


	}

}
