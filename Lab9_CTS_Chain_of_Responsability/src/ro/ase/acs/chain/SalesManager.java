package ro.ase.acs.chain;

public class SalesManager extends  CallCenterHandler{
    @Override
    public boolean refund(double sum) {
        if( sum < 5000){
            System.out.println("The refund was handled by the call sales manager!");
            return  true;
        } else if( nextHandler != null){
           return nextHandler.refund(sum);
        }

        System.out.println("The refund can not be handled via call center");
        return false;

    }
}
