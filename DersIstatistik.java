//İSMAİL AYKURT
//220706038

import java.util.Scanner;

public class DersIstatistik {
    public int notAA;
    public int notBA;
    public int notBB;
    public int notCB;
    public int notCC;
    public int notDC;
    public int notDD;
    public int toplamOgrenciSayisi;

    public void setNotAA(int notAA){

        this.notAA=notAA;
    }
    public int getNotAA(){

        return notAA;
    }
    public void setNotBA(int notBA){

        this.notBA=notBA;
    }
    public int getNotBA(){
        return notBA;
    }
    public void setNotBB(int notBB){
        this.notBB=notBB;
    }
    public int getNotBB(){
        return notBB;
    }
    public void setNotCB(int notCB){
        this.notCB=notCB;
    }
    public int getNotCB(){
        return notCB;
    }
    public void setNotCC(int notCC){
        this.notCC=notCC;
    }
    public int getNotCC(){
        return notCC;
    }
    public void setNotDC(int notDC){
        this.notDC=notDC;
    }
    public int getNotDC(){
        return notDC;
    }
    public void setNotDD(int notDD){
        this.notDD=notDD;
    }
    public int getNotDD(){
        return notDD;
    }
    public void setToplamOgrenciSayisi(DersIstatistik ders){
        this.toplamOgrenciSayisi= ders.notAA+ ders.notBA+ders.notBB+
                ders.notCB+ders.notCC+ders.notDC+ders.notDD;

    }
    public int getToplamOgrenciSayisi(){
        return toplamOgrenciSayisi;
    }
    public static void baslikYazdir(){
        System.out.println("****************************************");
        System.out.println("***DERS NOTLARI İSTATİSTİK PROGRAMI***");
        System.out.println("****************************************");
    }
    public static void menuYazdir(){
        System.out.println("MENÜ:");
        System.out.println("(1) Her bir harfli başarı notu için öğrenci sayısı gir");
        System.out.println("(2) Metinsel istatistik yazdır");
        System.out.println("(3) Grafiksel istatistikleri yazdır");
        System.out.println("(4) Tüm verileri sıfırla ");
        System.out.println("(5) Programı sonlandır ");
    }
    public void notSayisiGir(DersIstatistik ders){
        Scanner input=new Scanner(System.in);
        System.out.print("AA alan öğrenci sayısını giriniz: ");
        int notAA= input.nextInt();
        ders.setNotAA(notAA);
        System.out.print("BA alan öğrenci sayısını giriniz: ");
        int notBA= input.nextInt();
        ders.setNotBA(notBA);
        System.out.print("BB alan öğrenci sayısını giriniz: ");
        int notBB= input.nextInt();
        ders.setNotBB(notBB);
        System.out.print("CB alan öğrenci sayısını giriniz: ");
        int notCB= input.nextInt();
        ders.setNotCB(notCB);
        System.out.print("CC alan öğrenci sayısını giriniz: ");
        int notCC=input.nextInt();
        ders.setNotCC(notCC);
        System.out.print("DC alan öğrenci sayısını giriniz: ");
        int notDC= input.nextInt();
        ders.setNotDC(notDC);
        System.out.print("DD alan öğrenci sayısını giriniz: ");
        int notDD= input.nextInt();
        ders.setNotDD(notDD);
        int ogrenciSayisi=notAA+notBA+notBB+notCB+notCC+notDC+notDD;
        ders.setToplamOgrenciSayisi(ders);
        System.out.println("Toplam öğrenci sayısı:"+getToplamOgrenciSayisi());

    }
    public void metinselIstatistikYazdir(DersIstatistik ders){
        float toplamOgrenciSayisi=getToplamOgrenciSayisi();
        if(toplamOgrenciSayisi==0){
            System.out.println("Harfli başarı notları için henüz sayısal veriler girilmemiştir!");
        }else{
            System.out.println("AA: %" + (getNotAA()/toplamOgrenciSayisi*100));
            System.out.println("BA: %" + (getNotBA()/toplamOgrenciSayisi*100));
            System.out.println("BB: %" + (getNotBB()/toplamOgrenciSayisi*100));
            System.out.println("CB: %" + (getNotCB()/toplamOgrenciSayisi*100));
            System.out.println("CC: %" + (getNotCC()/toplamOgrenciSayisi*100));
            System.out.println("DC: %" + (getNotDC()/toplamOgrenciSayisi*100));
            System.out.println("DD: %" + (getNotDD()/toplamOgrenciSayisi*100));

        }


    }
    public void grafikselIstatistikYazdir(){
        int toplamOgrencisayisi=getToplamOgrenciSayisi();
        if(toplamOgrencisayisi!=0){
            System.out.println("\t 0    10   20   30   40   50   60  70  80   90   100");
            System.out.println("\t |    |    |    |    |    |    |   |    |    |    |");
            System.out.println("\t **************************************************");


            int yuzdeAA=getNotAA()*100/toplamOgrencisayisi;
            int yildizSayisiAA=yuzdeAA/2;

            System.out.print("AA:");
            System.out.print("  ");
            for(int i=0;i<=yildizSayisiAA;i++){
                System.out.print("*");
            }
            System.out.println();
            int yuzdeBA=getNotBA()*100/toplamOgrencisayisi;
            int yildizSayisiBA=yuzdeBA/2;
            System.out.print("BA:");
            System.out.print("  ");
            for(int i=0;i<=yildizSayisiBA;i++){
                System.out.print("*");
            }
            System.out.println();
            int yuzdeBB=getNotBB()*100/toplamOgrencisayisi;
            int yildizSayisiBB=yuzdeBB/2;
            System.out.print("BB:");
            System.out.print("  ");
            for(int i=0;i<=yildizSayisiBB;i++){
                System.out.print("*");
            }
            System.out.println();
            int yuzdeCB=getNotCB()*100/toplamOgrencisayisi;
            int yildizSayisiCB=yuzdeCB/2;
            System.out.print("CB:");
            System.out.print("  ");
            for(int i=0;i<=yildizSayisiCB;i++){
                System.out.print("*");
            }
            System.out.println();
            int yuzdeCC=getNotCC()*100/toplamOgrencisayisi;
            int yildizSayisiCC=yuzdeCC/2;
            System.out.print("CC:");
            System.out.print("  ");
            for(int i=0;i<=yildizSayisiCC;i++){
                System.out.print("*");
            }
            System.out.println();
            int yuzdeDC=getNotDC()*100/toplamOgrencisayisi;
            int yildizSayisiDC=yuzdeDC/2;
            System.out.print("DC:");
            System.out.print("  ");
            for(int i=0;i<=yildizSayisiDC;i++){
                System.out.print("*");
            }
            System.out.println();
            int yuzdeDD=getNotDD()*100/toplamOgrencisayisi;
            int yildizSayisiDD=yuzdeDD/2;
            System.out.print("DD:");
            System.out.print("  ");
            for(int i=0;i<=yildizSayisiDD;i++){
                System.out.print("*");
            }
            System.out.println();

        }else{
            System.out.println("UYARI: Harfli başarı notları için henüz sayısal veriler girilmemiştir!");
        }
    }
    public void verileriSifirla(){
        this.notAA=0;
        this.notBA=0;
        this.notBB=0;
        this.notCB=0;
        this.notCC=0;
        this.notDC=0;
        this.notDD=0;
        this.toplamOgrenciSayisi=0;


        System.out.println("Verileriniz sıfırlanmıştır....");
    }
    public DersIstatistik(int notAA,int notBA,int notBB,int notCB,int notCC,int notDC,int notDD){
        this.notAA=10;
        this.notBA=10;
        this.notBB=0;
        this.notCB=0;
        this.notCC=0;
        this.notDC=0;
        this.notDD=0;
        toplamOgrenciSayisi=0;
    }

