public class Wilder{

// attributs

    private String firstname;
    private Boolean aware;


    // constructeurs par défaut

    public Wilder(String firstname){
        this.firstname = firstname;
        this.aware = true;
    }
    // constructeurs

    public Wilder(String firstname, boolean aware){
        this.firstname = firstname;
        this.aware = true;
    }



// accesseur (getters)

    public String getFirstname(){
        return this.firstname;
    }
    public Boolean isAware(){
        return this.aware;
    }


    // mutateurs (setters)
    
    	public void setFirstname(String firstname) {
		this.firstname = firstname;	
	}

    public void setAware(boolean aware){
        this.aware = aware;
    }

// méthode instanciée

	public String whoAmI() {

		if (this.isAware() == true) {
			return "Je m'appelle " + this.getFirstname() + " et je suis aware, grace a la méthode instanciée.";
		} 
		else {
			return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware, grace a un setteur qui m'a permis de ne pas l'etre.";
		}
	}

} 
