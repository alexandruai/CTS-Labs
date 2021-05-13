package ro.ase.acs.decorator;

public class FunctionalitateAfisareOnline implements FunctionalitateAfisare{
    private int nrPacienti;
    private int nrTotalRezultate;

    public FunctionalitateAfisareOnline(int nrPacienti, int nrTotalRezultate) {
        this.nrPacienti = nrPacienti;
        this.nrTotalRezultate = nrTotalRezultate;
    }

    public int getNrPacienti() {
        return nrPacienti;
    }

    public void setNrPacienti(int nrPacienti) {
        this.nrPacienti = nrPacienti;
    }

    public int getNrTotalRezultate() {
        return nrTotalRezultate;
    }

    public void setNrTotalRezultate(int nrTotalRezultate) {
        this.nrTotalRezultate = nrTotalRezultate;
    }

    @Override
    public String toString() {
        return "Platforma{" +
                "nrPacienti=" + nrPacienti +
                ", nrTotalRezultate=" + nrTotalRezultate +
                '}';
    }

    public void afiseazaRezultatePacienti(){
        System.out.println("Se afiseaza online rezultate pacientiilor");
        System.out.println(this.toString());
    }
}
