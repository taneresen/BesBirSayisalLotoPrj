package com.bilisimegitim.sayisalloto;

import java.util.Random;

public class SayisalLoto {
	
	
	public int sayiGetir() //Void kullandigimizda Return Etmiyorduk.Ancak Void Disinda Bir metod kullaniyor isekReturn Etmek Durumundayiz.
	{
		int sayi =0;
		
		Random rand =new Random();
		
		sayi = rand.nextInt(49)+1;
		
		return sayi;
		
		//return rand.nextInt(49)+1; (Bunu tek yazar isek 
		//								int sayi =0;sayi = rand.nextInt(49)+1;return sayi;
		//								Yazmaya gerek kalmayacak)
		
		
		
		
		
	}
	
	
	

}
