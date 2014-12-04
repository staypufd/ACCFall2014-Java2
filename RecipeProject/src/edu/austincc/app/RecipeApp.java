package edu.austincc.app;

import java.util.ArrayList;
import java.util.Scanner;

import edu.austincc.domain.Recipe;

public class RecipeApp {

	ArrayList<Recipe> recipes = new ArrayList<Recipe>();
	

	protected void addInitialRecipes() {
		Recipe r1 = firstRecipe();
		Recipe r2 = secondRecipe();
		Recipe r3 = thirdRecipe();
		
		this.addRecipe(r1);
		this.addRecipe(r2);
		this.addRecipe(r3);
	}


	private Recipe thirdRecipe() {
		ArrayList<String> r3Ingredients = new ArrayList<String>(6);
		r3Ingredients.add("1 (3.9 ounce) package instant chocolate pudding mix");
		r3Ingredients.add("1/2 cup white sugar");
		r3Ingredients.add("3 cups milk");
		
		ArrayList<String> r3Steps = new ArrayList<String>(3);
		r3Steps.add("In a mixing bowl, combine pudding, sugar, and milk. Pour mixture into small plastic cups (if you do not have ice pop molds) and freeze. When set, place a wooden craft sticks into them if you are using plastic cups. Serve when frozen.");
		
		Recipe r3 = new Recipe("Chocolate Fudge Pops", r3Ingredients, r3Steps);
		return r3;
	}


	private Recipe secondRecipe() {
		ArrayList<String> r2Ingredients = new ArrayList<String>(6);
		r2Ingredients.add("4 skinless, boneless chicken breast halves");
		r2Ingredients.add("1/2 cup butter, softened");
		r2Ingredients.add("3 cloves garlic, minced");
		r2Ingredients.add("1 teaspoon dried parsley");
		r2Ingredients.add("1/4 teaspoon dried rosemary");
		r2Ingredients.add("1/4 teaspoon dried thyme");
		
		ArrayList<String> r2Steps = new ArrayList(3);
		r2Steps.add("Preheat oven to Broil/Grill and line broiler pan with aluminum foil.");
		r2Steps.add("Place chicken on pan. In a small bowl combine the butter, garlic, parsley, rosemary and thyme and mix together, then evenly spread a dollop of mixture on each chicken breast.");
		r2Steps.add("Broil in preheated oven, turning and frequently coating with remaining herb/butter mixture, for about 15 minutes or until chicken juices run clear.");
		
		Recipe r2 = new Recipe("Broiled Herb Butter Chicken", r2Ingredients, r2Steps);
		return r2;
	}


	protected Recipe firstRecipe() {
		ArrayList<String> r1Ingredients = new ArrayList<String>(6);
		r1Ingredients.add("Butter");
		r1Ingredients.add("Sugar");
		r1Ingredients.add("Peanut Butter");
		r1Ingredients.add("2 Eggs");
		r1Ingredients.add("2 1/2 Cups All Purpose Flour");
		r1Ingredients.add("1 teaspoon baking powder");
		r1Ingredients.add("1/2 tablespoon salt");
		r1Ingredients.add("1 1/2 teaspoons baking soda");
		
		ArrayList<String> r1Steps = new ArrayList<String>(3);
		r1Steps.add("Cream together butter, peanut butter and sugars. Beat in eggs.");
		r1Steps.add("In a separate bowl, sift together flour, baking powder, baking soda, and salt. Stir into batter. Put batter in refrigerator for 1 hour.");
		r1Steps.add("Roll into 1 inch balls and put on baking sheets. Flatten each ball with a fork, making a criss-cross pattern. Bake in a preheated 375 degrees F oven for about 10 minutes or until cookies begin to brown. Do not over-bake.");
		
		Recipe r1 = new Recipe("Peanut Butter Cookies", r1Ingredients, r1Steps);
		return r1;
	}

	
	public void addRecipe(Recipe r)
	{
		this.recipes.add(r);
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RecipeApp [\nrecipes=").append(recipes).append("]");
		return builder.toString();
	}

	
	
	public ArrayList<Recipe> findRecipeByTitle(String theTitleToFind)
	{
		ArrayList<Recipe> foundRecipes = new ArrayList<Recipe>();
		for (Recipe recipe : recipes) {
			if (recipe.getName().toLowerCase().contains(theTitleToFind.toLowerCase()))
			{
				foundRecipes.add(recipe);
			}
		}
		return foundRecipes;
	}
	
	public ArrayList<Recipe> findRecipeContainingPartialStep(String thePartialStep)
	{
		ArrayList<Recipe> foundRecipes = new ArrayList<Recipe>();
		for (Recipe recipe : recipes) {
			ArrayList<String> steps = recipe.getSteps();
			for (String string : steps) {
				if (string.toLowerCase().contains(thePartialStep.toLowerCase()))
				{
					foundRecipes.add(recipe);
				}
			}
		}
		return foundRecipes;
	}
	
	public ArrayList<Recipe> findRecipeContainingPartialIngredient(String thePartialIngredient)
	{
		ArrayList<Recipe> foundRecipes = new ArrayList<Recipe>();
		for (Recipe recipe : recipes) {
			ArrayList<String> ingredients = recipe.getIngredients();
			for (String string : ingredients) {
				if (string.toLowerCase().contains(thePartialIngredient.toLowerCase()))
				{
					foundRecipes.add(recipe);
				}
			}
		}
		return foundRecipes;
	}
	

	// Class Methods
	public static void main(String[] args) {

		RecipeApp ra = new RecipeApp();
		
		ra.addInitialRecipes();
		
		System.out.println(ra);
		
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter part of the title your looking for: ");
		String findThis = s.nextLine();
		ArrayList<Recipe> foundRecipes = ra.findRecipeByTitle(findThis);
		if ((foundRecipes != null) && (!foundRecipes.isEmpty())) {
			System.out.println("\n\n\nRecipes were found. They are: " + foundRecipes);
		} else {
			System.out.println("\n\n\nRecipe was not found");
		}
		
		// Remove all the found recipes so we can search by steps now
		foundRecipes.clear();
		System.out.println("Please enter the part of the step your looking for: ");
		String findStep = s.nextLine();
		foundRecipes = ra.findRecipeContainingPartialStep(findStep);
		if ((foundRecipes != null) && (!foundRecipes.isEmpty())) {
			System.out.println("\n\n\nRecipes were found. They are: " + foundRecipes);
		} else {
			System.out.println("\n\n\nRecipe was not found");
		}
		
		// Remove all the found recipes so we can search by steps now
		foundRecipes.clear();
		System.out.println("Please enter the part of the ingredient your looking for: ");
		String findIngredient = s.nextLine();
		foundRecipes = ra.findRecipeContainingPartialIngredient(findIngredient);
		if ((foundRecipes != null) && (!foundRecipes.isEmpty())) {
			System.out.println("\n\n\nRecipes were found. They are: " + foundRecipes);
		} else {
			System.out.println("\n\n\nRecipe was not found");
		}
		
		s.close();
	}
	
}


























