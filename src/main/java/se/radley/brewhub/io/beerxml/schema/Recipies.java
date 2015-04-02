package se.radley.brewhub.io.beerxml.schema;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "RECIPIES")
public class Recipies {

    @XmlElementWrapper(name = "RECIPE")
    private List<Recipe> recipes;

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }
}
