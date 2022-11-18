package logika;

/**
 * @author Roman Vokál
 *@version školní rok 2019/2020
 */    

import java.util.ArrayList;
import java.util.List;

public class Truhla {
    private String nazevTruhly;
    private boolean jeOtevrena;
    List<Vec> truhla;

    public Truhla(String nazevTruhly,Vec vec) {
        this.nazevTruhly = nazevTruhly;
        List<Vec> truhla = new ArrayList();
        truhla.add(vec);
        boolean jeOtevrena = false;
        this.jeOtevrena = jeOtevrena;
        this.truhla = truhla;
    }

    //vrací jestli je truhla otvřena
    public boolean JeOtevrena() {
        return jeOtevrena;
    }
    //nastavuje jestli je truhla otevřena
    public void nastavJeOtevrena(boolean jeOtevrena) {
        this.jeOtevrena = jeOtevrena;
    }

    public void otevriTruhlu(){
        nastavJeOtevrena(true);
    }

    public Truhla(String nazevTruhly) {
        this.nazevTruhly = nazevTruhly;
    }
    public Truhla(String nazevTruhly,Vec vec1, Vec vec2, Vec vec3) {
        nazevTruhly = this.nazevTruhly;
        List<Vec> truhla = new ArrayList();
        truhla.add(vec1);
        truhla.add(vec2);
        truhla.add(vec3);
        this.truhla = truhla;
    }

    public String getNazevTruhly() {
        return nazevTruhly;
    }

    public void vypisVeci(){
        if(truhla.size() == 0){
            System.out.println("Truhla je prázdná");
        }
        for(int i = 0; i >truhla.size(); i++){
            System.out.println(truhla.get(i).getNazev());
        }
    }
}
