package entities;

import java.util.ArrayList;
import java.util.List;

public class Constantes {
	
	/*
	 * Pour ajouter un NOM il suffit d'ajouter une ligne dans la méthode init :
	 * listeEtds.add("NOM Prenom");
	 */
	
	public static List<String> listeEtds = new ArrayList<String>();
	
	public void init(){
		listeEtds.add("MEJRI Houssem");
    listeEtds.add("MEJRI Houssem STD");
		listeEtds.add("BRINI Maher");
	}

	public List<String> getListeEtds() {
		return listeEtds;
	}

	
	
	

}
