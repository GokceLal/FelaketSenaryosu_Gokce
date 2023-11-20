package org.example;

class NormalInsan extends Insan {
    public NormalInsan(String ad, String soyad, boolean hastalikli, boolean tasiyici, boolean asili) {
        super(ad, soyad, hastalikli, tasiyici, asili);
    }

    @Override
    public boolean asila() {
        if (this.isAsili()) {
            System.out.println("Bu normal insan zaten aşılandı.");
            return false;
        }
        this.setAsili(true);
        System.out.println("Normal insan aşılandı.");
        return true;
    }

}
