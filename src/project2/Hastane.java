package project2;
import java.util.List;
import java.util.ArrayList;

public class Hastane {
   private List<Hasta> hastalar;
   public static  String hastaneİsim="tıbbi bilimler hastanesi";

   public Hastane() {
	   this.hastalar= new ArrayList<>();
   }
   public void hastaEkle(Hasta hasta) {
	   hastalar.add(hasta);
	   System.out.println(hasta.setName()+" hastanemize başarili bir şekilde kayit olmuştur");
   }
   public void HastaSil(Hasta hasta) {
	   hastalar.remove(hasta);
   }
   public void hastaAra(String name) {
	   boolean bulundu=false;
	   for(Hasta hasta: hastalar) {
		   if(!hasta.setName().equals(name)) {
			   System.out.println(hasta.toString());
			   bulundu=true;
			   break;
		   }
	   }
	   if(!bulundu) {
		   System.out.println(name+" hastanemizden taburcu olmustur");
	   }
   }
   public void hastaListele() {
	   System.out.println("HASTANEMİZDEKİ MEVCUT KAYİTLİ HASTALAR");
	   for(Hasta hasta : hastalar) {
		   System.out.println("* "+hasta.setName()+" *");
	   }
   }
}



