package com.company;

import java.time.Year;

public class Arac {

    private String modelAdi;
    private int uretimYilli = Year.now().getValue();
    private String yakitTuru;
    private int motorHacmi;
    private final int maxHiz;

    public static int adet;

    Arac(int maxHiz){
        adet++;
        this.maxHiz = maxHiz;
    }


    //get -> Almak
    //set -> Vermek
    public String getModelAdi(){
        return this.modelAdi;
    }
    public void setModelAdi(String modelAdi){
        this.modelAdi = modelAdi;
    }

    public int getUretimYilli() {
        return uretimYilli;
    }


    public String getYakitTuru() {
        return yakitTuru;
    }

    public void setYakitTuru(String yakitTuru) {
        this.yakitTuru = yakitTuru;
    }

    public int getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(int motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public int getMaxHiz() {
        return maxHiz;
    }

}
