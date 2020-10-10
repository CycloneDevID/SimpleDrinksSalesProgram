import java.util.Scanner;
import java.util.ArrayList;

public class drink{

    public static void main(String[] args){
        // your code
        Scanner input = new Scanner(System.in);
        ArrayList<String> order = new ArrayList<String>();

        int cocaCola = 11000;
        int pepsi = 9500;
        int fanta = 12000;
        int sprite = 10500;
        int dr_papper = 15000;
        int pocariSweat = 7000;
        int calpico = 6500;
        int ornaminC = 10000;
        int total = 0;
        String repeat = "y";

        System.out.println("\n********** WELCOME TO ANY DRINK ***********");

        while (repeat.equals("y")) {
            System.out.println("\n            Main Menu            \n");
            System.out.println("NO | Name         | Price");
            System.out.println("---+--------------+-------");
            System.out.println("1  | Cola-Cola    | " + cocaCola);
            System.out.println("2  | Pepsi        | " + pepsi);
            System.out.println("3  | Fanta        | " + fanta);
            System.out.println("4  | Sprite       | " + sprite);
            System.out.println("5  | Dr Papper    | " + dr_papper);
            System.out.println("6  | Pocari Sweat | " + pocariSweat);
            System.out.println("7  | Calpico      | " + calpico);
            System.out.println("8  | Ornamin C    | " + ornaminC);
            System.out.println("=====================================");
            System.out.print("Choose a drink = ");
            int choose = input.nextInt();
            
            switch (choose) {
                case 1:{
                    System.out.println("You chose Coca-Cola");
                    total += cocaCola;
                    order.add("Cola-Cola");
                    break;
                }
                case 2:{
                    System.out.println("You chose Pepsi");
                    total += pepsi;
                    order.add("Pepsi");
                    break;
                }
                case 3:{
                    System.out.println("You chose Fanta");
                    total += fanta;
                    order.add("Fanta");
                    break;
                }
                case 4:{
                    System.out.println("You chose Sprite");
                    total += sprite;
                    order.add("Sprite");
                    break;
                }
                case 5:{
                    System.out.println("You chose Dr Papper");
                    total += dr_papper;
                    order.add("Dr Papper");
                    break;
                }
                case 6:{
                    System.out.println("You chose Pocari Sweat");
                    total += pocariSweat;
                    order.add("Pocari Sweat");
                    break;
                }
                    case 7:{
                    System.out.println("You chose Calpico");
                    total += calpico;
                    order.add("Calpico");
                    break;
                }
                    case 8:{
                    System.out.println("Kamu memilih Ornamin C");
                    total += ornaminC;
                    order.add("Ornamin C");
                    break;
                }
            }
            System.out.println("=====================================");
            System.out.print("Would you like to order again (y / n)? ");
            repeat = input.next();
        }

        System.out.println("\n==== Your order ==== ");
        System.out.println("NO | Name          ");
        System.out.println("---+---------------");
        
        for(int i=0; i<order.size(); i++) {
            System.out.println((i+1) + "  | " + order.get(i));
        }
        System.out.println("-------------------");

        System.out.println("Total price : " + total);
        
        while(true) {
            System.out.print("\nEnter your money: ");
            int money = input.nextInt();
            if(money > total) {
                int change = money - total;
                System.out.println("money changes " + change);
                System.out.print("You already bought ");
                for(int i=0; i<order.size(); i++) {
                    System.out.print(order.get(i) + ", ");
                }
                System.out.println("Thank you!");
                break;
            } else if(money == total) {
                System.out.println("your money has no change");
                System.out.print("You already bought ");
                for(int i=0; i<order.size(); i++) {
                    System.out.print(order.get(i) + ", ");
                }
                System.out.println("Thank you!");
                break;
            } else {
                System.out.println("Your money is not enough! Please enter again");
            }
        }
    }
}
    
