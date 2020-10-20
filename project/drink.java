package MenuUtama;

import java.util.ArrayList;
import java.util.Scanner;

public class coba {

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int menuNumber;
        
        System.out.println("\nNo | Name of Drink | Price");
        System.out.println("---+---------------+-----------");
        System.out.println("1  | Coca-Cola     | 11000");
        System.out.println("2  | Pepsi         | 9500");
        System.out.println("3  | Fanta         | 12000");
        System.out.println("4  | Sprite        | 10500");
        System.out.println("5  | Dr Papper     | 15000");
        System.out.println("6  | pocari sweat  | 7000");
        System.out.println("7  | Calpico       | 6500");
        System.out.println("8  | Ornamin C     | 10000");
        System.out.println("---+---------------+-----------");
        System.out.println("\nMenu:");
        System.out.println("1. Choose the drink you want");
        System.out.println("2. Search the drink you want");
        System.out.println("3. Sort by drink price");
        System.out.println("4. Sort by drink name");
        System.out.print("\nPlease select a number from the menu:");
        menuNumber = userInput.nextInt();
        switch(menuNumber){
            case 1:
                chooseDrink();
                break;
            case 2:
                searchDrink();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
        }             
    }
    
    public static void chooseDrink(){
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

        System.out.println("\n********** Choose the drink you want! ***********");

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
            System.out.print("Choose the drink you want : ");
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
        calculateTheTotalPurchase(order, total);
    }
    
    public static void calculateTheTotalPurchase(ArrayList<String> cOrder, int total){
        Scanner input = new Scanner(System.in); 
        while(true) {
            System.out.print("\nEnter your money: ");
            int money = input.nextInt();
            if(money > total) {
                int change = money - total;
                System.out.println("money changes " + change);
                System.out.print("You already bought ");
                for(int i=0; i<cOrder.size(); i++) {
                    System.out.print(cOrder.get(i) + ", ");
                }
                System.out.println("Thank you!");
                break;
            } else if(money == total) {
                System.out.println("your money has no change");
                System.out.print("You already bought ");
                for(int i=0; i<cOrder.size(); i++) {
                    System.out.print(cOrder.get(i) + ", ");
                }
                System.out.println("Thank you!");
                break;
            } else {
                System.out.println("Your money is not enough! Please enter again");
            }
        }
    }
    
    public static void searchDrink(){
        Scanner input = new Scanner(System.in);    
        ArrayList<String> drink = new ArrayList<String>();
        ArrayList<String> drinkFound = new ArrayList<String>();
        ArrayList<Integer> price = new ArrayList<Integer>();
        
        drink.add("Cola-Cola");
        drink.add("Pepsi");
        drink.add("Fanta");
        drink.add("Sprite");
        drink.add("Dr Papper");
        drink.add("Pocari Sweat");
        drink.add("Calpico");
        drink.add("Ornamin C");

        price.add(11000);
        price.add(9500);
        price.add(12000);
        price.add(10500);
        price.add(15000);
        price.add(7000);
        price.add(6500);
        price.add(10000);
        int total = 0;

        System.out.println("\n********** Search the drink you want! ***********");
        System.out.println("\n            Main Menu            \n");
        System.out.println("NO | Name         | Price");
        System.out.println("---+--------------+-------");
        System.out.println("1  | Cola-Cola    | " + price.get(0));
        System.out.println("2  | Pepsi        | " + price.get(1));
        System.out.println("3  | Fanta        | " + price.get(2));
        System.out.println("4  | Sprite       | " + price.get(3));
        System.out.println("5  | Dr Papper    | " + price.get(4));
        System.out.println("6  | Pocari Sweat | " + price.get(5));
        System.out.println("7  | Calpico      | " + price.get(6));
        System.out.println("8  | Ornamin C    | " + price.get(7));
        System.out.println("=====================================");
        System.out.print("Type in the name of the drink you want to search for : ");
        String search = input.nextLine();
        int n = 0;
        for(int i=0;i<=drink.size()-1;i++){
            n = i;
            if(search.equals(drink.get(i))){
                System.out.println("\n==== Your Search ==== ");
                System.out.println("NO | Name          | Price");
                System.out.println("---+---------------+-----------");
                System.out.println((n+1) + "  | " + drink.get(n) + "         | " + price.get(n));
                System.out.println("-------------------------------");
                drinkFound.add(drink.get(n));
                break;
            }
        }
        total = price.get(n);
        String q = "";
        System.out.print("Is this the drink you mean (y/n) : ");
        q = input.nextLine();
        if(q.equals("y")){
            System.out.print("Buy this drink (y/n) : ");
            q = input.nextLine();
            if(q.equals("y")){
                System.out.println("Total price : " + total);
                calculateTheTotalPurchase(drinkFound,total);
            }else{
                System.out.println("Thank you!");
            }
        }
    }
}
