package main;

import media.Radio;
import media.Television;

public class Main {

    public static void main(String[] args) {
        Television Samsung = new Television();
        Samsung.setVolume(5);
        Samsung.setCurrentProgram(10);
        Samsung.setTurnOn(true);

        Samsung.showProgram();
        
        
        Radio Sony = new Radio(91.8, 600, 'A');
        //Radio.setBand(true);
        //Radio.setFmFrenquency(91.8);
        //Radio.setAmFrequency(600);

        Sony.ListenRadio();
    }

}
