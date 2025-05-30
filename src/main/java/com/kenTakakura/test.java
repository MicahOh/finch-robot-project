package com.kenTakakura;

import com.birdbrain.Finch;

public class test {
    public static void main(String[] args) {
        Finch ado = new Finch();

        int[] arr = {1, 0, 1, 1, 1, 1, 0, 1,0,0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1};
        ado.setTurn("L", 720, 100);
        ado.setDisplay(arr);
        ado.pause(10.0);
        ado.setMove("F",10, 100);
       
        ado.stopAll();
        ado.disconnect();
    }
}