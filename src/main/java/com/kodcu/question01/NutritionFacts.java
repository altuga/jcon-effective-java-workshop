package com.kodcu.question01;

/**
 * Altug Bilgin Altintas
 *
 * Effective Java Workshop
 *
 * Email : altug@kodcu.com Twitter : @altugaltintas
 */

/*
TODO: 
 1 - Initialize (create) the class according to the fields below
 2 - Instructor will show the solutions
 3 - Refactor and ask questions
 */
public class NutritionFacts {

    private  int servingSize = 0; // must
    private  int servings = 0; // must
    private  int calories = 0; // optional
    private  int fat = 0;  // optional
    private  int sodium = 0; // optional
    private  int carbohydrate = 0; // optional


    // Setters
    public void setServingSize(int val) {
        servingSize = val;
    }

    public void setServings(int val) {
        servings = val;
    }

    public void setCalories(int val) {
        calories = val;
    }

    public void setFat(int val) {
        fat = val;
    }

    public void setSodium(int val) {
        sodium = val;
    }

    public void setCarbohydrate(int val) {
        carbohydrate = val;
    }


    public static void main(String[] args) {

            NutritionFacts cocaCola = new NutritionFacts();
            cocaCola.setServingSize(240);
            cocaCola.setServings(8);
            cocaCola.setCalories(100);
            cocaCola.setSodium(35);
            cocaCola.setCarbohydrate(27);
        }

}
