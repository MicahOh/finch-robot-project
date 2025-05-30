package com.kenTakakura;

import com.birdbrain.Finch;

public class test {
    public static void main(String[] args) {
        Finch ado = new Finch();

        ado.setTurn("L", 720, 100);

       
        ado.stopAll();
        ado.disconnect();
    }
}