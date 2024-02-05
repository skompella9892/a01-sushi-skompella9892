package com.comp301.a01sushi;

public class Ingredient_Impl implements Ingredient {
  private String name;
  private int cpo;
  private double ppo;
  private boolean isVegetarian;
  private boolean isRice;
  private boolean isShellfish;
  public Ingredient_Impl(String name_a, int cpo_a, double ppo_a, boolean isVegetarian_a, boolean isRice_a, boolean isShellfish_a) {
    name = name_a;
    cpo = cpo_a;
    ppo = ppo_a;
    isVegetarian = isVegetarian_a;
    isRice = isRice_a;
    isShellfish = isShellfish_a;
  }
  public String getName() {
    return this.name;
  }
  public void setName(String newName) {
    name = newName;
  }
  public int getCaloriesPerOunce() {
    return this.cpo;
  }
  public void setCaloriesPerOunce(int newCaloriesPerOunce) {
    cpo = newCaloriesPerOunce;
  }
  public double getPricePerOunce() {
    return this.ppo;
  }
  public void setPricePerOunce(double newPricePerOunce) {
    ppo = newPricePerOunce;
  }
  public boolean getIsVegetarian() {
    return this.isVegetarian;
  }
  public void setIsVegetarian(boolean newIsVegetarian) {
    isVegetarian = newIsVegetarian;
  }
  public boolean getIsRice() {
    return this.isRice;
  }
  public void setIsRice(boolean newIsRice) {
    isRice = newIsRice;
  }
  public boolean getIsShellfish() {
    return this.isShellfish;
  }
  public void setIsShellfish(boolean newIsShellfish) {
    isShellfish = newIsShellfish;
  }
  public boolean equals(Ingredient other) {
    if (this.name.equals(other.getName()) && this.cpo == other.getCaloriesPerOunce() && this.isRice == other.getIsRice() && this.isVegetarian == other.getIsVegetarian() && this.isShellfish == other.getIsShellfish()) {return true;}
    return false;
  }
  public void create(
      String name_a,
      int cpo_a,
      double ppo_a,
      boolean isVegetarian_a,
      boolean isRice_a,
      boolean isShellfish_a) {
    name = name_a;
    cpo = cpo_a;
    ppo = ppo_a;
    isVegetarian = isVegetarian_a;
    isRice = isRice_a;
    isShellfish = isShellfish_a;
  }
}
