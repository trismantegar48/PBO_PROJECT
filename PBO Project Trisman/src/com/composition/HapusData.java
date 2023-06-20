package com.composition;

import java.util.Scanner;
import com.supervisor.MyDatabaseSupervisor;

public class HapusData {
    public static void showDeleteData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("==============================================");
        System.out.println(" SILAHKAN PILIH DATA YANG INGIN ANDA HAPUS  ");
        System.out.println("==============================================");
        MyDatabaseSupervisor.getDatabase();
        System.out.println("==============================================");
        System.out.println("Mohon Diperhatikan Input Nama Menu yang Sesuai!");
        System.out.print("Pilih Nama Menu: ");
        String nama = sc.nextLine();
        System.out.println("==============================================");
       
        if (MyDatabaseSupervisor.deletDB(nama)) {
            System.out.println("BERHASIL MENGHAPUS DATA");
            
        }else{
            System.out.println("GAGAL MENGHAPUS DATA");
            System.out.println("----------------------------------------------");
            HapusData.showDeleteData();

        }

        System.out.println("----------------------------------------------");
        Menu.showMenu();
        sc.close();   
    }
    
}

