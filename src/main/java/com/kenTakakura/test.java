package com.kenTakakura;

import com.birdbrain.Finch;

public class test {
    public static void main(String[] args) {
        Finch ado = new Finch();
        // credit to Arman hayrapetyan
        int[] arr = {0, 0, 0, 0, 0, 
                     0, 0, 0, 0, 0, 
                     1, 0, 0, 1, 0, 
                     0, 0, 0, 0, 0, 
                     0, 0, 0, 0, 0};
        ado.setDisplay(arr); 
        ado.pause(0.1);   
        int[] A = {0, 0, 0, 0, 0, 
               0, 0, 0, 0, 0, 
               0, 1, 0, 1, 0, 
               0, 0, 0, 0, 0, 
               0, 0, 0, 0, 0};
        ado.setDisplay(A); 
        ado.pause(0.1); 
        int[] AA = {0, 0, 0, 0, 0, 
               0, 0, 0, 0, 0, 
               0, 0, 1, 1, 0, 
               0, 0, 0, 0, 0, 
               0, 0, 0, 0, 0};
        ado.setDisplay(AA); 
        ado.pause(0.1); 
        //fruit
        int[] Arr = {0, 0, 0, 0, 0, 
               0, 0, 0, 0, 0, 
               0, 0, 1, 1, 0, 
               1, 0, 0, 0, 0, 
               0, 0, 0, 0, 0};
        ado.setDisplay(Arr); 
        ado.playNote(95, 0.075);
        ado.pause(0.1);

        int[] Arr = {0, 0, 0, 0, 0, 
                    0, 0, 0, 0, 0, 
                    0, 0, 0, 1, 0, 
                    1, 0, 0, 1, 0, 
                    0, 0, 0, 0, 0};

        int[] Arr = {0, 0, 0, 0, 0, 
                    0, 0, 0, 0, 0, 
                    0, 0, 0, 0, 0, 
                    1, 0, 1, 1, 0, 
                    0, 0, 0, 0, 0};

        int[] Arr = {0, 0, 0, 0, 0, 
                    0, 0, 0, 0, 0, 
                    0, 0, 0, 0, 0, 
                    1, 1, 1, 1, 0, 
                    0, 0, 0, 0, 0};
        

        //fruit

        int[] Arr = {0, 0, 0, 0, 0, 
                     0, 0, 0, 0, 0, 
                     0, 0, 0, 1, 0, 
                      1, 0, 0, 1, 0, 
                       0, 0, 0, 0, 0};
        
        













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







        ado.stopAll();
        ado.disconnect();
    }
}