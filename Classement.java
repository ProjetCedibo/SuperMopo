import java.util.*;


public class Classement
{
  //Contient les donnees de chaque participant a cette course
    
  private ArrayList<Participation> donnees;

  Classement(){
    donnees = new ArrayList<>();
  }

  public void addDonnees(String [] items){
    donnees.add(new Participation(items));
  }

  int getNombreParticipants(){
    return donnees.size();
  }

  public String getDureeMoyenne(){
    double moyenne=0;

    for(int i=0;i<donnees.size();i++){
      moyenne=moyenne+(double)(donnees.get(i).getArrivee());
    }

    moyenne=moyenne/(double)(donnees.size());

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

    for(int i=0;i<donnees.size();i++)    {
        if(liste.get(donnees.get(i).getNation())==null){
          liste.put(donnees.get(i).getNation(), new Entier());
        }
        liste.get(donnees.get(i).getNation()).incremente();
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
    Collections.sort(donnees);
    return donnees.subList(debut, fin);
  }

  public Participation getGagnant(){
    Collections.sort(donnees);
    return donnees.get(0);
  }

  /**
   * Remplit un ArrayList de Donne avec les donnees du courreur avec le nom en parametre
   * @param nom nom du coureur recherche
   * @param data ArrayList a remplir
   */
  public void getDataOf(String nom, ArrayList<Participation> data){
    for(int i=0;i<donnees.size();i++){
      if(donnees.get(i).toString().contains(nom)){
        data.add(donnees.get(i));
      }
    }
  }
}
