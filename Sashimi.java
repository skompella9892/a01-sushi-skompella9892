package com.comp301.a01sushi;

import java.lang.reflect.Array;

public class Sashimi implements Sushi {
  public enum SashimiType {TUNA, YELLOWTAIL, EEL, CRAB, SHRIMP};
  private String name;
  private IngredientPortion[] ingredients = new IngredientPortion[1];
  public Sashimi(SashimiType type) {
    if (type.equals(SashimiType.TUNA)) {
      name = "tuna";
      ingredients[0] = new TunaPortion(0.75);
    } else if (type.equals((SashimiType.YELLOWTAIL))) {
      name = "yellowtail";
      ingredients[0] = new YellowtailPortion(0.75);
    } else if (type.equals((SashimiType.EEL))) {
      name = "eel";
      ingredients[0] = new EelPortion(0.75);
    } else if (type.equals((SashimiType.CRAB))) {
      name = "crab";
      ingredients[0] = new CrabPortion(0.75);
    } else if (type.equals((SashimiType.SHRIMP))) {
      name = "shrimp";
      ingredients[0] = new ShrimpPortion(0.75);
    }
  }
  public String getName() {
    return name+ " sashimi";
  }
  public IngredientPortion[] getIngredients() {
    IngredientPortion[] a = ingredients.clone();
    return a;
  }
  public int getCalories() {
    double tot = 0;
    for (IngredientPortion i : ingredients) {tot += i.getCalories();}
    return (int) Math.round(tot);
  }
  public double getCost() {
    double tot = 0;
    for (IngredientPortion i : ingredients) {
      tot += i.getCost();
    }
    return Math.round(tot * 100.0) / 100.0;
  }
  public boolean getHasRice() {
    for (IngredientPortion i : ingredients) {
      if (i.getIsRice()) {return true;}
    }
    return false;
  }

  public boolean getHasShellfish() {
    for (IngredientPortion i : ingredients) {
      if (i.getIsShellfish()) {return true;}
    }
    return false;
  }

  public boolean getIsVegetarian() {
    for (IngredientPortion i : ingredients) {
      if (i.getIsVegetarian()) {return true;}
    }
    return false;
  }
}
