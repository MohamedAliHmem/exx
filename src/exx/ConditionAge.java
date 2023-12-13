package exx;

public class ConditionAge implements ConditionAccess{
	int AgeMin ;

	public ConditionAge(int ageMin) {
		AgeMin = ageMin;
	}
	
	public boolean accessPossible(Personne p) {
		if(p.getAge()> this.AgeMin)
			return true;
		else
			return false;
	}
	
	
	
	
}
