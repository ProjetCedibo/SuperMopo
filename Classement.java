import java.util.*;

/**
  * Classe permettat de representer le classement d'une course, 
  * elle contient un ArrayList des donnes des participants a cette course
  */
public class Classement
{
  /**
    * Contient les donnes de chaque participant a cette course
    */
  private ArrayList<Donne> donnes;

  /**
    * Constructeur par defaut, instancie l'ArrayList
    */
  Classement()
  {
    donnes = new ArrayList<>();
  }

 /**
   * Ajoute une nouvelle donne a la course
   * @param items tableau de String representant les donnes
   */
  public void addDonne(String [] items)
  {
    donnes.add(new Donne(items));
  }

  /**
    * Renvoi le nombre de participant
    * @return Nombre de participant
    */
  int getNombreParticipants()
  {
    return donnes.size();
  }

  /**
    * Calcul et renvoi la duree moyenne sous forme d'une chaine
    * @return chaine representant la duree moyenne sous la forme "X h X mn X s"
    */
  public String getDureeMoyenne()
  {
    double moyenne=0;

    for(int i=0;i<donnes.size();i++)
    {
      moyenne=moyenne+(double)(donnes.get(i).getArriveAsInt());
    }

    moyenne=moyenne/(double)(donnes.size());

    String heures   = String.valueOf((int)(moyenne/3600));
    String minutes  = String.valueOf((int)((moyenne % 3600) / 60));
    String secondes = String.valueOf((int)((moyenne % 3600) % 60));

    return heures + "h " + minutes + "mn " + secondes + "s";
  }

  /**
    * Permet de connaitre le nombre de chaque participant de chaque nation qui a participe a la course.
    * Cette fonction retourne une Hashtable ou chaque cle est une nation avec au moins un participant et ou l'element associe 
    * est le nombre de participants de cette nation sous forme d'Entier
    * @return une Hashtable<String, Entier>
    * @see Entier
    */
  public Hashtable<String, Entier> getListeNation()
  {
    Hashtable<String, Entier> liste = new Hashtable<>();

    for(int i=0;i<donnes.size();i++)    
    {
        if(liste.get(donnes.get(i).getNation())==null)
        {
          liste.put(donnes.get(i).getNation(), new Entier());
        }
        liste.get(donnes.get(i).getNation()).incremente();
    }

    return liste;
  }

  /**
    * Retourne les courreurs dans l'interval donne
    * @param debut de l'interval
    * @param fin de l'interval
    * @return une Liste qui contient les Donne des 10 premiers courreurs
    * @see Donne
    */
  public List<Donne> getSubClassement(int debut, int fin)
  {
    Collections.sort(donnes);
    return donnes.subList(debut, fin);
  }

  /**
    * Retourne le courreur arrive premier a cette course
    * @return Donne du premier joueur
    * @see Donne
    */
  public Donne getFirst()
  {
    Collections.sort(donnes);
    return donnes.get(0);
  }

  /**
   * Remplit un ArrayList de Donne avec les donnes du courreur avec le nom en parametre
   * @param nom nom du coureur recherche
   * @param data ArrayList a remplir
   */
  public void getDataOf(String nom, ArrayList<Donne> data)
  {
    for(int i=0;i<donnes.size();i++)
    {
      if(donnes.get(i).toString().contains(nom))
      {
        data.add(donnes.get(i));
      }
    }
  }
}
