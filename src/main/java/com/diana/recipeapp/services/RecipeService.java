package com.diana.recipeapp.services;

import com.diana.recipeapp.commands.RecipeCommand;
import com.diana.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
