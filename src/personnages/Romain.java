package personnages;

public class Romain {
	
	private String nom;
	private Integer force;
	
	Romain(String nom, Integer force){
		this.nom=nom;
		this.force=force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String parler(String text) {
		return "Le romain "+this.nom+": <<"+text+">>";
	}
	
	

}
