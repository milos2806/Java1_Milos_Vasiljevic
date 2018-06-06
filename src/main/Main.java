
package main;

import media.Television;


public class Main {

    public static void main(String[] args) {
        Television Samsung = new Television(5 ,10 ,true);
        //Samsung.setTunrOn(true);
        //Samsung.setVolume(5);
        //Samsung.setCurrentProgram(10);
        
        Samsung.showProgram();
    }
    
    
}
