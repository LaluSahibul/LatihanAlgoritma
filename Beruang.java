//menghitung nilai terbesar dan terkecil pada ndex array
package Algoritma;
public class Beruang {

	public static void main(String[] args) {
		
		int [] angka= {2,15,100,85,3,1,56,12};
		int i=0;
		int nilaiTerbesar=angka[0];
		int nilaiTerkecil=angka[0];
		//LOOPING
		while(i<angka.length) {
			if(nilaiTerbesar<angka[i]) {
				nilaiTerbesar=angka[i];
			}
			if(nilaiTerkecil>angka[i]) {
				nilaiTerkecil=angka[i];
			}
			i++;
		}
		System.out.println("elemen array {2,15,100,85,3,1,56,12}");
		System.out.println("elemen array yang terbesar adalah "+nilaiTerbesar);
		System.out.println("elemen array yang terkecil adalah "+nilaiTerkecil);
	}

}
