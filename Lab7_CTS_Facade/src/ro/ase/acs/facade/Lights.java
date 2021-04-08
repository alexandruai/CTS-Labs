package ro.ase.acs.facade;

public class Lights {
    private boolean areHeadLightsOn;
    private boolean areBrakeLightsOn;
    private boolean areHazardeLightsOn;
    private boolean isSignalLeftOn;
    private boolean isSignalRighttOn;

    public boolean areHeadLightsOn() {
        return areHeadLightsOn;
    }

    public void setAreHeadLightsOn(boolean areHeadLightsOn) {
        this.areHeadLightsOn = areHeadLightsOn;
        System.out.println(areHeadLightsOn ? "Head lights on" : "Head lights off");

    }

    public boolean areBrakeLightsOn() {
        return areBrakeLightsOn;
    }

    public void setAreBrakeLightsOn(boolean areBrakeLightsOn) {
        this.areBrakeLightsOn = areBrakeLightsOn;
        System.out.println(areBrakeLightsOn ? "Brake lights on" : "Brake lights off");
    }

    public boolean areHazardeLightsOn() {
        return areHazardeLightsOn;
    }

    public void setAreHazardeLightsOn(boolean areHazardeLightsOn) {
        this.areHazardeLightsOn = areHazardeLightsOn;
        System.out.println(areHazardeLightsOn ? "Hazard lights on" : "Hazard lights off");
    }

    public boolean isSignalLeftOn() {
        return isSignalLeftOn;
    }

    public void setSignalLeftOn(boolean signalLeftOn) {
        isSignalLeftOn = signalLeftOn;
        System.out.println(isSignalLeftOn ? "Signal left on" : "Signal left off");
    }

    public boolean isSignalRighttOn() {
        return isSignalRighttOn;
    }

    public void setSignalRighttOn(boolean signalRighttOn) {
        isSignalRighttOn = signalRighttOn;
        System.out.println(isSignalRighttOn ? "HSignal right on" : "Signal right off");
    }
}
