package tadsBissexto;

public class Bissexto {
	
	public boolean anoBissexto(int ano) {
		
		if (ano % 400 == 0) {
			System.out.println(ano + " é bissexto.");
			return true;
		} else if ((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println(ano + " é bissexto.");
			return true; 
		} else {
			System.out.println(ano + " não é bissexto");
			return false;
		}
	}
}
