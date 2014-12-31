import java.io.*;
import java.util.*;

/**
  * Classe permettant de representer tout les resultat d'un fichier .csv, autrement dit d'une anne.
  * Elle contient une hashtable ou la cle est la chaine representant le course (exemple: 50CTF) et ou l'élément associe
  * est le Classement de cette course.
  * @see Classement
  */
public class FichierCSV
{

  /**
   * Hashtable <String, Classement>, ou la cle est la chaine representant la course
   */
  private Hashtable<String, Classement> classements;

  /**
   * String permettant de renseigner sur l'annee des courses que cette instance represente
   */
  private String annee;


  /**
   * Constructeur qui li un fichier pour y extraire les information necessaire a la creation d'une instance.
   * il prend en parametre le nom du fichier, le nom doit contenir l'anne sur les 4 premier caractere
   * pour un fonctionnement correcte du program
   * @param nom nom du fichier
   * @see Classement
   */
  FichierCSV(String nom)
  {
    classements = new Hashtable<>();
    annee = nom.substring(0, 4);

    try
    {  
      String ligne;
      BufferedReader lecteurAvecBuffer = new BufferedReader(new FileReader(nom));

      ligne = lecteurAvecBuffer.readLine(); //pour ingorer la premiere ligne
      while ((ligne = lecteurAvecBuffer.readLine()) != null)     
      {
        String[] items=ligne.split(";");
        Classement temp;
        
        if((temp=classements.get(items[7]))==null) //selectionne le classement correspondat a cette course
        {
          classements.put(items[7], new Classement()); //cree un nouveau classement si cette course n'existe pas
          System.out.print("\nCourse = " + items[7]);
          temp=classements.get(items[7]);             //permet de mettre a jour l'adresse de temp
        }
        temp.addDonne(items);  //ajoute les donne sur cette course dans le classement selectionne
      }
      lecteurAvecBuffer.close();
    }
    catch(Exception e)
    {
        System.out.println("\nErreur fichier : "+e.getMessage()+" "+e.getLocalizedMessage());
    }
  }

  /**
    * Cette fonction permet d'afficher les statistiques sur les courses contenue dans cette instance
    */
  public void displayStat()
  {
    Set<String> s = classements.keySet(); //recupere l'ensemble des cle de la Hashtable
    Iterator<String> i = s.iterator();
    String keyTemp;

    while(i.hasNext())
    {
      keyTemp = i.next();
      System.out.print("\nCourse " + keyTemp + " " + annee + " : ");
      System.out.print("-nombre de participants = " + classements.get(keyTemp).getNombreParticipants());
      System.out.print("\n                    -duree moyenne = " + classements.get(keyTemp).getDureeMoyenne());
      System.out.print("\n                    -nation represente = " + classements.get(keyTemp).getListeNation());
      System.out.print("\n                    -10 premiers = " + classements.get(keyTemp).getSubClassement(0, 10) + "\n");
    }    
  }

  /**
    * Retourne l'ensemble des courses de cette instance, c'est a dire l'ensemble des cle de la Hashtable
    * @return ensemble des cle sous forme de set<String>
    */
  public Set<String> getCourse()
  {
    return classements.keySet();
  }

  /**
   * Retourne le premier arrive d'une course, null si cette course n'a pas eu lieu cette anne
   * @param course String representant une course
   * @return Donne sur le premier
   * @see Classement
   * @see Donne
   */
  public Donne getFirst(String course)
  {
    if(classements.get(course)!=null) //regarde si cette course existe dans la Hashtable
    {
      return classements.get(course).getFirst(); //retourne le premier si c'est le cas
    }
    return null; //retourne null sinon
  }

  /**
   * Retourne l'objet classement d'une course passe en parametre
   * @param course String representant la course
   * @return Classement de la course
   * @see Classement
   */
  public Classement get(String course)
  {
    return classements.get(course);
  }

  /**
   * Remplit un ArrayList de Donne avec les donnes du courreur avec le nom en parametre
   * @param nom nom du coureur recherche
   * @param data ArrayList a remplir
   */
  public void getDataOf(String nom, ArrayList<Donne> data)
  {
    Set<String> s = classements.keySet(); //recupere l'ensemble des cle de la Hashtable
    Iterator<String> i = s.iterator();

    while(i.hasNext())
    {
      classements.get(i.next()).getDataOf(nom, data);
    }
  }
}
