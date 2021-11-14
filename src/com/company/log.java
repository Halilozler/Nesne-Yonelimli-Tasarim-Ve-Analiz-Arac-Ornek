package com.company;

public class log {
    private static log isim;
    private log(){}
    public static log getInstance(){
        if(isim == null){
            isim = new log();
        }
        return isim;
    }
    public static void connect(){
        System.out.println("loglandı");
    }
}
