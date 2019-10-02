import java.util.Scanner;
//Libreria da inserire per Scanner

public class Lab {
	
	Scanner s=new Scanner(System.in);
	//Oggetto Scanner x Input
	//Mettendolo qui, potrà essere usato su tutto.(Globale)
	

public void maxMin()	
{
		
/*	System.out.println("Inserisci il 1° Numero:");
	//Stampa su console di messaggio
	int num1 = s.nextInt();
	//inserimento valore in variabile num1 tramite Scanner  */
	
	int num1=leggiIntero("Inserisci il 1° Numero:");
	//inserimento con Leggi Intero
	
/*	System.out.println("Inserisci il 2° Numero:");
	//Stampa su console di messaggio
	int num2 = s.nextInt();
	//inserimento valore in variabile num2 tramite Scanner  */
	

	int num2=leggiIntero("Inserisci il 2° Numero"); 	
	//Inserimento con Leggi Intero
	
	if (num1>num2) 
	{
		System.out.println("Il 1° Numero "+ num1 +" è maggiore del 2° Numero "+ num2);
		//Se il Primo Numero è Maggiore del Secondo
	}
	else if (num1<num2)
	{
		System.out.println("Il 1° Numero " +num1 +" è minore del 2° Numero "+ num2);
		//Se i 2 Numeri sono Uguali
	}
	else
	{
		System.out.println("Il 2° Numero "+ num1 +" è uguale del 1° Numero "+ num1);	
		//Se il Secondo Numero e Maggiore del Primo
	}
	
}



public void pariDispari()
{
	
/*	System.out.println("Inserisci un Numero");
	int num1 = Integer.parseInt(s.nextLine());
	//Conversione da Stringa a Intero  */
	
	int num1=leggiIntero("Inserisci il Numero:");
	//inserimento con Leggi Intero
	
	if(num1%2==0)
	{
		System.out.println("Il Numero "+num1+" è pari.");
	}
	else
	{
		System.out.println("Il Numero "+num1+" è dispari.");
	}

}


public void stampaMenù()
{
	
	System.out.println("1 - MaxMin");
	System.out.println("2- Pari o Dispari");

}




public int leggiIntero(String s1)
{
	System.out.println(s1);
	
	int num1=0;
	num1 =Integer.parseInt(s.nextLine());
	return num1;
	
}

public String leggiStringa(String s2)
{
	System.out.println(s2);
	return s.nextLine();
	
}

}
