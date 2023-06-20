package com.composition;

import java.util.Scanner;
import com.supervisor.MyDatabaseSupervisor;

public class BacaData {
    public static void showReadData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("             DATA MENU              ");
        System.out.println("====================================");
        MyDatabaseSupervisor.getDatabase();
        System.out.println("====================================");
        System.out.println("1. MENU ");
        System.out.println("2. EXIT "); 
        System.out.print("Pilih : ");
        try {
            int selectMenu = sc.nextInt();
            switch (selectMenu) {
                case 1:
                Menu.showMenu();
                    break;
                case 2:
                System.out.println("==========================================");
                System.out.println("      TERIMA KASIH SUDAH BERKUNJUNG       ");
                System.out.println("==========================================");
                System.exit(selectMenu);
                break;
            
                default:
                System.out.println("==============================================");
                System.out.println("MOHON MAAF MENU YANG ANDA PILIH TIDAK TERSEDIA");
                BacaData.showReadData();
                    break;
            }
            
        } catch (Exception e) {
            System.out.println("==============================================");
               System.out.println("INPUTAN TIDAK VALID KARENA BUKAN ANGKA");
               BacaData.showReadData();
        }
        System.out.println("====================================");
        Menu.showMenu();
        sc.close();
    }
    
}