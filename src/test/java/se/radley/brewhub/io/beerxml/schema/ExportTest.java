package se.radley.brewhub.io.beerxml.schema;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import se.radley.brewhub.BrewHubApplication;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BrewHubApplication.class)
@WebAppConfiguration
public class ExportTest {

    private XmlMapper mapper = Jackson2ObjectMapperBuilder.xml().build();

    @Test
    public void exportTest() throws IOException {

		File exportDir = new File(System.getProperty("user.dir"), "export");
		exportDir.mkdirs();

		File file = new File(exportDir, "export.xml");

		Recipe r = new Recipe();
		r.setName("Hopsy Daisy");

		mapper.writeValue(file, r);

		assertTrue("Export must exist", file.exists());
    }

	@Test
	 public void exportTest2() throws IOException {

		File exportDir = new File(System.getProperty("user.dir"), "export");
		exportDir.mkdirs();

		File file = new File(exportDir, "export2.xml");

		Recipes recipes = new Recipes();

		Recipe r = new Recipe();
		recipes.getRecipes().add(r);
		r.setName("Hopsy Daisy");

		mapper.writeValue(file, recipes);

		assertTrue("Export must exist", file.exists());
	}

	@Test
	public void exportTest3() throws IOException {

		File exportDir = new File(System.getProperty("user.dir"), "export");
		exportDir.mkdirs();

		File file = new File(exportDir, "export3.xml");

		List<Recipe> recipes = new ArrayList<>();

		Recipe r = new Recipe();
		recipes.add(r);
		r.setName("Hopsy Daisy");

		mapper.writeValue(file, recipes);

		assertTrue("Export must exist", file.exists());
	}
}
