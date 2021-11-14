package com.company;

public class K1 extends Kamyon implements IKlima,IDamper{
    @Override
    public void Artır() {
        System.out.println("Klima atırıldı");
    }
}
