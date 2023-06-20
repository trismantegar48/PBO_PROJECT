package com.composition;

import java.util.Scanner;
import com.supervisor.MyDatabaseSupervisor;

public class SisipData {
    public static void showInsertData(){
        try {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("====================================");
            System.out.println("  DIMOHON INPUT DATA DI BAWAH INI   ");
            System.out.println("====================================");
            System.out.println("NAMA");
            String name = sc.nextLine();
            System.out.println("HARGA");
            long harga = sc.nextInt();
            System.out.println("JUMLAH");
            int jumlah = sc.nextInt();
            System.out.println("====================================");
            if (MyDatabaseSupervisor.insertDB(name, harga, jumlah)) {
                System.out.println("DATA TELAH DIPERBARUI");
                
            }else{
                System.out.println("GAGAL MENAMBAHKAN DATA");
            }
            System.out.println("------------------------------------");
            Menu.showMenu();
            sc.close();
        
        } catch (Exception e) {
            SisipData.showInsertData();
        }
    }
}