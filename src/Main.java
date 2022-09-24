public class Main {
    public static void main(String[] args) {

        // IfElseBloklari();
        // EnBuyukSayiyiBulma();
        // SwitchBloklari();
        // Donguler();
        // Diziler();
        // VerilenDizidekiSayilarinToplaminiVeEnbuyukSayiyiBulma();
        //CokBoyutluDiziler();
        //StringFonksiyonlari();
        // AsalSayiOrnegi();
        //InceveKalinSesliHarfiBulmaOrnegi();
        //MukemmelSayiyiBulmaOrnegi(27);
        // ArkadasSayiyiBulmaOrnegi(284,220);
        BirSayininVerilenDizideOlupOlmadiginiBulmaOrnegi(4);
    }

    public static void IfElseBloklari() {
        int sayi = 27;

        if (sayi < 20) {
            System.out.println("sayı 20'den kuçuktur");

        } else if (sayi == 20) {
            System.out.println("sayı 20'dir");
        } else {
            System.out.println("sayı 20'den buyuktur");
        }
    }

    public static void EnBuyukSayiyiBulma() {
        int sayi1 = 15;
        int sayi2 = 20;
        int sayi3 = 30;
        int enBuyuk = sayi1;

        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }
        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }
        System.out.println("En buyuk sayı: " + enBuyuk);

    }

    public static void SwitchBloklari() {
        char not = 'D';
        switch (not) {
            case 'A':
                System.out.println("Mukemmel: Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok guzel: Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi: Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena değil: Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef: Kaldınız");
                break;
            default:
                System.out.println("Yanlış not girdiniz");

        }
    }

    public static void Donguler() {

        // for döngusu
        for (int i = 1; i < 9; i++) {
            System.out.println(i);
        }
        System.out.println("Döngu bitti");

        //while döngusu
        int x = 1;
        while (x < 19) {
            System.out.println(x);
            x++;
        }
        System.out.println("While döngusu bitti");

        //do-while döngusu
        int y = 81;
        do {
            System.out.println(y);
            y += 2;
        }
        while (y < 9);
        System.out.println("Do-While döngusu bitti");
    }

    public static void Diziler() {
        String[] ogrenciler = new String[4];
        ogrenciler[0] = "emin";
        ogrenciler[1] = "eminAkdas";
        ogrenciler[2] = "Memin";
        ogrenciler[3] = "MeminAkdas";
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("-*-*-*-*-*-*-*-*-*-");
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
    }

    public static void VerilenDizidekiSayilarinToplaminiVeEnbuyukSayiyiBulma() {
        double[] myList = {1.3, 2.6, 3.9};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }

        System.out.println("toplam: " + total + " en buyuk sayı: " + max);
    }

    public static void CokBoyutluDiziler() {
        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "İzmir";
        sehirler[1][0] = "Adana";
        sehirler[1][1] = "Ankara";
        sehirler[1][2] = "Gaziantep";
        sehirler[2][0] = "Kayseri";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Van";
        //Elemanları yazdırma
        for (int i = 0; i < 3; i++) {
            System.out.println("-*-*-*-*-*-*-*--*-");
            for (int x = 0; x < 3; x++) {
                System.out.println(sehirler[i][x]);
            }
        }

    }

    public static void StringFonksiyonlari() {
        String mesaj = "emin çok yakışıklı.";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı: " + mesaj.length());
        System.out.println("3. eleman: " + mesaj.charAt(2));
        System.out.println(mesaj.concat("-Aynen"));
        System.out.println(mesaj.startsWith("e"));
        System.out.println(mesaj.endsWith("!"));
        char[] karakterler = new char[4];
        mesaj.getChars(0, 4, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("k"));
        System.out.println(mesaj.lastIndexOf("k"));

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        String yeniMesaj = mesaj.replace(' ', '_');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2, 5));

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());

    }

    public static void AsalSayiOrnegi() {
        int sayi = 10;
        boolean asalMi = false;
        if (sayi == 1) {
            System.out.println("1 asal değildir");
        }
        if (sayi < 1) {
            System.out.println("duzgun sayı gir");
        }
        for (int i = 2; i < sayi; i++) {
            if (i % 2 == 0) {
                asalMi = true;

            } else {
                asalMi = false;
            }
        }
        if (asalMi == true) {
            System.out.println("sayı asaldır");
        } else {
            System.out.println("sayı asal değil");
        }
    }

    public static void InceveKalinSesliHarfiBulmaOrnegi() {
        char girilenHarf = 'a';
        char harf = Character.toUpperCase(girilenHarf);
        switch (harf) {
            case 'A':
            case 'U':
            case 'I':
            case 'O':
                System.out.println("Seçtiğin harf kalın");
                break;
            case 'E':
            case 'u':
            case 'Ö':
            case 'İ':
                System.out.println("Seçtiğin harf ince");
                break;
            default:
                System.out.println("Sesli harf gir lutfeen");
        }
    }

    public static void MukemmelSayiyiBulmaOrnegi(int sayi) {
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam = toplam + i;
            }
        }
        if (toplam == sayi) {
            System.out.println("sayı mükemmel");
        } else {
            System.out.println("sayı mükemmel değil");
        }
    }

    public static void ArkadasSayiyiBulmaOrnegi(int sayi1, int sayi2) {
        int toplam1 = 0;
        int toplam2 = 0;
        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                toplam1 = toplam1 + i;
            }
        }
        for (int x = 1; x < sayi2; x++) {
            if (sayi2 % x == 0) {
                toplam2 = toplam2 + x;
            }
        }
        if (toplam2 == sayi1 && toplam1 == sayi2) {
            System.out.println("girdiğin sayılar arkadaş o_0");
        } else {
            System.out.println("sayılar arkadaş değil");
        }
    }

    public static void BirSayininVerilenDizideOlupOlmadiginiBulmaOrnegi(int aranacak) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == aranacak) {
                System.out.println("sayi dizinin içinde var");
                return;
            }
        }
        System.out.println("sayi bulunamadı");
    }

    public static void MetodlariAnlama() {

    }

    public static void ParametreliMetodlariAnlama() {

    }

    public static void VariableArgumentsIleCalisma() {

    }

    public static void ClassYapisi() {

    }

    public static void HesapMakinesiYapmaOrnegi() {

    }

}


