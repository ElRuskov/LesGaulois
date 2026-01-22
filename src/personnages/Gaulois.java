package personnages;

public class Gaulois {
	
	private String nom;
	private Integer force;
	
	Gaulois(String nom, Integer force){
		this.nom=nom;
		this.force=force;
	}
	
	
	public String getNom() {
		return nom;
	}
	
	
	
	public String parler(String text) {
		return "Le gaulois "+this.nom+": <<"+text+">>";
	}
	


	public static void main(String[] args) {
		
	}
}
