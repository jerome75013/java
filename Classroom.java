
public class Classroom{

    public static void main(String[] args){

        // méthode instanciée:

        Wilder JeanClaude = new Wilder("Jean Claude", true);
            System.out.println(JeanClaude.whoAmI());


            
            
        // méthode instanciée et setter pour le boolean:
        
        Wilder Henri = new Wilder("Henri", false);
        Henri.setAware(false);
            System.out.println(Henri.whoAmI());
            
        
        
        
        // Exemple avec un setter:
        
        JeanClaude.setFirstname("Paul");
            System.out.println("Jean Claude devient " + JeanClaude.getFirstname() + ", grace a un setter.");
		
		
		// Méthode avec un getter suite au setter:
		
		System.out.println("Donc mon prénom " + JeanClaude.getFirstname() + ", s'affiche maintenant grace a un getter.");
        
    }

} 

