package Algoritma;
import java.util.Scanner;
public class Gajelas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		System.out.print("ciri ciri orangnya ");
		String a=x.next();
		x.close();
		if(a.contains("ganteng")) {
			System.out.println("orang yang "+a+" itu adalah ibul");
			System.out.println("dia adalah orang terbaik di grup ini");
		}else if(a.contains("cantik")) {
			System.out.println("orang yang "+a+" itu adalah niz");
			System.out.println("cita citanya menjadi orang kaya, dulu di tendang sekarang ku disayang.");
			System.out.println("MALAH NYANYI GOBLOK!!");
		}else if(a.contains("jelek")) {
			System.out.println("orang yang "+a+" itu adalah dony");
			System.out.println("nama ayahnya MIS.");
			System.out.println("Dia juga pernah diusir dari jam bu ari gara-gara dia bilang NGOMONG DONG!!");
		}else {
			System.out.println("orang yang "+a+" itu adalah suti");
			System.out.println("dia pengen mancung tapi ga bisa,awkowkowko");
		}
	}

}
