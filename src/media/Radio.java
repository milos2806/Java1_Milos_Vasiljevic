
package media;


public class Radio {
    private double  fmFrequency = 91.8;
    private double  amFrequency = 600;
    private char band ;
            
     
    
    public Radio() {

        this.fmFrequency =0;
        this.amFrequency = 0;
        this.band =  'A';
    }

    public Radio(double  fmFrequency, double  amFrequency, char band) {

        this.fmFrequency = fmFrequency;
        this.amFrequency = amFrequency;
        this.band = band;

    }

    public double getFmFrequency() {

        return this.fmFrequency;
    }

    public void setFmFrequency(double newFmFrequency) {
        this.fmFrequency = newFmFrequency;
    }

    public double getAmFrequency() {

        return this.amFrequency;
    }

    public void setAmFrequency(double newAmFrequency) {
        this.amFrequency = newAmFrequency;
    }

    public char getBand() {

        return this.band;
    }

    public void setBand(char newBand) {
        this.band =  newBand;
}
    
    public void ListenRadio() {
        System.out.println("trenutna fm frekvencija je " + getFmFrequency());
        System.out.println("Trenutna am frekvencija je  " + getAmFrequency());
        System.out.println("Radio trenutno radi na " + getBand());
        
    }
    
    
}
