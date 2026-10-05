package personne;


public class personne {
	private String nom ;
	private String prenom ;
	private int age ;
	private String sexe ;

public personne() {
		nom = "ben ali";
		prenom = "med";
		age = 30;
		sexe ="masculin";
		
}
public personne( String nom , String prenom , int age  , String sexe) {
	this.nom = nom;
	this.prenom =prenom;
	this.age = age ;
	this.sexe = sexe;
	}
public String getnom() {
	return nom;
}
public String getprenom() {
	return prenom;
}
public int age() {
	return age;
}
public String getsexe() {
	return sexe;
}
public void Affiche() {
    System.out.println(this.nom +" "+this.prenom+" "+this.age+" "+this.sexe);
}
public boolean samelastname(personne p2) {
    if (p2 == null) {
        return false;
    }
    return this.nom == p2.nom;
}
public static void main(String[] args) {
    personne p1 = new personne();

    p1.Affiche();
}
}
