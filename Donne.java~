/**
 * Classe permettant de representer une donne du fichier CSV, autrement dit une ligne
 */
public class Donne implements Comparable<Donne>
{
  /**
   * numero du dossart
   */
  private int dossart;

  /**
   * place au classement
   */
  private int classement;

  /**
   * nom
   */
  private String nom;

  /**
   * date de naissance
   */
  private int naissance;

  /**
   * club
   */
  private String club;

  /**
   * nation
   */
  private String nation;

  /**
   * heure d'arrive
   */
  private String arrive;

  /**
   * course courrue
   */
  private String course;

  /**
   * categorie
   */
  private String nom_catergorie;

  /**
   * classement dans cette categorie
   */
  private String classement_cat;

  /**
    * Constructeur qui initialise les attributs grace au valeur envoyees en parametre
    * @param items tableau de string contenant les valeurs des differents attributs
    */
  Donne(String[] items)
  {
    dossart=Integer.parseInt(items[0]);
    classement=Integer.parseInt(items[1]);
    nom=items[2];
    naissance=Integer.parseInt(items[3]);
    club=items[4];
    nation=items[5];
    arrive=items[6];
    course=items[7];
    nom_catergorie=items[8];
    classement_cat=items[9];
  }

  /**
   * Renvoie la nation
   * @return attribut nation
   */
  String getNation()
  {
    return nation;
  }

  /**
   * Renvoie le temps du courreur sous forme d'int
   * @return temps du courreur sous forme d'int
   */
  int getArriveAsInt()
  {
    String [] champ = arrive.split("[^0123456789]");
    return (Integer.parseInt(champ[0])*3600)+(Integer.parseInt(champ[1])*60)+Integer.parseInt(champ[2]);
  }

  /**
   * Renvoie la position du courreur au classement
   * @return attribut classement
   */
  int getClassement()
  {
    return classement;
  }

  /**
   * Implemente la methode compareTo de l'interface camparable
   * deux donnes sont compare en fonction de la place du joueur dans la classement
   * @param d donne contre laquelle cette instance sera compare
   * @return resultat de la comparaison
   */
  public int compareTo(Donne d)
  {
    return classement - d.getClassement();
  }

  /**
   * Renvoie le nom du courreur pour l'affichage
   * @return attribut nom
   */
  public String toString()
  {
    return nom;
  }

  /**
   * Renvoi la course courrue
   * @return nom de la course
   */
  public String getCourse()
  {
    return course;
  }
}
