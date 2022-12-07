package luokkaharj;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//olion luominen
		
		Televisio tv1 = new Televisio();
		
		//Annetaan arvot
		tv1.merkki = "Samsung";
		tv1.malli = "Q60B 4K QLED";
		tv1.koko = 55;
		tv1.kuvanLaatu = "4K";
		tv1.omistaja ="Miro";
		
		System.out.println(tv1.merkki);
		tv1.startUp();
		
		
		Televisio tv2 = new Televisio();
		
		//Annetaan arvot
		tv2.merkki = "Toosa";
		tv2.malli = "putkitv";
		tv2.koko = 23;
		tv2.kuvanLaatu = "1/10K";
		tv2.omistaja ="Patu";
		
		
		tv2.tulostaTiedot();
		
		Televisio tv3 = new Televisio("Sony", "LCD40", 40, "1K", "Jansku");
		
		tv3.muutaTiedot("LG", "LCD50", 50);
		
		tv3.tulostaTiedot();
	}

}

class Televisio {
	
	//ominaisuudet
	String merkki;
	String malli;
	int koko;
	String kuvanLaatu;
	String omistaja;
	
	//toiminnot
	public void startUp() {
		System.out.println("TV käynnistyy");
		omistaja() ;
	}
	public void shutDown() {
		System.out.println("TV sammuu");
	}
	public void changeChannel(String suunta) {
		
			System.out.println("Kanava" + suunta);
	}
	public void netflix() {
		System.out.println("Opening netflix");
	}
	private void omistaja() {
		System.out.println("omistaja on "+omistaja);
	}
	
	//tulosta tiedot metodi
	public void tulostaTiedot() {
		System.out.println("merkki: " +merkki);
		System.out.println("malli: " +malli);
		System.out.println("koko: " +koko);
		System.out.println("kuvan laatu: " +kuvanLaatu);
	}
	
	//muuta tiedot metodi
	public void muutaTiedot(String merkki, String malli, int koko) {
		this.merkki = merkki;
		this.malli = malli;
		this.koko = koko;
	}
	
	//Constructor 
	public Televisio () {
		merkki="";
		malli="";
		koko=0;
		kuvanLaatu="";
		omistaja="";
	}
	public Televisio (String brand, String model, int size, String picquality, String owner) {
		merkki = brand;
		malli = model;
		koko = size;
		kuvanLaatu = picquality;
		omistaja = owner;
	}
}

