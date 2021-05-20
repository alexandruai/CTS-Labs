package ro.ase.acs.adapter;

public class MedicamentSpital implements InterfataMedicamentSpital{

    private String reteta;
    private String numeMedicament;

    public MedicamentSpital(String reteta, String numeMedicament) {
        this.reteta = reteta;
        this.numeMedicament = numeMedicament;
    }

    public void achizitioneazaMedicament(){
        if(this.reteta != null){
            this.prezintaReteta();
        } else {
            System.out.println("Nu s-a achizitionat reteta");
        }
    }

    public void prezintaReteta(){
        System.out.println(this.reteta);
        System.out.println(this.numeMedicament);
    }

}
