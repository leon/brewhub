package se.radley.brewhub.io.beerxml.schema;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@JsonRootName("HOP")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Hop {

    @JsonProperty("NAME")
    protected String name;

    @JsonProperty("VERSION")
    protected int version;

    @JsonProperty("NOTES")
    protected String notes;

    @JsonProperty("ORIGIN")
    protected String origin;

    @JsonProperty("TYPE")
    protected String type;

    @JsonProperty("FORM")
    protected String form;

    @JsonProperty("ALPHA")
    protected double alpha;

    @JsonProperty("BETA")
    protected double beta;

    @JsonProperty("HSI")
    protected double hsi;

    @JsonProperty("USE")
    protected String use;

    @JsonProperty("AMOUNT")
    protected double amount;

    @JsonProperty("TIME")
    protected double time;

    // DISPLAY_AMOUNT
    // INVENTORY
    // DISPLAY_TIME

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

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public double getAlpha() {
		return alpha;
	}

	public void setAlpha(double alpha) {
		this.alpha = alpha;
	}

	public double getBeta() {
		return beta;
	}

	public void setBeta(double beta) {
		this.beta = beta;
	}

	public double getHsi() {
		return hsi;
	}

	public void setHsi(double hsi) {
		this.hsi = hsi;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}
	//</editor-fold>
}
