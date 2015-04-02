package se.radley.brewhub.io.beerxml.schema;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@JsonRootName("RECIPES")
public class Recipes {

	@JacksonXmlElementWrapper(useWrapping = false)
    private List<Recipe> recipes = new ArrayList<>();

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }
}
