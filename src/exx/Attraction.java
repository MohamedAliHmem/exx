package exx;

public class Attraction {
	String nom;
	float cout ;
	ConditionAge condition_age ;
	//int personne_donne;
	//float recette_donne;
	int nb_personne = 0 ;
	float recette = 0 ;
	public Attraction(String nom, float cout, ConditionAge condition_age) {
		this.nom = nom;
		this.cout = cout;
		this.condition_age = condition_age;
		//this.nb_personne = nb_personne;
		//this.recette_donne = cout ;
		//this.nb_personne += nb_personne;
		//this.recette += cout ;
	}
	
	public String affiche() {
		return "Attraction [nom=" + nom + ", cout=" + cout + ", condition_age=" + condition_age + ", nb_personne="
				+ nb_personne + ", recette=" + recette + "]";
	}
	
	public void utilise(Personne p) throws AccesInterditException{
		if (this.condition_age.accessPossible(p)) {
			System.out.println("access possible");
			this.nb_personne += 1;
			this.recette += cout ;
		}else {
			
			throw new AccesInterditException("age exception");
		}
			
	}
	
	
	
	
}
