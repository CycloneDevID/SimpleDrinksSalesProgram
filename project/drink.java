import java.util.Scanner;
public class Menu_Minuman{
    public static void main(String[] args){
        // your code
         String ulang = "y";
        while (ulang.equals("y"))
        {
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        
        System.out.println("********** WELCOME TO ANY DRINK ***********");
        System.out.println(" ");
        System.out.println("            MAIN COURSE            ");
        System.out.println("1. Cola-Cola");
        System.out.println("2. Pepsi");
        System.out.println("3. Fanta");
        System.out.println("4. Sprite");
        System.out.println("5. Dr Papper");
        System.out.println("6. Pocari Sweat");
        System.out.println("7. Calpico");
        System.out.println("8. Ornamin C");
        System.out.println("=====================================");
        System.out.print("Pilih Minuman = ");
        int pilih = input.nextInt();
        System.out.println("=====================================");
         switch (pilih) {
            case 1:{
                System.out.println("Cola-Cola");
                break;
            }
            case 2:{
                System.out.println("Pepsi");
                break;
            }
             case 3:{
                 System.out.println("Fanta");
                break;
             }
             case 4:{
                 System.out.println("Sprite");
                break;
             }
              case 5:{
                 System.out.println("Dr Papper");
                break;
             }
               case 6:{
                 System.out.println("Pocari Sweat");
                break;
             }
                case 7:{
                 System.out.println("Calpico");
                break;
             }
                 case 8:{
                 System.out.println("Ornamin C");
                break;
             }
        }
        System.out.println("=====================================");
        System.out.print("Apakah anda ingin mengulang (y/t)? ");
            ulang = input.next();
        }
    }
}
    
