class DistributeurCafe implements IDistributeur{
  private int nbDosettes = 10;
  private double quantite = 2;
  private double montant = 50;
  private double prixCourt = 0.3;
  private double prixLong = 0.5;

  //Constructeurs
  DistributeurCafe(){
  }

  DistributeurCafe(int d, double q, double m){
    nbDosettes = d;
    quantite = q;
    montant = m;
  }

  DistributeurCafe(DistributeurCafe previousInstance){
    this.nbDosettes = previousInstance.nbDosettes;
    this.quantite = previousInstance.quantite;
    this.montant = previousInstance.montant;
  }

  //Getters
  public int getNbDosettes(){return nbDosettes;}
  public double getQuantite(){return quantite;}
  public double getMontant(){return montant;}
  public double getPrixCourt(){return prixCourt;}
  public double getPrixLong(){return prixLong;}

  //Setters
  public void setPrixCourt(double prx){prixCourt = prx;}
  public void setPrixLong(double prx){prixLong = prx;}

  //toString
  public String toString(){
    return "Nombre de dosettes: " + nbDosettes + " ,Quantite d'eau en litre: " + quantite + " ,Montant: " + montant;
  }

  //afficher
  public void afficher(){
    System.out.println(toString());
  }

  //boireCafeCourt
  public double boireCafeCourt(double m){
    quantite -= 0.1;
    montant += prixCourt;
    double monnaie = m - prixCourt;

    System.out.println("Voici votre cafe court et votre monnaie qui s'eleve a: " + monnaie);
    return monnaie;
  }

  //boireCafeLong
  public double boireCafeLong(double m){
    quantite -= 0.25;
    montant += prixLong;
    double monnaie = m - prixLong;

    System.out.println("Voici votre cafe long et votre monnaie qui s'eleve a: " + monnaie);
    return monnaie;
  }

  public void augmenter(double p){
    prixLong *= 1+p/100;
    prixCourt *= 1+p/100;
  }

  public void remplirReservoir(double quantite){this.quantite += quantite;}
  public void ajouterDosettes(int nbDosettes){this.nbDosettes += nbDosettes;}

}
