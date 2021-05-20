package ro.ase.acs.adapter;

public class SpitalToFarmacieObjAdapter implements InterfataMedicamentFarmacie {
    private InterfataMedicamentSpital medicamentSpital;

    public SpitalToFarmacieObjAdapter(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        this.medicamentSpital.achizitioneazaMedicament();
    }
}