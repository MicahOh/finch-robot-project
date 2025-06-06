package com.kenTakakura;

import com.birdbrain.Finch;

public class test {
    public static void main(String[] args) {
        Finch ado = new Finch();
        
       
       ado.playNote(95, 0.075);
       ado.pause(0.1);
       ado.playNote(95, 0.075);
       ado.pause(0.1);
       ado.playNote(95, 0.075);
       ado.pause(0.1);
       ado.playNote(95, 0.075);
       ado.pause(0.1);
       ado.playNote(93, 0.075);
       ado.pause(0.2);
       ado.playNote(93, 0.075);
       ado.pause(0.2);
       ado.playNote(90, 0.075);
       ado.pause(0.2);
       ado.playNote(90, 0.075);
       ado.pause(0.2);
       ado.playNote(93, 0.5);
       ado.pause(0.4);




        int[] arr = {0, 0, 0, 0, 0, 
                     0, 0, 0, 0, 0, 
                     1, 0, 0, 1, 0, 
                     0, 0, 0, 0, 0, 
                     0, 0, 0, 0, 0};
        ado.setDisplay(arr); 
        ado.pause(0.15);   
        int[] A = {0, 0, 0, 0, 0, 
               0, 0, 0, 0, 0, 
               0, 1, 0, 1, 0, 
               0, 0, 0, 0, 0, 
               0, 0, 0, 0, 0};
        ado.setDisplay(A); 
        ado.pause(0.15); 
        int[] AA = {0, 0, 0, 0, 0, 
               0, 0, 0, 0, 0, 
               0, 0, 1, 1, 0, 
               0, 0, 0, 0, 0, 
               0, 0, 0, 0, 0};
        ado.setDisplay(AA); 
        ado.pause(0.15); 
        //fruit
        int[] Arr = {0, 0, 0, 0, 0, 
               0, 0, 0, 0, 0, 
               0, 0, 1, 1, 0, 
               1, 0, 0, 0, 0, 
               0, 0, 0, 0, 0};
        ado.setDisplay(Arr); 
        ado.setBeak(0,100,0);
        ado.playNote(93, 0.075);
        ado.pause(0.15);
        ado.setBeak(0,0,0);

        int[] r = {0, 0, 0, 0, 0, 
                    0, 0, 0, 0, 0, 
                    0, 0, 0, 1, 0, 
                    1, 0, 0, 1, 0, 
                    0, 0, 0, 0, 0};
        ado.setDisplay(r); 
        ado.pause(0.15);            

        int[] zanki = {0, 0, 0, 0, 0, 
                    0, 0, 0, 0, 0, 
                    0, 0, 0, 0, 0, 
                    1, 0, 1, 1, 0, 
                    0, 0, 0, 0, 0};
       ado.setDisplay(zanki); 
        ado.pause(0.15);

        int[] heh = {0, 0, 0, 0, 0, 
                    0, 0, 0, 0, 0, 
                    0, 0, 0, 0, 0, 
                    1, 1, 1, 1, 0, 
                    0, 0, 0, 0, 0};
        ado.setDisplay(heh); 
        ado.pause(0.15);

        //fruit
        int[] gobble = {0, 0, 0, 0, 0, 
                     0, 0, 0, 0, 1, 
                     0, 0, 0, 0, 0, 
                     1, 1, 1, 0, 0, 
                     0, 0, 0, 0, 0};
       ado.setDisplay(gobble); 
       ado.setBeak(0,100,0);
        ado.playNote(93, 0.075);
        ado.pause(0.15);
        ado.setBeak(0,0,0);
        
        

        int[] ob = {0, 0, 0, 0, 0, 
                    0, 0, 0, 0, 1, 
                    1, 0, 0, 0, 0, 
                    1, 1, 0, 0, 0, 
                    0, 0, 0, 0, 0};
        ado.setDisplay(ob);
        ado.pause(0.15);

        int[] bling = {0, 0, 0, 0, 0, 
                    1, 0, 0, 0, 1, 
                    1, 0, 0, 0, 0, 
                    1, 0, 0, 0, 0, 
                    0, 0, 0, 0, 0};
        ado.setDisplay(bling); 
        ado.pause(0.15);

        int[] bang = {0, 0, 0, 0, 0, 
                    1, 1, 0, 0, 1, 
                    1, 0, 0, 0, 0, 
                    0, 0, 0, 0, 0, 
                    0, 0, 0, 0, 0};
        ado.setDisplay(bang); 
        ado.pause(0.15);

        int[] bangg = {0, 0, 0, 0, 0, 
                    1, 1, 1, 0, 1, 
                    0, 0, 0, 0, 0, 
                    0, 0, 0, 0, 0, 
                    0, 0, 0, 0, 0};
        ado.setDisplay(bangg); 
        ado.pause(0.15);

       int[] born = {0, 0, 0, 0, 0, 
                    0, 1, 1, 1, 1, 
                    0, 0, 0, 0, 0, 
                    0, 0, 0, 0, 0, 
                    0, 0, 0, 0, 0};
        ado.setDisplay(born); 
        ado.pause(0.15);

        //fruit
        int[] byo = {0, 0, 0, 0, 0, 
                    0, 1, 1, 1, 1, 
                    0, 0, 0, 0, 0, 
                    0, 1, 0, 0, 0, 
                    0, 0, 0, 0, 0};
        ado.setDisplay(byo); 
        ado.setBeak(0,100,0);
        ado.playNote(93, 0.075);
        ado.pause(0.15);
        ado.setBeak(0,0,0);


        int[] zuto = {0, 0, 0, 0, 0, 
                    0, 0, 1, 1, 1, 
                    0, 0, 0, 0, 1, 
                    0, 1, 0, 0, 0, 
                    0, 0, 0, 0, 0};
        ado.setDisplay(zuto); 
        ado.pause(0.15);

        int[] shin = {0, 0, 0, 0, 0, 
                    0, 0, 0, 1, 1, 
                    0, 0, 0, 0, 1, 
                    0, 1, 0, 0, 1, 
                    0, 0, 0, 0, 0};
        ado.setDisplay(shin); 
        ado.pause(0.15);

       int[] wo = {0, 0, 0, 0, 0, 
                    0, 0, 0, 0, 1, 
                    0, 0, 0, 0, 1, 
                    0, 1, 0, 1, 1, 
                    0, 0, 0, 0, 0};
        ado.setDisplay(wo); 
        ado.pause(0.15);

       int[] kamu = {0, 0, 0, 0, 0, 
                    0, 0, 0, 0, 0, 
                    0, 0, 0, 0, 1, 
                    0, 1, 1, 1, 1, 
                    0, 0, 0, 0, 0};
        ado.setDisplay(kamu); 
        ado.pause(0.15);

       //fruit
       int[] kira = {0, 0, 0, 0, 0, 
                    0, 0, 0, 1, 0, 
                    0, 0, 0, 0, 1, 
                    0, 1, 1, 1, 1, 
                    0, 0, 0, 0, 0};
        ado.setDisplay(kira); 
        ado.setBeak(0,100,0);
        ado.playNote(93, 0.075);
        ado.pause(0.15);
        ado.setBeak(0,0,0);

        int[] killer = {0, 0, 0, 0, 0, 
                    0, 0, 0, 1, 0, 
                    0, 0, 0, 0, 0, 
                    1, 1, 1, 1, 1, 
                    0, 0, 0, 0, 0};
        ado.setDisplay(killer); 
        ado.pause(0.15);

        int[] uso = {0, 0, 0, 0, 0, 
                    0, 0, 0, 1, 0, 
                    1, 0, 0, 0, 0, 
                    1, 1, 1, 1, 0, 
                    0, 0, 0, 0, 0};
        ado.setDisplay(uso); 
        ado.pause(0.15);

        int[] janai = {0, 0, 0, 0, 0, 
                    1, 0, 0, 1, 0, 
                    1, 0, 0, 0, 0, 
                    1, 1, 1, 0, 0, 
                    0, 0, 0, 0, 0};
        ado.setDisplay(janai); 
        ado.pause(0.15);

        int[] cream = {1, 0, 0, 0, 0, 
                    1, 0, 0, 1, 0, 
                    1, 0, 0, 0, 0, 
                    1, 1, 0, 0, 0, 
                    0, 0, 0, 0, 0};
        ado.setDisplay(cream); 
        ado.pause(0.15);

        int[] charles = {1, 0, 0, 0, 0, 
                    1, 0, 0, 1, 0, 
                    1, 0, 0, 0, 0, 
                    1, 1, 0, 0, 0, 
                    0, 0, 0, 0, 0};
        ado.setDisplay(charles); 
        ado.setBeak(100,0,0);
       ado.playNote(72, 0.6);
       ado.pause(0.61);
       ado.playNote(67, 0.6);
       ado.pause(0.61);
       ado.playNote(64, 0.45);
       ado.pause(0.451);
       ado.playNote(69, 0.267);
       ado.pause(0.2671);
       ado.playNote(71, 0.267);
       ado.pause(0.2671);
       ado.playNote(69, 0.267);
       ado.pause(0.2671);
       ado.playNote(68, 0.267);
       ado.pause(0.2671);
       ado.playNote(70, 0.267);
       ado.pause(0.2671);
       ado.playNote(68, 0.267);
       ado.pause(0.2671);
       ado.playNote(67, 1);
       ado.pause(1);

        







        ado.stopAll();
        ado.disconnect();
    }
}