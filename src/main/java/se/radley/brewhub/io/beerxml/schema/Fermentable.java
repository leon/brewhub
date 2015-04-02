package se.radley.brewhub.io.beerxml.schema;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import se.radley.brewhub.io.StringBooleanJsonDeserializer;

@JsonRootName("FERMENTABLE")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Fermentable {

    @JsonProperty("NAME")
    protected String name;

    @JsonProperty("VERSION")
    protected int version;

    @JsonProperty("NOTES")
    protected String notes;

    @JsonProperty("TYPE")
    protected String type;

    @JsonProperty("AMOUNT")
    protected double amount;

    @JsonProperty("YIELD")
    protected double yield;

    @JsonProperty("COLOR")
    protected double color;

    @JsonProperty("ADD_AFTER_BOIL")
	@JsonDeserialize(using = StringBooleanJsonDeserializer.class)
    protected boolean addAfterBoil;

    @JsonProperty("ORIGIN")
    protected String origin;

    @JsonProperty("SUPPLIER")
    protected String supplier;

    @JsonProperty("COARSE_FINE_DIFF")
    protected double courseFineDiff;

    @JsonProperty("MOISTURE")
    protected double moisture;

    @JsonProperty("DIASTATIC_POWER")
    protected double diastaticPower;

    @JsonProperty("PROTEIN")
    protected double protein;

    @JsonProperty("MAX_IN_BATCH")
    protected double maxInBatch;

    @JsonProperty("RECOMMEND_MASH")
	@JsonDeserialize(using = StringBooleanJsonDeserializer.class)
    protected boolean recommendMash;

    @JsonProperty("IBU_GAL_PER_LB")
    protected double ibuGalPerLB;

    @JsonProperty("POTENTIAL")
    protected double potential;

    // DISPLAY_AMOUNT
    // INVENTORY
    // DISPLAY_COLOR
    // EXTRACT_SUBSTITUTE


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

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getYield() {
		return yield;
	}

	public void setYield(double yield) {
		this.yield = yield;
	}

	public double getColor() {
		return color;
	}

	public void setColor(double color) {
		this.color = color;
	}

	public boolean isAddAfterBoil() {
		return addAfterBoil;
	}

	public void setAddAfterBoil(boolean addAfterBoil) {
		this.addAfterBoil = addAfterBoil;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public double getCourseFineDiff() {
		return courseFineDiff;
	}

	public void setCourseFineDiff(double courseFineDiff) {
		this.courseFineDiff = courseFineDiff;
	}

	public double getMoisture() {
		return moisture;
	}

	public void setMoisture(double moisture) {
		this.moisture = moisture;
	}

	public double getDiastaticPower() {
		return diastaticPower;
	}

	public void setDiastaticPower(double diastaticPower) {
		this.diastaticPower = diastaticPower;
	}

	public double getProtein() {
		return protein;
	}

	public void setProtein(double protein) {
		this.protein = protein;
	}

	public double getMaxInBatch() {
		return maxInBatch;
	}

	public void setMaxInBatch(double maxInBatch) {
		this.maxInBatch = maxInBatch;
	}

	public boolean isRecommendMash() {
		return recommendMash;
	}

	public void setRecommendMash(boolean recommendMash) {
		this.recommendMash = recommendMash;
	}

	public double getIbuGalPerLB() {
		return ibuGalPerLB;
	}

	public void setIbuGalPerLB(double ibuGalPerLB) {
		this.ibuGalPerLB = ibuGalPerLB;
	}

	public double getPotential() {
		return potential;
	}

	public void setPotential(double potential) {
		this.potential = potential;
	}
	//</editor-fold>
}
