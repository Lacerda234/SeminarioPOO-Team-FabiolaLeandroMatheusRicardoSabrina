import folder.Cantor; 
 public class App {   
    public static void main(String[] args) throws Exception {
        Cantor cantor = new Cantor("Chris Cornell", "Soundgarden");
        Cantor cantor2 = new Cantor("Kurt Cobain", "Nirvana");
        Cantor cantor3 = new Cantor("Eddie Vedder", "Pearl Jam");
    
        System.out.println(cantor.getNome()+", da banda "+cantor.getBanda());
        System.out.println(cantor2.getNome()+", da banda "+cantor2.getBanda());
        System.out.println(cantor3.getNome()+", da banda "+cantor3.getBanda());
    }
}
