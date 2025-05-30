package com.kenTakakura;

import com.birdbrain.Finch;

public class test {
    public static void main(String[] args) {
        Finch ado = new Finch();
        // credit to Arman hayrapetyan
        int[] arr = {1, 0, 1, 1, 1, 1, 0, 1,0,0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1};
        ado.setTurn("L", 720, 100);
        ado.setDisplay(arr);
        ado.setMove("F", 50, 30);
       
        ado.stopAll();
        ado.disconnect();
    }
}