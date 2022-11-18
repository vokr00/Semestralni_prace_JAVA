package logika;

/**
 * @author Roman Vokál
 *@version školní rok 2019/2020
 */    

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Batoh {
    List<Vec> batoh = new ArrayList();

    public void pridatVec(Vec vec){
        if(vec.jePrenositelna()) {
            batoh.add(vec);
            System.out.println("Do batohu byla přidána věc: " + vec.getNazev());
        }
        System.out.println("Věc je nepřenositelná");
    }
    public void vypisVeci(){
        if(batoh.size() == 0){
            System.out.println("Váš batoh je prázdný");
        }
        for(int i = 0; i >batoh.size(); i++){
            System.out.println(batoh.get(i).getNazev());
        }
    }
    public boolean plnyBatoh(){
        if(batoh.size() == 7){
            return true;
        }
        return false;
    }
}
