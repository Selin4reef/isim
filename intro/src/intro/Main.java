package intro;

public class Main {

	public static void main(String[] args) {
		//camelCase = ilk harf küçük sonrakilerinde büyük
		// String,double,int,boolean,il,else if,else mantýðý
		String internetSubeButonu = "Buton";
		double dolarDun = 8.15 ;
		double dolarBugun = 8.15 ;
		int vade= 3 ;
		boolean dustuMu = false ;
		
		System.out.println("Sayý deðeri; "+ 343);
		
		if(dolarDun > dolarBugun) {
			System.out.println("Dolar düstü resmi");
        }
		else if (dolarDun < dolarBugun) {
			System.out.println("Dolar yükseldi resmi");
		}else {
    		System.out.println("Sabit duruyor resmi");
        }
		// Sayý Dönüþümleri
		int sayi1 = 10 ;
		int sayi2= 20 ;
		sayi1 =sayi2 ;                                    // Value type olduðundan atanan deðer atandýðý hali ile kalýr                
		sayi2 = 100 ;
		System.out.println(sayi1);
		System.out.println(sayi2);
		
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;                              // Reference type olduðundan atanan deðere sonradan deðer atayýnca kendi üzerine alýr
		sayilar2[0] = 100 ;
		System.out.println(sayilar1[0]);
		System.out.println(sayilar2[0]);
		
		String sehir1 = "Ankara";
		String sehir2 = "Ýstanbul";
		sehir1 = sehir2 ;                                 //Stringler istisnai bir durumdur Reference type olmasýna raðmen Value type gibi hareket ederler
		sehir2 = "Ýzmir";                                
		System.out.println(sehir1);
		System.out.println(sehir2);
	} 

}
