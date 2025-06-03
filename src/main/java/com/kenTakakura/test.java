package com.kenTakakura;

import com.birdbrain.Finch;

public class test {
    public static void main(String[] args) {
        Finch ado = new Finch();
        // credit to Arman hayrapetyan
        // int[] arr = {0, 0, 0, 0, 0, 
        //              0, 1, 0, 1, 0, 
        //              0, 0, 0, 0, 0, 
        //              1, 0, 0, 0, 1, 
        //              0, 1, 1, 1, 0};
        // ado.setTurn("L", 720, 100);
        // ado.setDisplay(arr);
        
        // ado.setMove("F", 50, 30);

        // int[] aa = {1, 1, 1, 1, 1, 
        //             1, 0, 1, 0, 1, 
        //             1, 1, 1, 1, 1, 
        //             0, 1, 1, 1, 0, 
        //             1, 0, 0, 0, 1};
        // ado.setDisplay(aa);
        // ado.pause(2.0);
        
        //licky
        // ado.playNote(100, 0.5);
        // ado.pause(0.2);
        // ado.playNote(102, 0.5);
        // ado.pause(0.2);
        // ado.playNote(103, 0.5);
        // ado.pause(0.2);
        // ado.playNote(105, 0.5);
        // ado.pause(0.2);
        // ado.playNote(102, 1.0);
        // ado.pause(0.4);
        // ado.playNote(98, 0.5);
        // ado.pause(0.2);
        // ado.playNote(100, 0.5);
        // ado.pause(0.2);
        // ado.pause(2.0);


        //asian
        // ado.playNote(95, 0.075);
        // ado.pause(0.1);
        // ado.playNote(95, 0.075);
        // ado.pause(0.1);
        // ado.playNote(95, 0.075);
        // ado.pause(0.1);
        // ado.playNote(95, 0.075);
        // ado.pause(0.1);
        // ado.playNote(93, 0.075);
        // ado.pause(0.2);
        // ado.playNote(93, 0.075);
        // ado.pause(0.2);
        // ado.playNote(90, 0.075);
        // ado.pause(0.2);
        // ado.playNote(90, 0.075);
        // ado.pause(0.2);
        // ado.playNote(93, 0.5);
        // ado.pause(0.4);


        ado.setTurn("R", 720, 100);
        ado.setTurn("L", 360, 100);
        ado.setTurn("R", 451, 100);
        ado.setTurn("L", 335, 100);


        ado.stopAll();
        ado.disconnect();
    }
}