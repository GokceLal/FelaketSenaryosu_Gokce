package org.example;

class SuperInsan extends Insan {
    public SuperInsan(String ad, String soyad) {
        super(ad, soyad, false, false, true);
    }

    @Override
    public boolean asila() {
        System.out.println("Super insanlara aşı uygulanmaz.");
        return false;

    }
}
