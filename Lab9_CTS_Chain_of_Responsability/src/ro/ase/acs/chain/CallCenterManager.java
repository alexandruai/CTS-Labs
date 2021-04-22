package ro.ase.acs.chain;

public class CallCenterManager extends  CallCenterHandler{

    @Override
    public boolean refund(double sum) {
        if( sum < 1000){
            System.out.println("The refund was handled by the call center manger!");
            return  true;
        } else if(nextHandler != null){
            return nextHandler.refund(sum);
        }
        System.out.println("Refund not possible");
        return false;
    }
}
