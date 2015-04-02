package se.radley.brewhub.io.beerxml.schema;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import se.radley.brewhub.io.StringBooleanJsonDeserializer;

@JsonRootName("MISC")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Misc {

    @JsonProperty("NAME")
    protected String name;

    @JsonProperty("VERSION")
    protected int version;

    @JsonProperty("NOTES")
    protected String notes;

    @JsonProperty("TYPE")
    protected String type;

    @JsonProperty("USE")
    protected String use;

    @JsonProperty("USE_FOR")
    protected String useFor;

    @JsonProperty("AMOUNT")
    protected double amount;

    @JsonProperty("TIME")
    protected double time;

    @JsonProperty("AMOUNT_IS_WEIGHT")
	@JsonDeserialize(using = StringBooleanJsonDeserializer.class)
    protected boolean amountIsWeight;

    // DISPLAY_AMOUNT
    // INVENTORY
    // DISPLAY_TIME
    // BATCH_SIZE

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

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public String getUseFor() {
		return useFor;
	}

	public void setUseFor(String useFor) {
		this.useFor = useFor;
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

	public boolean getAmountIsWeight() {
		return amountIsWeight;
	}

	public void setAmountIsWeight(boolean amountIsWeight) {
		this.amountIsWeight = amountIsWeight;
	}
	//</editor-fold>
}
