import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input=new Scanner(System.in);
			int sayi1, sayi2,sayi3,sayi4,ebob=1, ekok;
			
			do
			{
			System.out.print("OBEB'i hesaplanacak iki sayý girin, çýkmak için 0 girin : ");
			sayi1=input.nextInt();
			sayi2=input.nextInt();
			for(int i = 1; i <= sayi1 && i <= sayi2; ++i)
	        {
				if(sayi1 % i == 0 && sayi2 % i == 0)
	                ebob = i;
	        }
			System.out.printf(" %d ve  %d sayýlarýnýn EBOB'u %d \n", sayi1, sayi2, ebob);
			System.out.print("OKEK'i hesaplanacak iki sayý girin, çýkmak için 0 girin : ");
			sayi3=input.nextInt();
			sayi4=input.nextInt();
			ekok = (sayi1 * sayi2) / ebob;
			System.out.printf(" %d ve  %d sayýlarýnýn EKOK'u %d \n", sayi1, sayi2, ekok);
			}
			while(sayi1!=0 && sayi3!=0); 
				System.out.println("Güle güle");
			
		   

	}

}
