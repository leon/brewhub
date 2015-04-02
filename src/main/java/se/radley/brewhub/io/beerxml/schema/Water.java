package se.radley.brewhub.io.beerxml.schema;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@JsonRootName("WATER")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Water {

    @JsonProperty("NAME")
    protected String name;

    @JsonProperty("VERSION")
    protected int version;

    @JsonProperty("NOTES")
    protected String notes;

    @JsonProperty("AMOUNT")
    protected double amount;

    @JsonProperty("PH")
    protected double ph;

    @JsonProperty("CALCIUM")
    protected double calcium;

    @JsonProperty("BICARBONATE")
    protected double bicarbonate;

    @JsonProperty("SULFATE")
    protected double sulfate;

    @JsonProperty("CHLORIDE")
    protected double chloride;

    @JsonProperty("SODIUM")
    protected double sodium;

    @JsonProperty("MAGNESIUM")
    protected double magnesium;

    // DISPLAY_AMOUNT

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

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getPh() {
		return ph;
	}

	public void setPh(double ph) {
		this.ph = ph;
	}

	public double getCalcium() {
		return calcium;
	}

	public void setCalcium(double calcium) {
		this.calcium = calcium;
	}

	public double getBicarbonate() {
		return bicarbonate;
	}

	public void setBicarbonate(double bicarbonate) {
		this.bicarbonate = bicarbonate;
	}

	public double getSulfate() {
		return sulfate;
	}

	public void setSulfate(double sulfate) {
		this.sulfate = sulfate;
	}

	public double getChloride() {
		return chloride;
	}

	public void setChloride(double chloride) {
		this.chloride = chloride;
	}

	public double getSodium() {
		return sodium;
	}

	public void setSodium(double sodium) {
		this.sodium = sodium;
	}

	public double getMagnesium() {
		return magnesium;
	}

	public void setMagnesium(double magnesium) {
		this.magnesium = magnesium;
	}
	//</editor-fold>
}
