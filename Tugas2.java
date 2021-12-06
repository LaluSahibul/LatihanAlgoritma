package Algoritma;
import java.util.Scanner;
public class Tugas2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		System.out.print("harga sepatu ");
		int s=x.nextInt();
		System.out.print("harga alat tulis ");
		int at=x.nextInt()*100;
		System.out.print("harga perlengkapan olahraga ");
		int po=x.nextInt()*5;
		x.close();
		int uang=10000000;
		double total=s+at+po,d1=total-(total*2.5/100),d2=total-(total*3.5/100),d3=total-(total*5/100);
		double  s1=s-(s*2.5/100),at1=at-(at*2.5/100),po1=po-(po*2.5/100),
				s2=s-(s*3.5/100),at2=at-(at*3.5/100),po2=po-(po*3.5/100),
				s3=s-(s*5/100),at3=at-(at*5/100),po3=po-(po*5/100);
		if (total>=700000.0 && total<=850000.0) {
			System.out.println("anda mendapat diskon 2.5%");
			System.out.println("total uang tina "+uang);
			System.out.println("harga sepatu adalah "+s1);
			System.out.println("harga alat tulis adalah "+at1);
			System.out.println("harga perlengkapan olahraga adalah "+po1);
			System.out.println("jumlah yang harus dibayar "+d1);
			System.out.println("sisa uang tina "+(uang-d1));
		}else if(total>=1000000.0 && total<=1500000.0) {
			System.out.println("anda mendapat diskon 3.5%");
			System.out.println("total uang tina "+uang);
			System.out.println("harga sepatu adalah "+s2);
			System.out.println("harga alat tulis adalah "+at2);
			System.out.println("harga perlengkapan olahraga adalah "+po2);
			System.out.println("jumlah yang harus dibayar "+d2);
			System.out.println("sisa uang tina "+(uang-d2));
		}else if(total>=4000000.0) {
			System.out.println("anda mendapat diskon 5%");
			System.out.println("total uang tina "+uang);
			System.out.println("harga sepatu adalah "+s3);
			System.out.println("harga alat tulis adalah "+at3);
			System.out.println("harga perlengkapan olahraga adalah "+po3);
			System.out.println("jumlah yang harus dibayar "+d3);
			System.out.println("sisa uang tina "+(uang-d3));
		}else {
			System.out.println("hadiah dari pembelian barang mendapat tiket nonton bioskop gratis selama 1 bulan untuk 2 orang");
			System.out.println("total uang tina "+uang);
			System.out.println("harga sepatu adalah "+s);
			System.out.println("harga alat tulis adalah "+at);
			System.out.println("harga perlengkapan olahraga adalah "+po);
			System.out.println("jumlah yang harus dibayar "+total);
			System.out.println("sisa uang tina "+(uang-total));
		}
	}
}
