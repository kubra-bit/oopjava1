package project2;

public class Giris {
	public static void main(String[] args) {
		System.out.println("hasta kayit sistemi");
		Hastane hastane = new Hastane();
		Hasta hasta1= new Hasta("MERT AVCİ","ANEMİ");
		hasta1.getOdaNo(345);
		System.out.println("-----------------------");
		hastane.hastaEkle(hasta1);
		System.out.println(hasta1.toString());
		System.out.println("-----------------------");
		Hasta hasta2 = new Hasta("DİLARA SARİOGLU","DİYABET");
		hasta2.getOdaNo(678);
		hastane.hastaEkle(hasta2);
		System.out.println("------------------------");
		Hasta hasta3 = new Hasta("ERDEM GUNEY","MS");
		hasta3.getOdaNo(256);
		hastane.hastaEkle(hasta3);
		hastane.hastaAra("MERT AVCİ");
		hastane.hastaListele();
		hastane.HastaSil(hasta2);
		hastane.hastaListele();
		
	}

}
