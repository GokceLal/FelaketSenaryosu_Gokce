package org.example;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Saglik saglikMerkezi = new Saglik();

            NormalInsan normalInsan = new NormalInsan("Ahmet", "Taş", false, false, false);
            NormalInsan normalInsan2 = new NormalInsan("Mehmet", "Yılmaz", false, false, true);
            NormalInsan normalInsan3 = new NormalInsan("Gökçe", "Arslan", false, false, false);
            Doktor doktor = new Doktor("Ayşe", "Demir", false);
            SuperInsan superInsan = new SuperInsan("Mehmet", "Kara");

            //saglikMerkezi.asilamaYap(normalInsan);
           // saglikMerkezi.asilamaYap(normalInsan2);
           // saglikMerkezi.asilamaYap(normalInsan3);
            //saglikMerkezi.asilamaYap(doktor);
           // saglikMerkezi.asilamaYap(superInsan);

           // saglikMerkezi.rapor();
            Scanner sc = new Scanner(System.in);
          int select=1;

            do {
                System.out.println("Lütfen yapmak istediğin işlemi seçiniz: ");

                System.out.println("1-> İnsan veritabanını görüntüle: ");
                System.out.println("2 -> Aşılananları bilgileri ile birlikte göster");
                System.out.println("3-> Tüm insanlara yapılan işlemleri göster: ");
                System.out.println("4-> Sistemin işleyişi hakkında bilgi al");
                System.out.println("0 -> Çıkış Yap");
                select = sc.nextInt();
                switch (select){

                    case 1:
                        System.out.println(normalInsan.getAd()+normalInsan.getSoyad());
                        System.out.println(normalInsan2.getAd()+normalInsan2.getSoyad());
                        System.out.println(normalInsan3.getAd()+normalInsan3.getSoyad());
                        System.out.println(doktor.getAd()+doktor.getSoyad());
                        System.out.println(superInsan.getAd()+superInsan.getSoyad());
                        break;
                    case 0:
                        select=0;
                        break;
                    case 2:
                        saglikMerkezi.rapor();
                    case 3:

                        System.out.print(normalInsan.getAd()+normalInsan.getSoyad()+" = ");
                        saglikMerkezi.asilamaYap(normalInsan);
                        System.out.print(normalInsan2.getAd()+normalInsan2.getSoyad()+" = ");
                        saglikMerkezi.asilamaYap(normalInsan2);
                        System.out.print(normalInsan3.getAd()+normalInsan3.getSoyad()+" = ");
                        saglikMerkezi.asilamaYap(normalInsan3);
                        System.out.print(doktor.getAd()+doktor.getSoyad()+" = ");
                        saglikMerkezi.asilamaYap(doktor);
                        System.out.print(superInsan.getAd()+superInsan.getSoyad()+" = ");
                        saglikMerkezi.asilamaYap(superInsan);
                    case 4:
                        System.out.println("Normal insan; hastalığı taşıyabilir, hasta olabilir\n" +
                                "Doktor, hastalığa karşı aşılıdır ancak hastalığı bulaştırabilir.\n" +
                                "Super insan, hastalanmaz ya da hastalığı bulaştırmaz.\n");

                }

            }while(!(select==0));
        }
    }

