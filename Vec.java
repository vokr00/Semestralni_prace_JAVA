package logika;


/**
 * Třída věc - popisuje jednotlivou věc ve hře
 * 
 *  "Vec" reprezentuje jednu věc ve scénáři hry. Věc může být přenositelná 
 *  (tj. hráč některé věci může vzít a některé ne)
 * @author Jan Černý
 * @version 0.1
 * @created duben 2020
 */
public class Vec
{
    private String nazev;
    private boolean prenositelna;

    /**
     * Constructor for objects of class Vec
     */
    public Vec(String nazev, boolean prenositelna)
    {
        this.nazev = nazev;
        this.prenositelna = prenositelna;
    }

    /**
     * Vrací název věci
     * 
     * @return název věci
     */
    public String getNazev(){
        return nazev;
    }
    
    /**
     * Vrací informaci o tom, za je věc přenositelná ve hře
     * 
     * @return true, pokud je věc přenositelná, jinak false
     */
    public boolean jePrenositelna(){
        return prenositelna;
    }
    
        @Override
        public boolean equals(Object o){
        if(this == o){
            return true;
        }
        
        if(!(o instanceof Vec)){
            return false;
        }
        
        Vec druhy = (Vec) o;
        
        return (java.util.Objects.equals(this.nazev, druhy.getNazev()));
    }
    
    @Override
    public int hashCode(){
        int vysledek = 3;
        int hashNazvu = java.util.Objects.hashCode(this.nazev);
        vysledek = (hashNazvu + vysledek) * 37 ;
        return vysledek;
    }

}

