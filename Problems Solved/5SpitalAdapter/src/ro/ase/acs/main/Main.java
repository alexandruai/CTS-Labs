package ro.ase.acs.main;

import ro.ase.acs.adapter.MedicamentSpital;
import ro.ase.acs.adapter.SpitalToFarmacieObjAdapter;

public class Main {
    public static void main(String[] args) {
        MedicamentSpital medicamentSpital = new MedicamentSpital("reteta1", "paracetamol");
        SpitalToFarmacieObjAdapter adapter = new SpitalToFarmacieObjAdapter(medicamentSpital);
        adapter.cumparaMedicament();
    }
}
