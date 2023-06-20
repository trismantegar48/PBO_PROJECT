package com.composition;

import java.util.Scanner;

public class Menu{
    public static void showMenu(){
        System.out.println("========================================");
        System.out.println("======= WELCOME TO RM TRISMAN 23 =======");
        System.out.println("========================================");
        System.out.println("1] READ DATA ");
        System.out.println("2] INSERT DATA ");
        System.out.println("3] EDIT DATA ");
        System.out.println("4] DELETE DATA ");
        System.out.println("5] EXIT ");
        System.out.println("========================================");
        System.out.print("PILIH : ");
        SelectMenu();
    }
    public static void SelectMenu(){
        Scanner sc = new Scanner(System.in);

        try {
            
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                BacaData.showReadData();
                break;
                case 2:
                SisipData.showInsertData();
                break;
                case 3:
                PerbaruiData.showUpdateData(null);
                break;
                case 4:
                HapusData.showDeleteData();
                break;
                case 5:
                System.out.println("========================================");
                System.out.println("     TERIMA KASIH SUDAH BERKUNJUNG      ");
                System.out.println("========================================");
                break;
    
                default:
                System.out.println("MOHON MAAF MENU YANG ANDA PILIH TIDAK ADA");
                Menu.showMenu();
                break;
     
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("INPUTAN TIDAK VALID KARENA BUKAN ANGKA");
            showMenu();
        }
        
        
    }
}