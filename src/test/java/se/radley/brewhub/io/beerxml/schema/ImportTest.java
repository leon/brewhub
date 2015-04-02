package se.radley.brewhub.io.beerxml.schema;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import se.radley.brewhub.BrewHubApplication;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BrewHubApplication.class)
@WebAppConfiguration
public class ImportTest {

    private XmlMapper mapper = Jackson2ObjectMapperBuilder.xml().build();

    @Test
    public void importTest() throws IOException {

        File file = new File(getClass().getResource("/io/beerxml/import1.xml").getFile());

        List<Recipe> recipes = mapper.readValue(file, new TypeReference<List<Recipe>>() {});

        assertNotNull("Recipes cannot be null", recipes);

        assertTrue("Recipes exist", recipes.size() > 0);
    }
}
