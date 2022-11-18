package logika;

/**
 * @author Roman Vokál
 *@version školní rok 2019/2020
 */    

class PrikazJdi implements IPrikaz {
    private static final String NAZEV = "jdi";
    private HerniPlan plan;
    
    /**
    *  Konstruktor třídy
    *  
    *  @param plan herní plán, ve kterém se bude ve hře "chodit" 
    */    
    public PrikazJdi(HerniPlan plan) {
        this.plan = plan;
    }
    /**
     *  Provádí příkaz "jdi". Zkouší se vyjít do zadaného prostoru. Pokud prostor
     *  existuje, vstoupí se do nového prostoru. Pokud zadaný sousední prostor
     *  (východ) není, vypíše se chybové hlášení.
     *
     *@param parametry - jako  parametr obsahuje jméno prostoru (východu),
     *                         do kterého se má jít.
     *@return zpráva, kterou vypíše hra hráči
     */ 
    @Override
    public String provedPrikaz(String... parametry) {
        if (parametry.length == 0) {
            // pokud chybí druhé slovo (sousední prostor), tak ....
            return "Kam mám jít? Musíš zadat jméno východu";
        }

        if (parametry.length == 2) {
            String smer = parametry[0] + " " + parametry[1];
            Prostor sousedniProstor = plan.getAktualniProstor().vratSousedniProstor(smer);

            if (sousedniProstor == null) {
                return "Tam se odsud jít nedá!";
            }
            else {
                plan.setAktualniProstor(sousedniProstor);
                return sousedniProstor.dlouhyPopis();
            }
        }else {
            String smer = parametry[0];
            Prostor sousedniProstor = plan.getAktualniProstor().vratSousedniProstor(smer);

            if (sousedniProstor == null) {
                return "Tam se odsud jít nedá!";
            }
            else {
                plan.setAktualniProstor(sousedniProstor);
                return sousedniProstor.dlouhyPopis();
            }
        }

    }
    
    /**
     *  Metoda vrací název příkazu (slovo které používá hráč pro jeho vyvolání)
     *  
     *  @ return nazev prikazu
     */
    @Override
    public String getNazev() {
        return NAZEV;
    }

}
