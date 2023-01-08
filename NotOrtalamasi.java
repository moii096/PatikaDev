package New1;

import java.util.Scanner;

public class NotOrtalamasi {
	public static void main(String[] args) {
	int	mat ,turkce ,fizik , kimya , tarih , muzik ;
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Matematik notunu giriniz :");
	mat=scan.nextInt() ;
	
	System.out.println("Turkce notunu giriniz :");
	turkce=scan.nextInt() ;
	
	System.out.println("Fizik notunu giriniz :");
	fizik=scan.nextInt() ;
	
	System.out.println("Kimya notunu giriniz :");
	kimya=scan.nextInt() ;
	
	System.out.println("Tarih notunu giriniz :");
	tarih=scan.nextInt() ;
	
	System.out.println("Muzik notunu giriniz :");
	muzik=scan.nextInt() ;
	double toplam =mat + turkce + fizik + kimya + tarih + muzik ;
	double ortalama= toplam/6 ;
	
	 System.out.println("Ortalamaniz :" + ortalama );
	 String sonuc = (ortalama >=60 ) ? "Gectinizi" : "Kaldiniz" ;
	 System.out.println(sonuc);
	}
}
