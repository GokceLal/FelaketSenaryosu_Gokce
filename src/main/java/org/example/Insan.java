package org.example;

abstract class Insan {
    private String ad;
    private String soyad;
    private boolean hastalikli;
    private boolean tasiyici;
    private boolean asili;

    public Insan(String ad, String soyad, boolean hastalikli, boolean tasiyici, boolean asili) {
        this.ad = ad;
        this.soyad = soyad;
        this.hastalikli = hastalikli;
        this.tasiyici = tasiyici;
        this.asili = asili;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public boolean isHastalikli() {
        return hastalikli;
    }

    public void setHastalikli(boolean hastalikli) {
        this.hastalikli = hastalikli;
    }

    public boolean isTasiyici() {
        return tasiyici;
    }

    public void setTasiyici(boolean tasiyici) {
        this.tasiyici = tasiyici;
    }

    public boolean isAsili() {
        return asili;
    }

    public void setAsili(boolean asili) {
        this.asili = asili;
    }

    @Override
    public String toString() {
        return "Insan{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", hastalikli=" + hastalikli +
                ", tasiyici=" + tasiyici +
                ", asili=" + asili +
                '}';
    }

    abstract public boolean asila();
}