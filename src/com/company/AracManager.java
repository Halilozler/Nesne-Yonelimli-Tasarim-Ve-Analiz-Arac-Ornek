package com.company;

public class AracManager implements IAracManager{
    public int hiz;
    public boolean calis;
    public int artis;

    private Arac _arac;
    AracManager(Arac arac, int artis){
        this.calis = false;
        _arac = arac;
        this.artis = artis;
    }

    @Override
    public void Calistir() {
        this.calis = true;
        System.out.println(_arac.getUretimYilli());
        System.out.println(_arac.getModelAdi());
    }

    @Override
    public void Gaz() {
        if (this.calis == true && this.hiz < this._arac.getMaxHiz()){
            this.hiz = this.hiz + this.artis;
            System.out.println(this.hiz);
        }
        else{
            System.out.println("Çalışmıyor");
        }

    }

    @Override
    public void Fren() {
        if (this.calis == true && this.hiz > 0){
            this.hiz = this.hiz - this.artis;
            System.out.println(this.hiz);
        }
        else{
            System.out.println("Çalışmıyor");
        }
    }
}
