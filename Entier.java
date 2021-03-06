/**
  * La classe entier permet d'avoir un entier sous forme d'objet ou, contrairement a la classe Integer, on peut
  * facilement en changer la valeur.
  */
public class Entier
{

  /**
    * Contient la valeur de l'entier
    */
  private int valeur;

  /**
   * Constructeur par defaut, initialise la valeur a 0
   */
  Entier()
  {
    valeur=0;
  }

  /**
   * Constructeur qui initialise la valeur a une valeur chosie
   *
   * @param v valeur choisie pour l'initalisation
   */
  Entier(int v)
  {
    valeur=v;
  }

  /**
   * Methode qui retourne la valeur actuelle de l'entier
   *
   * @return valeur actuelle
   */
  public int getValeur()
  {
    return valeur;
  }

  /**
   * Methode qui permet de changer la valeur de l'entier
   *
   * @param v nouvelle valeur
   */
  public void setValeur(int v)
  {
    valeur=v;
  }

  /**
   * Incremente la valeur de 1
   */
  public void incremente()
  {
    valeur++;
  }

  /**
   * Renvoie la valeur sous forme de chaine de caractere
   *
   * @return chaine representant la valeur
   */
  public String toString()
  {
    return Integer.toString(valeur);
  }
}