    public static void main(String[] args) {
        DersIstatistik dersIstatistik=new DersIstatistik(10,10,0,0,0,0,0);

        baslikYazdir();
        boolean sonuc=true;

        while(sonuc){

            menuYazdir();
            System.out.print("İslem seçiniz:");



            Scanner input=new Scanner(System.in);
            int islem= input.nextInt();
            System.out.println("----------------");


            if(islem<=0 || islem>=6){
                System.out.println("UYARI: İşlem yapabilmek için 1 ile 5 arasında bir sayı seçilmelidir!");
                System.out.println("Devam etmek için bir tuşa ve ardından entera basınız!");
                String tus=" ";
                tus=input.nextLine();
                String enter=" ";
                enter=input.nextLine();



            }else{
                switch (islem){
                    case 1:
                        dersIstatistik.notSayisiGir(dersIstatistik);
                        break;
                    case 2:
                        dersIstatistik.metinselIstatistikYazdir(dersIstatistik);
                        break;
                    case 3:
                        dersIstatistik.grafikselIstatistikYazdir();
                        break;

                    case 4:
                        dersIstatistik.verileriSifirla();
                        break;

                    case 5:
                        sonuc=false;
                }

            }

        }
        System.out.println("PROGRAM  SONLANMIŞTIR....");
    }
}
