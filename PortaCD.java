package classeCd;

import java.util.ArrayList;

public class PortaCD {
    private ArrayList<CD> arrCD;
    private int nTotali;

    public PortaCD(int n) {
        arrCD = new ArrayList<CD>();
        nTotali = n;
    }

    public String addCD(CD nuovoCD) {
        String str = "";
        if (arrCD.size() < nTotali) {
            arrCD.add(nuovoCD);
            str = "CD aggiunto";
        } else
            str = "Numero massimo di CD aggiunti";
        return str;
    }

    public CD getCD(int indice) {
        return arrCD.get(indice);
    }

    public CD setCD(int indice, CD daSostituire) {
        CD cdrimosso = arrCD.get(indice);
        arrCD.set(indice, daSostituire);
        return cdrimosso;
    }

    public void killCD(int indice) {
        arrCD.remove(indice);
    }

    public int getN() {
        return arrCD.size();
    }

    public int cercaCDperTitolo(String titolo) {
        for (int i = 0; i < arrCD.size(); i++) {
            if (arrCD.get(i).getTitolo().equals(titolo)) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < arrCD.size(); i++) {
            str += arrCD.get(i).toString() + "\n";
        }
        return str;
    }

    public PortaCD confrontaCollezione(PortaCD portacd) {
        int n;

        if(arrCD.size() > portacd.arrCD.size()){
            n = arrCD.size();
        }else{
            n = portacd.arrCD.size();
        }

        PortaCD cdInComune = new PortaCD(n);

        for (int i = 0; i < arrCD.size(); i++) {
            for (int j = 0; j < portacd.arrCD.size(); j++) {
                if (arrCD.get(i).confrontaCD(portacd.arrCD.get(j))) {
                    cdInComune.addCD(portacd.arrCD.get(j));
                }
            }
        }
        return cdInComune;
    }
}
