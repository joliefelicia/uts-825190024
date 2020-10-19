package com.company;
import java.util.Scanner;
public class student {
    public static void main(String[] args) {
        String nis;
        int pilihanrumus;
        char maukembalikemenu;
        Scanner input = new Scanner(System.in);
        belajarfisika b1 = new belajarfisika();
        System.out.println("nama: ");
        String nama = input.nextLine();
        System.out.println("jenis kelamin: ");
        String jeniskelamin = input.nextLine();
        System.out.println("nis: ");
        nis = input.nextLine();
        b1.setNis(nis);
        b1.identitas(nama, jeniskelamin);
        System.out.println("nis " + b1.getNis());
        do {

                    System.out.println("Selamat datang di program rumus fisika\n" +
                            "menu:\n1. gerak\n2. massajenisbenda\npilihan materi:");
                    int pilihanmateri = input.nextInt();
                    switch (pilihanmateri) {
                        case 1: {
                            System.out.println("menghitung kecepatan suatu benda yang bergerak");
                            System.out.println("menu:\n1. kecepatan\n2. waktu\n3. jarak\npilihan: ");
                            pilihanrumus = input.nextInt();
                            double kecepatan = 0.0;
                            double jarak = 0.0;
                            double waktu = 0.0;
                            if (pilihanrumus == 1) {
                                System.out.println("jarak: ");
                                jarak = input.nextDouble();
                                System.out.println("waktu: ");
                                waktu = input.nextDouble();
                            } else if (pilihanrumus == 2) {
                                System.out.println("jarak: ");
                                jarak = input.nextDouble();
                                System.out.println("kecepatan: ");
                                kecepatan = input.nextDouble();
                            } else if (pilihanrumus == 3) {
                                System.out.println("kecepatan: ");
                                kecepatan = input.nextDouble();
                                System.out.println("waktu: ");
                                waktu = input.nextDouble();
                            }
                            b1.gerak(kecepatan, jarak, waktu, pilihanrumus);

                            break;
                        }
                        case 2: {
                            Double panjang = 0.0, lebar = 0.0, tinggi = 0.0, sisi = 0.0, volume = 0.0, jari = 0.0;
                            System.out.println("menghitung massa jenis benda bentuk bola, kubus, dan balok ");
                            System.out.println("menu:\n1. massa jenis\n2. massa\n3. volume\npilihan: ");
                            pilihanrumus = input.nextInt();

                            double massajenis = 0.0;
                            double massa = 0.0;

                            if (pilihanrumus == 1) {
                                System.out.println("massa: ");
                                massa = input.nextDouble();
                                System.out.println("menu volume:\n1. balok\n2. kubus\n3. lingkaran\npilihan: ");
                                int pilihanvolume = input.nextInt();
                                if (pilihanvolume == 1) {
                                    System.out.println("masukkan panjang: ");
                                    panjang = input.nextDouble();
                                    System.out.println("masukkan lebar: ");
                                    lebar = input.nextDouble();
                                    System.out.println("masukkan tinggi: ");
                                    tinggi = input.nextDouble();
                                    b1.volumebalok(panjang, lebar, tinggi);
                                    volume = b1.getVolume();

                                }
                                if (pilihanvolume == 2) {
                                    System.out.println("sisi: ");
                                    sisi = input.nextDouble();
                                    b1.volumekubus(sisi);
                                    volume = b1.getVolume();

                                }
                                if (pilihanvolume == 3) {
                                    System.out.println("jari-jari: ");
                                    jari = input.nextDouble();
                                    b1.volumebola(jari);
                                    volume = b1.getVolume();
                                }


                            } else if (pilihanrumus == 2) {
                                System.out.println("massajenis: ");
                                massajenis = input.nextDouble();
                                System.out.println("menu volume:\n1.balok\n2.kubus\n3.bola:\npilihan:");
                                int pilihanvolume = input.nextInt();
                                if (pilihanvolume == 1) {
                                    System.out.println("masukkan panjang: ");
                                    panjang = input.nextDouble();
                                    System.out.println("masukkan lebar: ");
                                    lebar = input.nextDouble();
                                    System.out.println("masukkan tinggi: ");
                                    tinggi = input.nextDouble();
                                    b1.volumebalok(panjang, lebar, tinggi);
                                    volume = b1.getVolume();
                                }
                                if (pilihanvolume == 2) {
                                    System.out.println("Masukkan sisi: ");
                                    sisi = input.nextDouble();
                                    b1.volumekubus(sisi);
                                    volume = b1.getVolume();

                                }
                                if (pilihanvolume == 3) {
                                    System.out.println("masukkan jari-jari: ");
                                    jari = input.nextDouble();
                                    b1.volumebola(jari);
                                    volume = b1.getVolume();

                                }


                            } else if (pilihanrumus == 3) {
                                System.out.println("massa jenis: ");
                                massajenis = input.nextDouble();
                                System.out.println("massa: ");
                                massa = input.nextDouble();
                            }

                            b1.massajenisbenda(massajenis, massa, pilihanrumus);
                            break;

                        }


                    }



         System.out.println("mau kembali ke menu lagi= ");
            maukembalikemenu=input.next().charAt(0);
        }while(maukembalikemenu=='y'||maukembalikemenu=='Y');
    }
}






