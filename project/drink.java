/*
 *  Java Drink file
 *  Contains Drink Class Defintion
 *  for drink details
 */


import java.util.*;

public class Drink {
  /*
   *  Privata data members
   *  Note: Can add more
   */
  private String name;
  private int price;

  /*
   *  Default constructor
   *  Assign default null value to private members
   *  @param - NULL
   */
  public Drink() {
    name = "";
    price = 0;
  }

  /*
   *  setName
   *  @param name - new name for the product drink
   */
  public void setName(String nm) {
    this.name = nm;
  }

  /*
  *  getName
  *  @return the name of the product
  */
  public String getName() {
    return this.name;
  }

  /*
  * setPrice
  *  @param price - the price of the product
  */
  public void setPrice(int pr) {
    this.price = pr;
  }

  /*
  * getPrice
  * @return the price of the product
  */
  public int getPrice() {
    return this.price;
  }
}