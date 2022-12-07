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
		tv1.merkki = "Toosa";
		tv1.malli = "putkitv";
		tv1.koko = 23;
		tv1.kuvanLaatu = "1/10K";
		tv1.omistaja ="Patu";
		
		System.out.println(tv2.merkki);
		tv1.startUp();
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
}
