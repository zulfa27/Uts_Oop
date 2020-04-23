/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Zulfa
 */
 public class Aplikasi {
     public static void main(String args[]) {
        Aplikasi app = new Aplikasi();
        Scanner sc = new Scanner(System.in);
        while(true) {
            app.printMenu();
            int answer = sc.nextInt();
            switch(answer) {
                case 1:
                    System.out.println("Tambah Data");
                    app.addData();
                    break;
                case 2:
                    System.out.println("Ubah Data");
                    app.ubahData();
                    break;
                case 3:
                    System.out.println("Hapus Data");
                    app.hapusData();
                    break;
                case 4:
                    System.out.println("Lihat Data");
                    app.listData();
                    break;
                case 5:
                    return;
            }
        }
        
    }
    public void printMenu() {
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("APLIKASI PEREKAMAN DATA MAHASISWA ");
        System.out.println("----------------------------------");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Lihat Data");
        System.out.println("5. Keluar");
        System.out.print("Pilihan : ");
    }
    public void addData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("---------------------------");
        System.out.print("Nim : "); String Nim = sc.nextLine();
        System.out.print("Nama : "); String Nama = sc.nextLine();
        System.out.print("Kelas: "); String kelas = sc.nextLine();
        System.out.print("Alamat: "); String Alamat = sc.nextLine();
        Operasi.addData(new Data(Nim, Nama, kelas, Alamat));
        //  proses menambahakan data mahasiswa
    }
    public void ubahData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("------------------------------");
        System.out.print("Urutan Data ke: "); int idx = Integer.parseInt(sc.nextLine());
        System.out.println("------------------------------");
        System.out.print("Nim           : "); String Nim = sc.nextLine();
        System.out.print("Nama          : "); String Nama = sc.nextLine();
        System.out.print("Kelas : "); String kelas = sc.nextLine();
        System.out.print("Alamat        : "); String Alamat = sc.nextLine();
        Operasi.editData(new Data(Nim, Nama, kelas, Alamat), idx-1);
        // proses mengubah data yang sudah di input 
    }
    public void hapusData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("------------------------");
        System.out.print("Urutan Data ke: "); int idx = Integer.parseInt(sc.nextLine());
        Operasi.removeData(idx-1);
        //proses hapus data di list
    }
    public void listData() {
        Scanner sc = new Scanner(System.in);
        List<Data> result = Operasi.getListData();
        for(int i=0; i<result.size(); i++) {
            System.out.println();
            System.out.println("Data ke-" + (i+1));
            System.out.println("  Nim            : " + result.get(i).getNim());
            System.out.println("  Nama           : " + result.get(i).getNama());
            System.out.println("  kelas  : " + result.get(i).getkelas());
            System.out.println("  Alamat         : " + result.get(i).getAlamat()); 
             // list data yang sudah di input dan akan di tampilkan di layar 
        }
       
    
    }
}
