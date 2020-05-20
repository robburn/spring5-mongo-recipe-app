package guru.springframework.spring5recipeapp.repositories;

import guru.springframework.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRopository extends CrudRepository<Recipe, Long> {

}
