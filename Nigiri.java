package com.comp301.a01sushi;

public class Nigiri implements Sushi {
  private String name;
  private IngredientPortion[] ingredients = new IngredientPortion[2];
  public enum NigiriType {TUNA, YELLOWTAIL, EEL, CRAB, SHRIMP};
  public Nigiri(NigiriType type) {
    if (type.equals(NigiriType.TUNA)) {
      name = "tuna";
      ingredients[0] = new TunaPortion(0.75);
      ingredients[1] = new RicePortion(0.5);
    } else if (type.equals((NigiriType.YELLOWTAIL))) {
      name = "yellowtail";
      ingredients[0] = new YellowtailPortion(0.75);
      ingredients[1] = new RicePortion(0.5);
    } else if (type.equals((NigiriType.EEL))) {
      name = "eel";
      ingredients[0] = new EelPortion(0.75);
      ingredients[1] = new RicePortion(0.5);
    } else if (type.equals((NigiriType.CRAB))) {
      name = "crab";
      ingredients[0] = new CrabPortion(0.75);
      ingredients[1] = new RicePortion(0.5);
    } else if (type.equals((NigiriType.SHRIMP))) {
      name = "shrimp";
      ingredients[0] = new ShrimpPortion(0.75);
      ingredients[1] = new RicePortion(0.5);
    }
  }
  public String getName() {
    return name+" nigiri";
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
    for (IngredientPortion i : ingredients) {tot += i.getCost();}
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
