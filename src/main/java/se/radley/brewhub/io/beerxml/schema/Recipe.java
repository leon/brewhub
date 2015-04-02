package se.radley.brewhub.io.beerxml.schema;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonRootName("RECIPE")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Recipe {

    @JsonProperty("NAME")
    protected String name;

    @JsonProperty("VERSION")
    protected int version;

    @JsonProperty("TYPE")
    protected String type;

    @JsonProperty("BREWER")
    protected String brewer;

    @JsonProperty("ASST_BREWER")
    protected String assistantBrewer;

    @JsonProperty("BATCH_SIZE")
    protected double batchSize;

    @JsonProperty("BOIL_SIZE")
    protected double boilSize;

    @JsonProperty("BOIL_TIME")
    protected double boilTime;

    @JsonProperty("EFFICIENCY")
    protected double efficiency;

    @JsonProperty("HOPS")
    protected List<Hop> hops;

    @JsonProperty("FERMENTABLES")
    protected List<Fermentable> fermentables;

    @JsonProperty("MISCS")
    protected List<Misc> miscs;

    @JsonProperty("WATERS")
    protected List<Water> waters;

    @JsonProperty("STYLE")
    protected Style style;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrewer() {
		return brewer;
	}

	public void setBrewer(String brewer) {
		this.brewer = brewer;
	}

	public String getAssistantBrewer() {
		return assistantBrewer;
	}

	public void setAssistantBrewer(String assistantBrewer) {
		this.assistantBrewer = assistantBrewer;
	}

	public double getBatchSize() {
		return batchSize;
	}

	public void setBatchSize(double batchSize) {
		this.batchSize = batchSize;
	}

	public double getBoilSize() {
		return boilSize;
	}

	public void setBoilSize(double boilSize) {
		this.boilSize = boilSize;
	}

	public double getBoilTime() {
		return boilTime;
	}

	public void setBoilTime(double boilTime) {
		this.boilTime = boilTime;
	}

	public double getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(double efficiency) {
		this.efficiency = efficiency;
	}

	public List<Hop> getHops() {
		return hops;
	}

	public void setHops(List<Hop> hops) {
		this.hops = hops;
	}

	public List<Fermentable> getFermentables() {
		return fermentables;
	}

	public void setFermentables(List<Fermentable> fermentables) {
		this.fermentables = fermentables;
	}

	public List<Misc> getMiscs() {
		return miscs;
	}

	public void setMiscs(List<Misc> miscs) {
		this.miscs = miscs;
	}

	public List<Water> getWaters() {
		return waters;
	}

	public void setWaters(List<Water> waters) {
		this.waters = waters;
	}

	public Style getStyle() {
		return style;
	}

	public void setStyle(Style style) {
		this.style = style;
	}

	//</editor-fold>
}
