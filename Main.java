import java.io.*;
import java.util.*;

public class Main
{
  static Hashtable<String, FichierCSV> fichiers;

  static void chargement()
  {
    File repertoire = new File("./");    
    String [] listefichiers;
    listefichiers=repertoire.list();
    fichiers = new Hashtable<>();

    System.out.print("\nChargement des donees...\n");

    for(int i=0;i<listefichiers.length;i++)
    {
      if(listefichiers[i].endsWith(".csv")==true)
      {
        System.out.print("\nFichier csv chargé : " + listefichiers[i]);
        fichiers.put(listefichiers[i].substring(0, 4), new FichierCSV(listefichiers[i]));
      }    
    }
  }

  static void displayStat()
  {
    Set<String> s = fichiers.keySet();
    Iterator<String> i = s.iterator();
    String keyTemp;

    System.out.print("\n\nAffichage des statistiques...\n");

    while(i.hasNext())
    {
      keyTemp = i.next();
      fichiers.get(keyTemp).displayStat();
    }    
  }

  static Hashtable<String, Participation> getPalmares(String course)
  {
    Hashtable<String, Participation> palmares = new Hashtable<>();
    Set<String> s = fichiers.keySet();
    Iterator<String> i = s.iterator();
    String keyTemp;

    while(i.hasNext())
    {
      keyTemp = i.next();
      if(fichiers.get(keyTemp).getGagnant(course)!=null)
      {
        palmares.put(keyTemp, fichiers.get(keyTemp).getGagnant(course));
      }
    }

    return palmares;
  }

  static void displayPalmares()
  {
    Set<String> annee = fichiers.keySet();    //liste toute les cle de la hastable fichiers, ces cles sont les différentes années
    ArrayList<String> courses = new ArrayList<>(); //permet d'avoir une liste des courses sans doublons
    Iterator<String> ia = annee.iterator();    //iterateur sur les annes
    String keyTemp;

    System.out.print("\n\nAffichage des palamares...\n");

    while(ia.hasNext())
    {
      courses.addAll(fichiers.get(ia.next()).getCourse());
    }

    courses = new ArrayList<>(new HashSet<>(courses)); //enleve les doublons
    Iterator<String> ic = courses.iterator();    //iterateur sur les courses

    while(ic.hasNext())
    {
      keyTemp=ic.next();
      System.out.print("\nCourse " + keyTemp + " palmares = " + getPalmares(keyTemp));
    }
  }

  /**
   * Remplit un ArrayList de Donne avec les donnees du courreur avec le nom en parametre
   * @param nom nom du coureur recherche
   * @param data ArrayList a remplir
   */
  static ArrayList<Participation> getDataOf(String nom)
  {
    Set<String> s = fichiers.keySet(); //recupere l'ensemble des cle de la Hashtable
    Iterator<String> i = s.iterator();
    String keyTemp;
    ArrayList<Participation> data = new ArrayList<>();

    while(i.hasNext())
    {
      fichiers.get(i.next()).getDataOf(nom, data);
    }
    
    return data;
  }

  public static void main(String[] args)
  {
    chargement();
    displayStat();
    displayPalmares();

    Fenetre.demarreFenetre(fichiers);
  }
}
