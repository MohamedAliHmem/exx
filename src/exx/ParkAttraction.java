package exx;

public class ParkAttraction {
	private Attraction [] lesAttraction ;
	private String nom;
	private int nb_attraction =0;
	public int taille ;
	
	
	
	
	
	public ParkAttraction(String nom, int taille) {
		this.lesAttraction = new Attraction[taille];
		this.nom = nom;
		this.taille = taille;
	}

	void ajoutAttraction(Attraction a) {
		if(this.nb_attraction<this.taille) {
			this.lesAttraction[this.nb_attraction] = a ;//this.lesAttraction[this.nb_attraction] = new Attraction(a.nom,a.cout,a.condition_age,a.nb_personne) ; this.lesAttraction[this.nb_attraction] = a ;
			this.nb_attraction++;
		}
		else {
			System.out.println("le tableau est plein");
		}
	}
	
	float getRecette(){
		//return this.lesAttraction[this.nb_attraction-1].recette;
		/*for(int i=0; i<this.nb_attraction;i++) {
			this.lesAttraction[i].utilise(p1);
			this.lesAttraction[i].utilise(p2);
			this.lesAttraction[i].utilise(p3);
		}
		return this.lesAttraction[this.nb_attraction-1].recette;*/
		float r =0 ;
		for(int i=0; i<this.nb_attraction;i++) {
			r += this.lesAttraction[i].cout ;
		}
		return r ;
	}
	
	void affiche() {
		System.out.println("nom du parc : "+this.nom);
		for(int i=0; i<this.nb_attraction;i++) {
			System.out.println("nom : "+this.lesAttraction[i].nom+" condition : "+this.lesAttraction[i].condition_age.AgeMin+", recette : "+this.lesAttraction[i].cout); //System.out.println("nom : "+this.lesAttraction[i].nom+" condition : "+this.lesAttraction[i].condition_age+", recette : "+this.lesAttraction[i].recette);
		}
	}



	public static void main(String[] args) {
		ParkAttraction park = new ParkAttraction("disney",5);
		
		ConditionAge c1 = new ConditionAge(18);
		ConditionAge c2 = new ConditionAge(20);
		ConditionAge c3 = new ConditionAge(35);
		
		Attraction a1 = new Attraction("a1",20,c1);
		Attraction a2 = new Attraction("a2",30,c2);
		Attraction a3 = new Attraction("a3",40,c3);
		
		park.ajoutAttraction(a1);
		park.ajoutAttraction(a2);
		park.ajoutAttraction(a3);
		
		Personne p1 = new Personne(10,50,"dali");
		Personne p2 = new Personne(50,50,"mohamed");
		Personne p3 = new Personne(30,50,"med");
		/*float a = 0;
		try {
			a = park.getRecette(p1, p2, p3);
		} catch (AccesInterditException e) {
			e.getMessage();
		}*/
		
		
		park.affiche();
		System.out.println(park.getRecette());

	}

}
