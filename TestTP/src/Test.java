import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jour jour = null;
		if(args.length>0) 
			 jour = Jour.valueOf(args[0]);
		else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Donner .....");
			 jour = Jour.valueOf(sc.next());
			
		}
			
			
		if (jour == Jour.SAMEDI) System.out.print("fin de semaine : ");
		switch(jour)	{
			case SAMEDI :
			case DIMANCHE :
				System.out.println("se reposer");
				break;
			default : 
				System.out.println("travailler");
				break;
		}
	}

}
