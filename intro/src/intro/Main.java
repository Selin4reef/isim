package intro;

public class Main {

	public static void main(String[] args) {
		//camelCase = ilk harf k���k sonrakilerinde b�y�k
		// String,double,int,boolean,il,else if,else mant���
		String internetSubeButonu = "Buton";
		double dolarDun = 8.15 ;
		double dolarBugun = 8.15 ;
		int vade= 3 ;
		boolean dustuMu = false ;
		
		System.out.println("Say� de�eri; "+ 343);
		
		if(dolarDun > dolarBugun) {
			System.out.println("Dolar d�st� resmi");
        }
		else if (dolarDun < dolarBugun) {
			System.out.println("Dolar y�kseldi resmi");
		}else {
    		System.out.println("Sabit duruyor resmi");
        }
		// Say� D�n���mleri
		int sayi1 = 10 ;
		int sayi2= 20 ;
		sayi1 =sayi2 ;                                    // Value type oldu�undan atanan de�er atand��� hali ile kal�r                
		sayi2 = 100 ;
		System.out.println(sayi1);
		System.out.println(sayi2);
		
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;                              // Reference type oldu�undan atanan de�ere sonradan de�er atay�nca kendi �zerine al�r
		sayilar2[0] = 100 ;
		System.out.println(sayilar1[0]);
		System.out.println(sayilar2[0]);
		
		String sehir1 = "Ankara";
		String sehir2 = "�stanbul";
		sehir1 = sehir2 ;                                 //Stringler istisnai bir durumdur Reference type olmas�na ra�men Value type gibi hareket ederler
		sehir2 = "�zmir";                                
		System.out.println(sehir1);
		System.out.println(sehir2);
	} 

}
