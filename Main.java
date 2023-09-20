package classeCd;

public class Main {
    public static void main(String[] args) {
        PortaCD bianco = new PortaCD(6);
        PortaCD rosso = new PortaCD(9);
        CD BrotherInArms = new CD("Brother In Arms", "Dire Straits", 5, 300);
        CD Innuendo = new CD("Innuendo", "Queen", 5, 130);
        CD Queen = new CD("Queen", "Queen", 10, 140);
        CD FronteDelPalco = new CD("Queen", "Vasco", 8, 100);
        

        System.out.println("Aggiungo i CD al porta CD bianco");
        System.out.println(bianco.addCD(BrotherInArms));
        System.out.println(bianco.addCD(Innuendo));
        System.out.println(bianco.addCD(Queen));
        
        System.out.println("Aggiungo i CD al porta CD rosso");
        System.out.println(rosso.addCD(FronteDelPalco));
        System.out.println(rosso.addCD(Queen));
        System.out.println(rosso.addCD(Innuendo));

        System.out.println("------ getCD ------");
        System.out.println(bianco.getCD(0).toString());

        System.out.println("------ setCD ------");
        System.out.println("E' stato rimosso il CD: " + rosso.setCD(0, Innuendo) + " e aggiunto il CD: " + rosso.getCD(0).toString());
        System.out.println("E' stato rimosso il CD: " + rosso.setCD(2, FronteDelPalco) + " e aggiunto il CD: " + rosso.getCD(2).toString());
        
        System.out.println("------ killCD ------");
        System.out.println("Porta CD prima della rimozione: \n" + bianco.toString());
        bianco.killCD(2);
        System.out.println("Porta CD dopo della rimozione: \n" + bianco.toString());

        System.out.println("------ getN ------");
        System.out.println("Il porta CD bianco e' composto da " + bianco.getN() + " CD");

        System.out.println("------ cercaCdPerTitolo ------");
        System.out.println("Il CD " + rosso.getCD(rosso.cercaCDperTitolo("Queen")).toString() + " si trova nella posizione " + rosso.cercaCDperTitolo("Queen"));

        System.out.println("------ toString ------");
        System.out.println("Porta CD bianco: \n" + bianco.toString());

        System.out.println("------ confrontaCollezione ------");
        System.out.println("I due porta CD hanno in comune questi CD: \n" + bianco.confrontaCollezione(rosso).toString());
    }
}
