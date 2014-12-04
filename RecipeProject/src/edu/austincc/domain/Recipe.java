/**
 * 
 */
package edu.austincc.domain;

import java.util.ArrayList;

/**
 * @author javauser
 *
 */
public class Recipe {
	String name;
	ArrayList<String> ingredients;
	ArrayList<String> steps;
	
	
	public Recipe(String name, ArrayList<String> ingredients, ArrayList<String> steps) {
		super();
		this.name = name;
		this.ingredients = ingredients;
		this.steps = steps;
	}

	public String getName() {
		return name;
	}

	public ArrayList<String> getIngredients() {
		return ingredients;
	}

	public ArrayList<String> getSteps() {
		return steps;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n\tRecipe [name=").append(name).append(", \n\tingredients=")
				.append(ingredients).append(", \n\tsteps=").append(steps)
				.append("]");
		return builder.toString();
	}

}
