import java.util.Scanner;
import java.util.ArrayList;

public class Menu_Minuman{

    public static void main(String[] args){
        // your code
        Scanner input = new Scanner(System.in);
        ArrayList<String> pesanan = new ArrayList<String>();

        int cocaCola = 11000;
        int pepsi = 9500;
        int fanta = 12000;
        int sprite = 10500;
        int dr_papper = 15000;
        int pocari = 7000;
        int calpino = 6500;
        int ornamin = 10000;
        int total = 0;
        String ulang = "y";

        System.out.println(" ");

        System.out.println("********** WELCOME TO ANY DRINK ***********");

        while (ulang.equals("y")) {
            System.out.println("\n            MAIN COURSE            \n");
            System.out.println("NO | Name         | Price");
            System.out.println("---+--------------+-------");
            System.out.println("1  | Cola-Cola    | " + cocaCola);
            System.out.println("2  | Pepsi        | " + pepsi);
            System.out.println("3  | Fanta        | " + fanta);
            System.out.println("4  | Sprite       | " + sprite);
            System.out.println("5  | Dr Papper    | " + dr_papper);
            System.out.println("6  | Pocari Sweat | " + pocari);
            System.out.println("7  | Calpico      | " + calpino);
            System.out.println("8  | Ornamin C    | " + ornamin);
            System.out.println("=====================================");
            System.out.print("Pilih Minuman = ");
            int pilih = input.nextInt();
            
            switch (pilih) {
                case 1:{
                    System.out.println("Kamu memilih Cola-Cola");
                    total += cocaCola;
                    pesanan.add("Cola-Cola");
                    break;
                }
                case 2:{
                    System.out.println("Kamu memilih Pepsi");
                    total += pepsi;
                    pesanan.add("Pepsi");
                    break;
                }
                case 3:{
                    System.out.println("Kamu memilih Fanta");
                    total += fanta;
                    pesanan.add("Fanta");
                    break;
                }
                case 4:{
                    System.out.println("Kamu memilih Sprite");
                    total += sprite;
                    pesanan.add("Sprite");
                    break;
                }
                case 5:{
                    System.out.println("Kamu memilih Dr Papper");
                    total += dr_papper;
                    pesanan.add("Dr Papper");
                    break;
                }
                case 6:{
                    System.out.println("Kamu memilih Pocari Sweat");
                    total += pocari;
                    pesanan.add("Pocari Sweat");
                    break;
                }
                    case 7:{
                    System.out.println("Kamu memilih Calpico");
                    total += calpino;
                    pesanan.add("Calpico");
                    break;
                }
                    case 8:{
                    System.out.println("Kamu memilih Ornamin C");
                    total += ornamin;
                    pesanan.add("Ornamin C");
                    break;
                }
            }
            System.out.println("=====================================");
            System.out.print("Apakah anda ingin memesan lagi (y/t)? ");
            ulang = input.next();
        }

        System.out.println("\n==== Pesananmu ==== ");
        System.out.println("NO | Name          ");
        System.out.println("---+---------------");
        
        for(int i=0; i<pesanan.size(); i++) {
            System.out.println((i+1) + "  | " + pesanan.get(i));
        }
        System.out.println("-------------------");

        System.out.println("Total harga : " + total);
        
        while(true) {
            System.out.print("\nMasukan uang Anda : ");
            int uang = input.nextInt();
            if(uang > total) {
                int kembalian = uang - total;
                System.out.println("Kembalian Anda : " + kembalian);
                System.out.print("Kamu sudah membeli ");
                for(int i=0; i<pesanan.size(); i++) {
                    System.out.print(pesanan.get(i) + ", ");
                }
                System.out.println("Terima Kasih!");
                break;
            } else if(uang == total) {
                System.out.println("Uang Anda pas");
                System.out.print("Kamu sudah membeli ");
                for(int i=0; i<pesanan.size(); i++) {
                    System.out.print(pesanan.get(i) + ", ");
                }
                System.out.println("Terima Kasih!");
                break;
            } else {
                System.out.println("Uang Anda tidak cukup! Silahkan masukan kembali");
            }
        }
    }
}
    
