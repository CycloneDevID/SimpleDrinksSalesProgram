/*
 *  Java main file
 *  Containes driver class for drink Class
 */


import java.util.*;
import java.io.*;

public class Driver {
  
  public static void main(String[] args){
    // your code
    String ulang = "y";
    
    Scanner input = new Scanner(System.in);
    String fileName = "product_details.csv";
    
    ArrayList<drink> drinksList = loaddrinks(fileName);
    
    System.out.println("********** WELCOME TO ANY drink ***********");
    System.out.println();
    displaydrinks(drinksList);
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
        case 1: choosedrinks(drinksList);
                break;
        
        case 2: searchdrinks(drinksList);
                break;
        
        case 3: sortdrinksByPrice(drinksList);
                break;
        
        case 4: sortdrinksByName(drinksList);
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
   *  @return - An ArrayList of drink objects
   */
  public static ArrayList<drink> loaddrinks(String fileName) {
    ArrayList<drink> drinksList = new ArrayList<drink>();
    try {
      //  opening file
      Scanner inFile = new Scanner(new File(fileName));
      while (inFile.hasNext()) {
        drink dr = new drink();
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
   *  displaydrinks
   *  Given an ArrayList of drink objects, outputs them
   *  to the console in the specified format.
   *  The format for this method is:
   *  NAME, INVENTORY_CODE, QUANTITY, PRICE, TYPE, RATING 
   *  @param products - ArrayList of Product objects
   */
  public static void displaydrinks(ArrayList<drink> drinksList) {
    System.out.println("No | Name of drink | Price");
    System.out.println("---+---------------+-----------");
    for (int i = 0; i < drinksList.size(); i++) {
      drink tmpdrink = drinksList.get(i);
      //System.out.print((i+1) + "\t");
      //System.out.print(tmpdrink.getName() + "\t");
      //System.out.print(tmpdrink.getPrice());
      //System.out.println();
      System.out.println(String.format("%-3s| %-14s| %s" , (i+1), tmpdrink.getName(), tmpdrink.getPrice()));
    }
    System.out.println("---+---------------+-----------");
  }

  /*
   *  choosedrinks
   *  Given an ArrayList of drink objects, choose among them for billing and perform billing
   *  @param products - ArrayList of Product objects
   */
  public static void choosedrinks(ArrayList<drink> drinksList) {
    //  TODO:
  }

  /*
   *  searchdrinks
   *  Given an ArrayList of drink objects, search among them and return if found
   *  @param products - ArrayList of Product objects
   */
  public static void searchdrinks(ArrayList<drink> drinksList) {
    //  TODO:
  }

  /*
   *  sortdrinksByPrice
   *  Given an ArrayList of drink objects, sort them by their prices
   *  @param products - ArrayList of Product objects
   */
  public static void sortdrinksByPrice(ArrayList<drink> drinksList) {
    //  TODO:
  }

  /*
   *  sortdrinksByName
   *  Given an ArrayList of drink objects, sort them by their names
   *  @param products - ArrayList of Product objects
   */
  public static void sortdrinksByName(ArrayList<drink> drinksList) {
    //  TODO:
  }
}