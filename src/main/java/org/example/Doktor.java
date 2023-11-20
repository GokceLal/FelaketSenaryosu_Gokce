package org.example;

class Doktor extends Insan {
    public Doktor(String ad, String soyad, boolean tasiyici) {
        super(ad, soyad, false, tasiyici, true);
    }

    @Override
    public boolean asila() {
        System.out.println("Doktor zaten en baştan aşılıdır.");
        return false;
    }

}