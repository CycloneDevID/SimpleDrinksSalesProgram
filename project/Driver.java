/*
 *  Java main file
 *  Containes driver class for Drink Class
 */


import java.util.*;
import java.io.*;

public class Driver {
  
  public static void main(String[] args){
    // your code
    String ulang = "y";
    
    Scanner input = new Scanner(System.in);
    String fileName = "product_details.csv";
    
    ArrayList<Drink> drinksList = loadDrinks(fileName);
    
    System.out.println("********** WELCOME TO ANY DRINK ***********");
    System.out.println();
    displayDrinks(drinksList);
    System.out.println();
    
    while (ulang.equals("y"))
    {
      System.out.println("Menu:");
      System.out.println("1. Choose the drink you want");
      System.out.println("2. Search the drink you want");
      System.out.println("3. Sort by drink price");
      System.out.println("4. Sort by drink name");
      System.out.println();

      System.out.print("Please select a number from the menu: ");
      int pilih = input.nextInt();

      switch (pilih)
      {
        case 1: chooseDrinks(drinksList);
                break;
        
        case 2: searchDrinks(drinksList);
                break;
        
        case 3: sortDrinksByPrice(drinksList);
                break;
        
        case 4: sortDrinksByName(drinksList);
                break;
        
        default:  System.out.println("Invalid Choice!");
                  System.exit(1);
      }

      System.out.print("Order another drink? (y/n): ");
      ulang = input.next();
    }
    
    input.close();
  }

  /*
   *  loadProducts
   *  Loads drinks details from a file to list drinksList
   *  @param fileName - String containing the input file name
   *  @return - An ArrayList of Drink objects
   */
  public static ArrayList<Drink> loadDrinks(String fileName) {
    ArrayList<Drink> drinksList = new ArrayList<Drink>();
    try {
      //  opening file
      Scanner inFile = new Scanner(new File(fileName));
      while (inFile.hasNext()) {
        Drink dr = new Drink();
        List<String> words = Arrays.asList(inFile.nextLine().split(","));
        dr.setName(words.get(0));
        dr.setPrice(Integer.parseInt(words.get(1)));
        drinksList.add(dr);
      }
      inFile.close();
    }
    catch (IOException e) {
      System.out.println("ERROR: " + e);
    }
    return drinksList;
  }

  /*
   *  displayDrinks
   *  Given an ArrayList of Drink objects, outputs them
   *  to the console in the specified format.
   *  The format for this method is:
   *  NAME, INVENTORY_CODE, QUANTITY, PRICE, TYPE, RATING 
   *  @param products - ArrayList of Product objects
   */
  public static void displayDrinks(ArrayList<Drink> drinksList) {
    System.out.println("No | Name of Drink | Price");
    System.out.println("---+---------------+-----------");
    for (int i = 0; i < drinksList.size(); i++) {
      Drink tmpDrink = drinksList.get(i);
      //System.out.print((i+1) + "\t");
      //System.out.print(tmpDrink.getName() + "\t");
      //System.out.print(tmpDrink.getPrice());
      //System.out.println();
      System.out.println(String.format("%-3s| %-14s| %s" , (i+1), tmpDrink.getName(), tmpDrink.getPrice()));
    }
    System.out.println("---+---------------+-----------");
  }

  /*
   *  chooseDrinks
   *  Given an ArrayList of Drink objects, choose among them for billing and perform billing
   *  @param products - ArrayList of Product objects
   */
  public static void chooseDrinks(ArrayList<Drink> drinksList) {
    //  TODO:
  }

  /*
   *  searchDrinks
   *  Given an ArrayList of Drink objects, search among them and return if found
   *  @param products - ArrayList of Product objects
   */
  public static void searchDrinks(ArrayList<Drink> drinksList) {
    //  TODO:
  }

  /*
   *  sortDrinksByPrice
   *  Given an ArrayList of Drink objects, sort them by their prices
   *  @param products - ArrayList of Product objects
   */
  public static void sortDrinksByPrice(ArrayList<Drink> drinksList) {
    //  TODO:
  }

  /*
   *  sortDrinksByName
   *  Given an ArrayList of Drink objects, sort them by their names
   *  @param products - ArrayList of Product objects
   */
  public static void sortDrinksByName(ArrayList<Drink> drinksList) {
    //  TODO:
  }
}