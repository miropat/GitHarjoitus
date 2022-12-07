package luokkaharj;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Televisio {
	//ominaisuudet
	String merkki;
	String malli;
	int koko;
	String kuvanLaatu;
	
	//toiminnot
	public void Startup() {
		System.out.println("TV käynnistyy");
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
}
