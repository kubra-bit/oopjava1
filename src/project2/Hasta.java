package project2;

public class Hasta {
	private String name;
	private String isimHastalik;
	private int odaNO;
	public Hasta(String name ,String isimHastalik ) {
		this.name=name;
		this.isimHastalik=isimHastalik;
	}
	public String setName() {
		return name;
	}
	public void getOdaNo(int odaNO) {
		if(odaNO> 1000) {
			throw new IllegalArgumentException("oda numarasi yanliş biçimlendirilmiş");
		}
		this.odaNO=odaNO;
		}
	
   public int setOdaNo() {
	   return odaNO;
   }
   @Override
   public String toString() {
	   return "hastane bilgileri: "+ Hastane.hastaneİsim+" "+
			   "isim: "+name+" "+
			   "oda numarasi: "+odaNO+" "+
			   "tani: "+isimHastalik+" ";
   }
}
