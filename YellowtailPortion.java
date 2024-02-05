package com.comp301.a01sushi;

public class YellowtailPortion implements IngredientPortion {
  private Ingredient_Impl i = new Yellowtail();
  private double ounces;

  public YellowtailPortion(double amt) {
    if (amt < 0) {
      throw new IllegalArgumentException("Value must be greater than 0");
    } else {
      ounces = amt;
    }
  }

  public Ingredient getIngredient() {
    return i;
  }
  public double getAmount() {
    return ounces;
  }
  public String getName() {
    return i.getName();
  }
  public boolean getIsVegetarian() {
    return i.getIsVegetarian();
  }
  public boolean getIsRice() {
    return i.getIsRice();
  }
  public boolean getIsShellfish() {
    return i.getIsShellfish();
  }
  public double getCalories() {
    return i.getCaloriesPerOunce() * ounces;
  }
  public double getCost() {
    return i.getPricePerOunce() * ounces;
  }

  public IngredientPortion combine(IngredientPortion other) {
    if (!this.i.equals(other.getIngredient())) {
      throw new IllegalArgumentException("Ingredients are not the same");
    } else {
      IngredientPortion combined = new YellowtailPortion(ounces + other.getAmount());
      return combined;
    }
  }
}
