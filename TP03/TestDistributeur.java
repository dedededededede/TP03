import java.util.Scanner;
public class TestDistributeur{
	public static void main(String[] args) {
		/*int choix = 0;
		int choix2 = 0;
		int choix3 = 0;
		double prix;
		double montant;
		int dosettes;
		double volume;
		boolean verif = true;
		int aug;
		Scanner clavier = new Scanner(System.in);
		DistributeurCafe d = new DistributeurCafe();
		while(verif){
			System.out.println("Veuillez choisir un chiffre entre 1 et 6 :");
			System.out.println("1 : Afficher les statistiques du distributeur");
			System.out.println("2 : Boire un cafe court");
			System.out.println("3 : Boire un cafe long");
			System.out.println("4 : Ajouter des dosettes");
			System.out.println("5 : Remplir le reservoir d'eau");
			System.out.println("6 : Verifier, modifier ou augmenter les prix");
			System.out.println("7 : Ne rien faire");
			choix = clavier.nextInt();
			switch(choix){
				case 1 :
					d.afficher();
					System.out.println("");
				break;
				case 2 :
					System.out.println("Quel montant (1 minimum) ?");
					prix = clavier.nextDouble();
					montant = d.boireCafeCourt(prix);
					System.out.println("Voici votre reste : " +montant+" euros");
				break;
				case 3 :
					System.out.println("Quel montant (1.5 minimum) ?");
					prix = clavier.nextDouble();
					montant = d.boireCafeLong(prix);
					System.out.println("Voici votre reste : " +montant+" euros");
				break;
				case 4 :
					System.out.println("Nombre de dosettes rajoutees ?");
					dosettes = clavier.nextInt();
					d.ajouterDosettes(dosettes);
				break;
				case 5 :
					System.out.println("Volume d'eau rajoute (en L) ?");
					volume = clavier.nextDouble();
					d.remplirReservoir(volume);
				break;
				case 6 :
					System.out.println("Veuillez choisir un chiffre entre 1 et 3");
					System.out.println("1 : Verifier les prix");
					System.out.println("2 : Modifier les prix");
					System.out.println("3 : Augmenter les prix");
					choix2 = clavier.nextInt();
					switch (choix2) {
						case 1 :
							d.affiPrixCourt();
							d.affiPrixLong();
						break;
						case 2 :
							System.out.println("Modifier le prix du cafe court (1) ou du cafe long (2) ?");
							choix3 = clavier.nextInt();
							switch (choix3) {
								case 1 :
									System.out.println("Nouveau prix du cafe court ?");
									prix=clavier.nextDouble();
									d.modifPrixCourt(prix);
								break;
								case 2 :
									System.out.println("Nouveau prix du cafe long ?");
									prix=clavier.nextDouble();
									d.modifPrixLong(prix);
								break;
								default :
									System.out.println("Erreur");
								break;
							}
						break;
						case 3 :
							System.out.println("De combien augmenter (en pourcentage) ?");
							aug = clavier.nextInt();
							d.augmenter(aug);
						break;
						default :
							System.out.println("Erreur");
						break;
					}
				break;
				case 7 :
					verif=false;
				break;
				default :
					System.out.println("Erreur");
				break;
			}
		}*/
		Senseo senseo = new Senseo();
		int choix = 0;
		int choix2 = 0;
		int choix3 = 0;
		double prix;
		double montant;
		int dosettes;
		double volume;
		boolean verif = true;
		int aug;
		Scanner clavier = new Scanner(System.in);
		while(verif){
			System.out.println("Veuillez choisir un chiffre entre 1 et 6 :");
			System.out.println("1 : Afficher les statistiques du distributeur");
			System.out.println("2 : Boire un cafe court");
			System.out.println("3 : Boire un cafe long");
			System.out.println("4 : Ajouter des dosettes");
			System.out.println("5 : Remplir le reservoir d'eau");
			System.out.println("6 : Ne rien faire");
			choix = clavier.nextInt();
			switch(choix){
				case 1 :
					senseo.afficher();
					System.out.println("");
				break;
				case 2 :
					System.out.println("Quel montant (0 minimum) ?");
					prix = clavier.nextDouble();
					montant = senseo.boireCafeCourt(prix);
					System.out.println("Voici votre reste : " +montant+" euros");
				break;
				case 3 :
					System.out.println("Quel montant (0 minimum) ?");
					prix = clavier.nextDouble();
					montant = senseo.boireCafeLong(prix);
					System.out.println("Voici votre reste : " +montant+" euros");
				break;
				case 4 :
					System.out.println("Nombre de dosettes rajoutees ?");
					dosettes = clavier.nextInt();
					senseo.ajouterDosettes(dosettes);
				break;
				case 5 :
					System.out.println("Volume d'eau rajoute (en L) ?");
					volume = clavier.nextDouble();
					senseo.remplirReservoir(volume);
				break;
				case 6 :
					verif=false;
				break;
				default :
					System.out.println("Erreur");
				break;
			}
		}
	}
}