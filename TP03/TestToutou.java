import java.util.Scanner;
class TestToutou{
  public static void main (String[]args){
    Scanner src = new Scanner(System.in);
    System.out.println ("Entrez un nombre de puces:");
    int p = src.nextInt();
    System.out.println ("Entrez le nom du chien:");
    src.nextLine();
    String n = src.nextLine();
    Toutou c1;
    try{
      c1 = new Toutou(p, n);
    }
    catch (IllegalArgumentException e){
      System.out.println(e.getMessage());
      c1 = new Toutou();
    }
    System.out.println ("Entrez un nombre de puces du deuxieme chien:");
    p = src.nextInt();
    src.nextLine();
    System.out.println ("Entrez le nom du second chien:");
    n = src.nextLine();
    Toutou c2;
    try{
      c2 = new Toutou(p, n);
    }
    catch (IllegalArgumentException e){
      System.out.println(e.getMessage());
      c2 = new Toutou();
    }
    System.out.println(c1.getNbPuces());
    System.out.println(c1.getNom());
    System.out.println(c2.getNom());
    System.out.println(c2.egalA(c1));
  }
}
