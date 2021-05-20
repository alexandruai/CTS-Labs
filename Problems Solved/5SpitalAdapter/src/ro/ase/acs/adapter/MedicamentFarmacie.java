package ro.ase.acs.adapter;

public class MedicamentFarmacie implements InterfataMedicamentFarmacie{
    private String numeMedicament;

    public MedicamentFarmacie(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    public void cumparaMedicament(){
        System.out.println("S-a cumparat: " + this.numeMedicament);
    }
}
