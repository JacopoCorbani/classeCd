package classeCd;

public class CD {
    private String titolo;
    private String autore;
    private int nBrani;
    private int durata;

    public CD(
        String titolo,
        String autore,
        int nBrani,
        int durata){
        this.titolo = titolo;
        this.autore = autore;
        this.nBrani = nBrani;
        this.durata = durata;
    }
    public String toString(){
        return titolo + " " + autore + " " + nBrani + " " + durata;
    }
    public String getTitolo(){
        return titolo;
    }
    public boolean confrontaCD(CD cd){
        if(this.titolo.equals(cd.titolo) && this.autore.equals(cd.autore) && this.nBrani == cd.nBrani && this.durata == cd.durata){
            return true;
        }else return false;
    }
}
