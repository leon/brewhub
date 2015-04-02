package se.radley.brewhub.io.beerxml.schema;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@JsonRootName("STYLE")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Style {

    @JsonProperty("NAME")
    protected String name;

    @JsonProperty("VERSION")
    protected int version;

    @JsonProperty("NOTES")
    protected String notes;

    @JsonProperty("TYPE")
    protected String type;

    @JsonProperty("CATEGORY")
    protected String category;

    @JsonProperty("CATEGORY_NUMBER")
    protected int categoryNumber;

    @JsonProperty("STYLE_LETTER")
    protected String styleLetter;

    @JsonProperty("STYLE_GUIDE")
    protected String styleGuide;

    @JsonProperty("PROFILE")
    protected String profile;

    @JsonProperty("INGREDIENTS")
    protected String ingredients;

    @JsonProperty("EXAMPLES")
    protected String examples;

    @JsonProperty("OG_MIN")
    protected double ogMin;

    @JsonProperty("OG_MAX")
    protected double ogMax;

    @JsonProperty("FG_MIN")
    protected double fgMin;

    @JsonProperty("FG_MAX")
    protected double fgMax;

    @JsonProperty("IBU_MIN")
    protected double ibuMin;

    @JsonProperty("IBU_MAX")
    protected double ibuMax;

    @JsonProperty("COLOR_MIN")
    protected double colorMin;

    @JsonProperty("COLOR_MAX")
    protected double colorMax;

    @JsonProperty("CARB_MIN")
    protected double carbMin;

    @JsonProperty("CARB_MAX")
    protected double carbMax;

    @JsonProperty("ABV_MAX")
    protected double abvMax;

    @JsonProperty("ABV_MIN")
    protected double abvMin;

    // DISPLAY_OG_MIN
    // DISPLAY_OG_MAX
    // DISPLAY_FG_MIN
    // DISPLAY_FG_MAX
    // DISPLAY_COLOR_MIN
    // DISPLAY_COLOR_MAX

	//<editor-fold desc="Getters and Setters">
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getCategoryNumber() {
		return categoryNumber;
	}

	public void setCategoryNumber(int categoryNumber) {
		this.categoryNumber = categoryNumber;
	}

	public String getStyleLetter() {
		return styleLetter;
	}

	public void setStyleLetter(String styleLetter) {
		this.styleLetter = styleLetter;
	}

	public String getStyleGuide() {
		return styleGuide;
	}

	public void setStyleGuide(String styleGuide) {
		this.styleGuide = styleGuide;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getExamples() {
		return examples;
	}

	public void setExamples(String examples) {
		this.examples = examples;
	}

	public double getOgMin() {
		return ogMin;
	}

	public void setOgMin(double ogMin) {
		this.ogMin = ogMin;
	}

	public double getOgMax() {
		return ogMax;
	}

	public void setOgMax(double ogMax) {
		this.ogMax = ogMax;
	}

	public double getFgMin() {
		return fgMin;
	}

	public void setFgMin(double fgMin) {
		this.fgMin = fgMin;
	}

	public double getFgMax() {
		return fgMax;
	}

	public void setFgMax(double fgMax) {
		this.fgMax = fgMax;
	}

	public double getIbuMin() {
		return ibuMin;
	}

	public void setIbuMin(double ibuMin) {
		this.ibuMin = ibuMin;
	}

	public double getIbuMax() {
		return ibuMax;
	}

	public void setIbuMax(double ibuMax) {
		this.ibuMax = ibuMax;
	}

	public double getColorMin() {
		return colorMin;
	}

	public void setColorMin(double colorMin) {
		this.colorMin = colorMin;
	}

	public double getColorMax() {
		return colorMax;
	}

	public void setColorMax(double colorMax) {
		this.colorMax = colorMax;
	}

	public double getCarbMin() {
		return carbMin;
	}

	public void setCarbMin(double carbMin) {
		this.carbMin = carbMin;
	}

	public double getCarbMax() {
		return carbMax;
	}

	public void setCarbMax(double carbMax) {
		this.carbMax = carbMax;
	}

	public double getAbvMax() {
		return abvMax;
	}

	public void setAbvMax(double abvMax) {
		this.abvMax = abvMax;
	}

	public double getAbvMin() {
		return abvMin;
	}

	public void setAbvMin(double abvMin) {
		this.abvMin = abvMin;
	}
	//</editor-fold>
}
