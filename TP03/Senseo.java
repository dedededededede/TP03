public class Senseo implements IDistributeur{
	private int cap;
	private int nbDos;
	private double eau;
	private double gain;

	private double prixCourt = 0;
	private double prixLong = 0;
	public Senseo(){
		cap = 1;
		nbDos = 0;
		eau = 1;
		gain = 0;
	}

	public int getCap(){return cap;}
	public int getDos(){return nbDos;}
	public double getEau(){return eau;}
	public double getGain(){return gain;}

	public String toString(){
		return "Capacite de dosettes : " +cap+"; nombre de dosettes : "+nbDos+"; reservoir d'eau : "+eau+"L";
	}

	public void afficher(){
		System.out.println(toString());
	}

	public double boireCafeCourt(double montant){
		eau = (eau*1000-10)/1000;
		return montant;
	}

	public double boireCafeLong(double montant){
		eau = (eau*1000-25)/1000;
		return montant;
	}

	public void ajouterDosettes(int nbDosettes){
		nbDos+=nbDosettes;
	}

	public void remplirReservoir(double quantite){
		eau+=quantite;
	}
}