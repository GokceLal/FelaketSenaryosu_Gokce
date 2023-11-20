package org.example;

class Saglik {
    private Insan[] asiliInsanlar = new Insan[100];
    private int asiliInsanSayisi = 0;

    public void asilamaYap(Insan insan) {
        boolean asilandimi = insan.asila();
        if (asilandimi) asiliInsanlar[asiliInsanSayisi++] = insan;
    }

    public void rapor() {
        System.out.println("Aşılanan insanlar:");
        for (int i = 0; i < asiliInsanSayisi; i++) {
            System.out.println(asiliInsanlar[i]);
        }
    }
}