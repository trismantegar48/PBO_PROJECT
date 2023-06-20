package com.composition;

import java.util.Scanner;
import com.supervisor.MyDatabaseSupervisor;
import com.reference.Produk;

public class PerbaruiData {
    public static void showUpdateData(String nama){
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("SILAHKAN PILIH DATA YANG ANDA INGINKAN UNTUK MENGUBAH ");
        System.out.println("====================================");
        MyDatabaseSupervisor.getDatabase();
        System.out.print("Pilih Menu : ");
        nama = sc.nextLine();
        
        
        System.out.println("==============================================");
        System.out.println("DIMOHON PERBARUI DATA MENU");
        System.out.println("==============================================");
        System.out.println("1. PERBARUI NAMA ");
        System.out.println("2. PERBARUI HARGA ");
        System.out.println("3. PERBARUI JUMLAH ");
        System.out.println("==============================================");
        System.out.print("Pilih Menu : ");

        try {
            
            int selectMenu = sc.nextInt();
            switch (selectMenu) {
                case 1:
                showEditNama(nama);
                    break;
                case 2:
                showEditHarga(nama);
                break;
                case 3:
                showEditStok(nama);
                break;
                default:
                System.out.println("MOHON MAAF MENU YANG ANDA DIPILIH TIDAK TERSEDIA");
                Menu.showMenu();
            }
            System.out.println("==============================================");
            Menu.showMenu();
            sc.close();   
        } catch (Exception e) {
           System.out.println("Input Nama Menu yang Sesuai");
           Menu.showMenu();
        }
    }

    public static void showEditNama(String nama){
        Scanner sc = new Scanner(System.in);

        Produk produk = MyDatabaseSupervisor.getProdukbyNama(nama);

        System.out.println("==============================================");
        System.out.println("EDIT NAMA ");
        System.out.println("==============================================");
        System.out.println( "NAMA AWAL: "+ produk.getNama());
        System.out.println("==============================================");
        System.out.println("NAMA BARU: ");
        String namaBaru = sc.nextLine();
        MyDatabaseSupervisor.updateNamaDB(produk.getId(), namaBaru);

        System.out.println("==============================================");
        System.out.println("BERHASIL MEMPERBARUI DATA NAMA");
        System.out.println("==============================================");
        Menu.showMenu();
        sc.close();
    }

    public static void showEditHarga(String nama){
        Scanner sc = new Scanner(System.in);

        Produk produk = MyDatabaseSupervisor.getProdukbyNama(nama);

        System.out.println("==============================================");
        System.out.println("EDIT HARGA ");
        System.out.println("==============================================");
        System.out.println( "HARGA AWAL: "+ produk.getHarga());
        System.out.println("==============================================");
        System.out.println("HARGA BARU: ");
        long hargaBaru = sc.nextInt();
        MyDatabaseSupervisor.updateHargaDB(produk.getId(), hargaBaru);

        System.out.println("==============================================");
        System.out.println("BERHASIL MEMPERBARUI DATA HARGA");
        System.out.println("===============================================");
        Menu.showMenu();
        sc.close();
    }
    public static void showEditStok(String nama){
        Scanner sc = new Scanner(System.in);

        Produk produk = MyDatabaseSupervisor.getProdukbyNama(nama);

        System.out.println("==============================================");
        System.out.println("EDIT JUMLAH ");
        System.out.println("==============================================");
        System.out.println( "JUMLAH AWAL: "+ produk.getJumlah());
        System.out.println("===============================================");
        System.out.println("JUMLAH BARU: ");
        int stokBaru = sc.nextInt();
        MyDatabaseSupervisor.updateStokDB(produk.getId(), stokBaru);

        System.out.println("==============================================");
        System.out.println("BERHASIL MEMPERBARUI DATA JUMLAH");
        System.out.println("==============================================");
        Menu.showMenu();
        sc.close();
    }
}