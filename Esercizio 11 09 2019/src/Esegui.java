public class Esegui {

	public static void main(String[] args) {
		
		Lab ex= new Lab();
		
		String ripeti;
		
		do {
		ex.stampaMen�();
		//Richiamo di Stampa Men�
		
		int scelta = ex.leggiIntero("Inserisci un Numero: ");
		
		
		switch(scelta) {
		case 1:
			
			ex.maxMin();	
			//Richiamo di MaxMin
			
			break;
		case 2:
			
			ex.pariDispari();	
			//Richiamo di PariDispari
			
			break;
			
		default:
			break;
		
		}
		
		ripeti=ex.leggiStringa("Vuoi ripetere l'esericizio?? Si/No ");
		
		
		}while( ripeti.equals("Si") );
		
	}
}
