package com.comp301.a01sushi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Roll implements Sushi {
  private String name;
  private IngredientPortion[] ingredients;
  public Roll(String name, IngredientPortion[] roll_ingredients) {
    this.name = name;
    if (roll_ingredients == null) {throw new IllegalArgumentException("Array cannot be null.");}
    for (IngredientPortion i : roll_ingredients) {
      if (i == null) {throw new IllegalArgumentException("Ingredient cannot be null.");}
    }
    // combine ingredients
    HashMap<String, IngredientPortion> map = new HashMap<>();
    for (IngredientPortion i : roll_ingredients) {
      if (map.containsKey(i.getName())) {map.put(i.getName(), i.combine(map.get(i.getName())));}
      else {map.put(i.getName(), i);}
    }
    // seaweed
    if (map.containsKey("seaweed")) {
      if (map.get("seaweed").getAmount() < 0.1) {
        SeaweedPortion a = new SeaweedPortion(0.1);
        map.put("seaweed", a);
      }
    } else {
      SeaweedPortion a = new SeaweedPortion(0.1);
      map.put("seaweed", a);
    }
    ingredients = map.values().toArray(new IngredientPortion[0]);
  }
  public String getName() {return name;}
  public IngredientPortion[] getIngredients() {
    IngredientPortion[] a = ingredients.clone();
    return a;
  }
  public int getCalories() {
    double tot = 0;
    for (IngredientPortion i : ingredients) {tot+= i.getCalories();}
    return (int) Math.round(tot);
  }

  public double getCost() {
    double tot = 0;
    for (IngredientPortion i : ingredients) {tot+= i.getCost();}
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
