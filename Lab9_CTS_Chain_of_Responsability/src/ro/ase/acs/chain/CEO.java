package ro.ase.acs.chain;

public class CEO extends  CallCenterHandler{
    @Override
    public boolean refund(double sum) {
        System.out.println("The refund was handled by the CEO!");
        return true;
    }
}
