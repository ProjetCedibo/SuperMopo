import java.util.*;


public class Classement
{
  //Contient les données de chaque participant à cette course
    
  private ArrayList<Participation> classement;

  Classement(){
    classement = new ArrayList<>();
  }

  public void addDonnees(String [] menu){
    classement.add(new Participation(menu));
  }

  int getNbParticipants(){
    return classement.size();
  }

  public String getDureeMoyenne(){
    double moyenne=0;

    for(int i=0;i<classement.size();i=i+1){
      moyenne=moyenne+(double)(classement.get(i).getArrivee());
    }

    moyenne=moyenne/(double)(classement.size());

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
  public Hashtable<String, Entier> getListeNation(){
    Hashtable<String, Entier> liste = new Hashtable<>();

    for(int i=0;i<classement.size();i=i+1)    {
        if(liste.get(classement.get(i).getNation())==null){
          liste.put(classement.get(i).getNation(), new Entier());
        }
        liste.get(classement.get(i).getNation()).incremente();
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
  public List<Participation> getSubClassement(int debut, int fin){
    Collections.sort(classement);
    return classement.subList(debut, fin);
  }

  public Participation getGagnant(){
    Collections.sort(classement);
    return classement.get(0);
  }

  /**
   * Remplit un ArrayList de Donne avec les classement du courreur avec le nom en parametre
   * @param nom nom du coureur recherche
   * @param data ArrayList a remplir
   */
  public void getDataOf(String nom, ArrayList<Participation> data){
    for(int i=0;i<classement.size();i=i+1){
      if(classement.get(i).toString().contains(nom)){
        data.add(classement.get(i));
      }
    }
  }
}
