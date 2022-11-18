package logika;


/**
 *  Class HerniPlan - třída představující mapu a stav adventury.
 * 
 *  Tato třída inicializuje prvky ze kterých se hra skládá:
 *  vytváří všechny prostory,
 *  propojuje je vzájemně pomocí východů 
 *  a pamatuje si aktuální prostor, ve kterém se hráč právě nachází.
 *
 *@author     Michael Kolling, Lubos Pavlicek, Jarmila Pavlickova
 *@version    pro školní rok 2016/2017
 */
public class HerniPlan {
    
    private Prostor aktualniProstor;

    
    
     /**
     *  Konstruktor který vytváří jednotlivé prostory a propojuje je pomocí východů.
     *  Jako výchozí aktuální prostor nastaví halu.
     */
    public HerniPlan() {
        zalozProstoryHry();
    }
    /**
     *  Vytváří jednotlivé prostory a propojuje je pomocí východů.
     *  Jako výchozí aktuální prostor nastaví domeček.
     */
    private void zalozProstoryHry() {
        // vytvářejí se jednotlivé prostory

        Prostor prizemiVeze = new Prostor( "přízemí", "přízemí věže",
                new Truhla("Magická truhla",
                        new Vec("Kouzelná hůlka",true)));

        Prostor patro1 =
                new Prostor("první podlaží","první podlaží věže",
                        new Truhla("Magická truhla",
                                new Vec("Kouzelné boty", true)));

        Prostor patro2 =
                new Prostor("druhý podlaží", "druhé podlaží věže",
                        new Truhla("Magická truhla",
                                new Vec("Kouzelný meč", true)));

        Prostor patro3 =
                new Prostor("třetí podlaží","třetí podlaží věže",
                        new Truhla("Magická truhla",
                                new Vec("Kouzelný pásek", true)));

        Prostor patro4 =
                new Prostor("čtvrté podlaží","čtvrté podlaží věže",
                        new Truhla ("Magická truhla",
                                new Vec("Kouzelný plášť", true)));

        Prostor patro5 =
                new Prostor("páté podlaží","páte podlaží věže",
                        new Truhla("Magická truhla",
                                new Vec("Kouzelný svitek", true)));

        Prostor patro6 =
                new Prostor("šesté podlaží", "šesté podlaží věže",
                        new Truhla("Magická truhla",
                                new Vec("Kouzelný prsten", true)));

        Prostor patro7 = new Prostor("sedmé podlaží", "sedmé podlaží věže",
                new Truhla("Zlatá truhla",
                        new Vec("Barevné drahokamy", true),
                                new Vec("Zlaté mince", true),
                                        new Vec("Prsten s diamantem", true)));
        
        // přiřazují se průchody mezi prostory (sousedící prostory)
        prizemiVeze.setVychod(patro1);
        patro1.setVychod(prizemiVeze);
        patro1.setVychod(patro2);
        patro2.setVychod(patro1);
        patro2.setVychod(patro3);
        patro3.setVychod(patro2);
        patro3.setVychod(patro4);
        patro4.setVychod(patro3);
        patro4.setVychod(patro5);
        patro5.setVychod(patro4);
        patro5.setVychod(patro6);
        patro6.setVychod(patro5);
        patro6.setVychod(patro7);;


        aktualniProstor = prizemiVeze;  // hra začíná v přízemí věže
    }
    
    /**
     *  Metoda vrací odkaz na aktuální prostor, ve ktetém se hráč právě nachází.
     *
     *@return     aktuální prostor
     */
    
    public Prostor getAktualniProstor() {
        return aktualniProstor;
    }
    
    /**
     *  Metoda nastaví aktuální prostor, používá se nejčastěji při přechodu mezi prostory
     *
     *@param  prostor nový aktuální prostor
     */
    public void setAktualniProstor(Prostor prostor) {
       aktualniProstor = prostor;
    }


}
