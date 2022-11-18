package logika;

public class PrikazOtevri implements IPrikaz {

    private static final String NAZEV = "otevři";
    private HerniPlan plan;

    public PrikazOtevri(HerniPlan plan) {
        this.plan = plan;
    }

    @Override
    public String provedPrikaz(String... parametry) {

        if (parametry.length == 0) {
            // pokud chybí druhé slovo (nazev truhly), tak ....
            return "Nevím co chceš otevřít. Zadej název truhly.";
        }

        if(parametry.length == 2) {
            String truhla = parametry[0] + " " + parametry[1];
            if(plan.getAktualniProstor().truhlaExistuje(truhla)) {
                plan.getAktualniProstor().vratTruhlu(truhla).otevriTruhlu();
                return "Otevřel si truhlu.";
            }else{
                return "Truhla, kterou se snažíš otevřít neexistuje!";
            }

        }else{
            return "Zadali jste špatně název truhly!";
        }

    }

    @Override
    public String getNazev() {
        return NAZEV;
    }
}
