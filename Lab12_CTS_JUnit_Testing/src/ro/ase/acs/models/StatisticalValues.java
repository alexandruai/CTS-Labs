package ro.ase.acs.models;

import ro.ase.acs.exceptions.StatisticalException;

import java.util.List;

public class StatisticalValues {
    private List<Long> values;

    public void setValues(List<Long> values){
        this.values =values;
    }

    public long getMinimum(){
        long minim = Long.MAX_VALUE;

        for(int i = 0; i < values.size(); i++){
            if(values.get(i) < minim)
                minim = values.get(i);
        }
        return minim;
    }

    public double getAverrage() throws StatisticalException {
        // expresia se evalueaza de la stanga la dreapta
        // daca o gaseste pe prima true nu o mai evalueaza pe a doua
        if(values == null){
            throw new StatisticalException("Null values list");
        }

        if(values.isEmpty()){
            throw new StatisticalException("Empty list for values");
        }

        if(values.contains(null)){
            throw new StatisticalException("List has null element");
        }

        double averrage = 0;
        for(int i = 0; i < values.size(); i++){
            averrage += values.get(i);
        }
        return averrage/values.size();
    }

}
