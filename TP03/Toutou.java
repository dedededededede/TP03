class Toutou{
  //attributs
  private String nom;
  private int nbPuces;
  //constructeur par defaut
  public Toutou(){
    nbPuces = 200;
    nom = "Chien";
  }
  //constructeur par initialisation
  public Toutou(int p, String n){
    nbPuces = p;
    if (nbPuces < 0)
      throw new IllegalArgumentException("Nombre negatif");

    nom = n;
    if (nom == null || nom.equals(""))
      throw new IllegalArgumentException("Nom invalide");
  }
  //Getters
  public int getNbPuces(){
    return nbPuces;
  }
  public String getNom(){
    return nom;
  }
  //Setters
  public void setNbPuces(int p){
    nbPuces = p;
  }
  public void setNom(String n){
    nom = n;
  }
  //toString
  public String toString(){
    return "Votre toutou se nomme "+ nom + " et a " + nbPuces + " puces ";
  }
  //egalA
  public boolean egalA(Toutou c){
    boolean verif = false;
    if(this.getNbPuces() == c.getNbPuces()){
      verif = true;
    }
    return verif;
  }
}
