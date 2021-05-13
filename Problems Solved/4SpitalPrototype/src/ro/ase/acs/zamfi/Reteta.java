import ro.ase.acs.zamfi.RetetaAbstracta;

public class Reteta implements RetetaAbstracta {
    private int numarReteta;
    private float cantitate = 0;
    private String farmacist;

    public Reteta(int numarReteta, float cantitate, String farmacist) {
        this.numarReteta = numarReteta;
        this.cantitate = cantitate;
        this.farmacist = farmacist;
    }

    public Reteta() {
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "numarReteta=" + numarReteta +
                ", cantitate=" + cantitate +
                ", farmacist='" + farmacist + '\'' +
                '}';
    }

    @Override
    public RetetaAbstracta copiazaReteta() {
       Reteta copie = new Reteta();
       copie.numarReteta = this.numarReteta;
       copie.cantitate = this.cantitate;
       copie.farmacist = this.farmacist;
       return copie;
    }
}
