
 
package media;


public class Television {
    private int volume ;
    private int currentProgram = 0;
    private boolean turnOn;
    
    public Television() {

        this.volume =0;
        this.currentProgram = 0;
        this.turnOn =  true;
    }
 
    public Television(int volume, int currentProgram, boolean turnOn) {

        this.volume = volume;
        this.currentProgram = currentProgram;
        this.turnOn = turnOn;

    }

    public int getVolume() {

        return this.volume;
    }

    public void setVolume(int newVolume) {
        this.volume = newVolume;
    }

    public int getCurrentProgram() {

        return this.currentProgram;
    }

    public void setCurrentProgram(int newCurrentProgram) {
        this.currentProgram = newCurrentProgram;
    }

    public boolean getTurnOn() {

        return this.turnOn;
    }

    public void setTurnOn(boolean newTurnOn) {
        this.turnOn =  newTurnOn;
}
    
    public void showProgram() {
        System.out.println("ton je " + getVolume());
        System.out.println("Trenutni kanal je  " + getCurrentProgram());
        System.out.println("Televizor je ukljucen " + getTurnOn());
        
    }
    
}

