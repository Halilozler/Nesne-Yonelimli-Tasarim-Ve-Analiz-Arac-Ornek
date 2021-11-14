package com.company;

public class Main {

    public static void main(String[] args) {
        /*
         *** Araç: - Minübüs, -Otomobil, -Kamyon
         *** Araçlar için Ortak özellikleri: -Model Adı, -Üretim Yıllı, -Yakıt türü, -Motor Hacmi, -Max Hız
         *** Üretim Yıllı dışardan değiştirilmesin. Sınıf Kurulurken tanımlansın.
         *** Max Hız değiştirilmesin.
         *** Araç Metot: -Çalıştır, -Gaz, -Fren
         *** Otomobilde her gaza basıldığında +20 -20
         *** Minübüste her gaza basıldığında +10 -10
         *** Kamyon her gaza basıldığında +5 -5,
         *** Otomobilde max = 180
         *** Minübüs max = 160
         *** Kamyon max = 120
         *** Araç Çalışmıyor ise gaz tepki vermez.
         *** Araç Her Çalıştığında ekranda modeli ve üretim yıllı gösterilecek.
         *** Kamyonların kendine has özellikleri: yük kapasitesi, -Teker sayısı
         *** Firma 2 tür kamyon üretiyor K1,K2
         *** K2 de damper yok, ikisindede klime var
         *** firma M1 isminde minübüs ürtiyor. -otomatik kapı, -klima var
         *** Minübüsün ortak özelliği -Koltuk Sayısı.
         *** firma ürettiği otomobilerde -vites türü özelliği var.
         *** firma O1 ve O2 iki farklı otmobil üretiyor.
         *** O1 klimalı
         *** O2 üstü açılıyor
         *** Firma toplamda kaç araç ürettiğini bilmek istiyor.
         *** Her iki aracın bütün özellikleri istenildiğinde ekranda gösterilecek.
         * */

        Otomobil a = new Otomobil();
        a.setModelAdi("BMW");
        OtomobilManager b = new OtomobilManager(a);

        b.Calistir();
        b.Gaz();
        b.Gaz();
        b.Fren();
        b.Fren();
        b.Fren();

        Kamyon e = new Kamyon();
        e.tekerSayisi = 4;
        e.yukKapasitesi = 1000;
        KamyonManager m = new KamyonManager(e);

        m.Calistir();

        m.Gaz();
        m.Gaz();

        System.out.println(Arac.adet);



    }
}
