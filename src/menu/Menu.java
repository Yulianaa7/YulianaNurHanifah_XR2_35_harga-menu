/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;
import java.util.Scanner;
/**
 *
 * @author Yuliana
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih, uang;
        System.out.println("Selamat datang");

        //menu makanan
        System.out.println("Menu Makanan");
        String[] menu = {"", "Nasi Goreng", "Mie Ayam", "Nasi Ayam", "Bakso"};
        int[] harga = {0,10000, 7000, 10000, 12000};
        for (int i = 1; i<harga.length; i++){
            System.out.println(i +". "+menu[i]+"=> "+harga[i]);
        }
        System.out.print("Masukkan menu makanan yang dipilih : ");
        pilih = input.nextInt(); 
        System.out.println("Menu Makanan Yang Anda Pilih : "+menu[pilih]);
        System.out.print("Masukkan Uang Anda : ");
        uang = input.nextInt();
        if (uang==harga[pilih]){
            System.out.println("Uang Anda pas, silahkan menunggu pesanan datang ");
        }else if (uang>harga[pilih]){
            System.out.println("Uang Kembalian "+(uang-harga[pilih]));
            System.out.println("Silahkan menunggu pesanan anda datang");
        }else{
            System.out.println("Uang anda kurang "+(harga[pilih]-uang));
        }

        
    }
        
        
        
                
    }
    

