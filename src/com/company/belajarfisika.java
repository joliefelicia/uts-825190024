package com.company;

abstract class murid{
   abstract void identitas(String nama, String jeniskelamin);

}

interface rumusfisika{
  void gerak (double cepat,double jarak,double waktu, int pilihanrumus1);

 void massajenisbenda(double massajenis, double massa,  int pilihanrumus2);
}

interface volume{
    void volumekubus(double sisi);
    void volumebalok(double panjang, double lebar, double tinggi);
    void volumebola(double jari);

}




class belajarfisika extends murid implements rumusfisika ,volume{
    private String nis;
    private double volume;

    public double getVolume() {

        return volume;
    }

    public void setNis(String nis) {
        this.nis = nis;

    }
    public String getNis() {

        return nis;
    }


   void identitas(String nama,String jeniskelamin){
        System.out.println("Nama: "+nama);
        System.out.println("Jenis kelamin: "+jeniskelamin);
    }


    public void gerak(double cepat, double jarak , double waktu, int pilihanrumus1)
    {
        if(pilihanrumus1==1){
            cepat=jarak/waktu;
            System.out.println("kecepatan: "+cepat);
        }
        else if(pilihanrumus1==2){
            waktu=jarak/cepat;
            System.out.println("waktu: "+waktu);
        }
        else if(pilihanrumus1==3){
            jarak=waktu*cepat;
            System.out.println("jarak: "+jarak);
        }

    }



    public  void massajenisbenda(double massajenis, double massa, int pilihanrumus2){
        if(pilihanrumus2==1){
            massajenis=massa/volume;
            System.out.println("massa jenis: "+massajenis);
        }
       else if(pilihanrumus2==2){
            massa=massajenis*volume;
            System.out.println("massa: "+massa);
        }
        else if(pilihanrumus2==3){

            volume=massa/massajenis;
            System.out.println("volume: "+volume);
        }
    }

    public void volumekubus(double sisi) {

        volume=Math.pow(sisi,3);
        System.out.println("volume: "+volume);

    }

    public void volumebalok(double panjang, double lebar, double tinggi) {

        volume=panjang*lebar*tinggi;
        System.out.println("volume: "+volume);

    }


    public void volumebola(double jari) {

        volume=(4*(Math.PI* Math.pow(jari,3)))/3;
        System.out.println("volume= "+volume);


    }





}


