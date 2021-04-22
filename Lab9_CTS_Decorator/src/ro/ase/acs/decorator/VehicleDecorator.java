package ro.ase.acs.decorator;

public abstract class VehicleDecorator implements Vehicle{

    //Baza decorator
    private Vehicle vehicle;

    public VehicleDecorator(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void start() {
        vehicle.start();
    }

    @Override
    public void stop() {
        vehicle.stop();
    }
}
