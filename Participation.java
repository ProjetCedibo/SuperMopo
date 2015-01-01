public class Participation implements Comparable<Participation>
{
 //Données présentes dans le fichier csv
  private int dossard, classement, naissance;
  private String nom, club, nation, arrivee, course, nom_categorie, classement_cat ;
  
  Participation(String[] menu){
    dossard=Integer.parseInt(menu[0]);
    classement=Integer.parseInt(menu[1]);
    nom=menu[2];
    naissance=Integer.parseInt(menu[3]);
    club=menu[4];
    nation=menu[5];
    arrivee=menu[6];
    course=menu[7];
    nom_categorie=menu[8];
    classement_cat=menu[9];
  }
  
  // Les getters
  
  int getDossard(){
	  return dossard;
  }
  
  int getClassement(){
    return classement;
  }

  public String toString(){
	    return nom;
  }
  
  public int getNaissance(){
	   return naissance;
  }
  
  public int compareTo(Participation d){
    return classement - d.getClassement();
  }
  
  public String club(){
	    return club;
  }
  
  String getNation(){
    return nation;
  }

  int getArrivee(){
    String [] champ = arrivee.split("[^0123456789]");
    return Integer.parseInt(champ[0])*3600 + Integer.parseInt(champ[1])*60 + Integer.parseInt(champ[2]);
  }

  public String getCourse(){
    return course;
  }

  // Les setters
  public void setDossard(int dossard){
	  this.dossard=dossard;
  }
  
  public void setClassement(int classement){
    this.classement=classement;
  }

  public void setNom(String nom){
	 this.nom = nom;
  }
  
  public void setNaissance(int naissance){
	   this.naissance = naissance;
  }
  
  public void setClub(String club){
	    this.club=club;
  }
  
  public void setNation(String nation){
    this.nation=nation;
  }

  public void setArrivee(String arrivee){
    this.arrivee = arrivee;
  }

  public void setCourse (String course){
    this.course=course;
  }
  
  public void setNomCategorie(String nom_categorie){
		this.nom_categorie = nom_categorie;
	  }
  
  public void setClassement_cat(String classement_cat){
	this.classement_cat = classement_cat;
  }
  
  
}
