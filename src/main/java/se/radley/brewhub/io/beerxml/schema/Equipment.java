package se.radley.brewhub.io.beerxml.schema;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@JsonRootName("EQUIPMENT")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Equipment {

    @JsonProperty("NAME")
    protected String name;

    @JsonProperty("VERSION")
    protected int version;

    @JsonProperty("NOTES")
    protected String notes;

    @JsonProperty("BOIL_SIZE")
    protected double boilSize;

    @JsonProperty("BATCH_SIZE")
    protected double batchSize;

    @JsonProperty("TUN_VOLUME")
    protected double tunVolume;

    @JsonProperty("TUN_WEIGHT")
    protected double tunWeight;

    @JsonProperty("TUN_SPECIFIC_HEAT")
    protected double tunSpecificHeat;

    @JsonProperty("TOP_UP_WATER")
    protected double topUpWater;

    @JsonProperty("TRUB_CHILLER_LOSS")
    protected double trubChillerLoss;

    @JsonProperty("EVAP_RATE")
    protected double evapRate;

    @JsonProperty("BOIL_TIME")
    protected double boilTime;

    @JsonProperty("CALC_BOIL_VOLUME")
    protected boolean calcBoilVolume;

    @JsonProperty("LAUTER_DEADSPACE")
    protected double lauterDeadspace;

    @JsonProperty("TOP_UP_KETTLE")
    protected double topUpKettle;

    @JsonProperty("HOP_UTILIZATION")
    protected double hopUtilization;

    @JsonProperty("COOLING_LOSS_PCT")
    protected double coolingLossPct;

    // DISPLAY_BOIL_SIZE = 64.00 l
    // DISPLAY_BATCH_SIZE = 50.00 l
    // DISPLAY_TUN_VOLUME = 70.00 l
    // DISPLAY_TUN_WEIGHT = 24.00 kg
    // DISPLAY_TOP_UP_WATER = 0.00 l
    // DISPLAY_TRUB_CHILLER_LOSS = 6.00 l
    // DISPLAY_LAUTER_DEADSPACE = 0.00 l
    // DISPLAY_TOP_UP_KETTLE = 0.00 l

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

	public double getBoilSize() {
		return boilSize;
	}

	public void setBoilSize(double boilSize) {
		this.boilSize = boilSize;
	}

	public double getBatchSize() {
		return batchSize;
	}

	public void setBatchSize(double batchSize) {
		this.batchSize = batchSize;
	}

	public double getTunVolume() {
		return tunVolume;
	}

	public void setTunVolume(double tunVolume) {
		this.tunVolume = tunVolume;
	}

	public double getTunWeight() {
		return tunWeight;
	}

	public void setTunWeight(double tunWeight) {
		this.tunWeight = tunWeight;
	}

	public double getTunSpecificHeat() {
		return tunSpecificHeat;
	}

	public void setTunSpecificHeat(double tunSpecificHeat) {
		this.tunSpecificHeat = tunSpecificHeat;
	}

	public double getTopUpWater() {
		return topUpWater;
	}

	public void setTopUpWater(double topUpWater) {
		this.topUpWater = topUpWater;
	}

	public double getTrubChillerLoss() {
		return trubChillerLoss;
	}

	public void setTrubChillerLoss(double trubChillerLoss) {
		this.trubChillerLoss = trubChillerLoss;
	}

	public double getEvapRate() {
		return evapRate;
	}

	public void setEvapRate(double evapRate) {
		this.evapRate = evapRate;
	}

	public double getBoilTime() {
		return boilTime;
	}

	public void setBoilTime(double boilTime) {
		this.boilTime = boilTime;
	}

	public boolean isCalcBoilVolume() {
		return calcBoilVolume;
	}

	public void setCalcBoilVolume(boolean calcBoilVolume) {
		this.calcBoilVolume = calcBoilVolume;
	}

	public double getLauterDeadspace() {
		return lauterDeadspace;
	}

	public void setLauterDeadspace(double lauterDeadspace) {
		this.lauterDeadspace = lauterDeadspace;
	}

	public double getTopUpKettle() {
		return topUpKettle;
	}

	public void setTopUpKettle(double topUpKettle) {
		this.topUpKettle = topUpKettle;
	}

	public double getHopUtilization() {
		return hopUtilization;
	}

	public void setHopUtilization(double hopUtilization) {
		this.hopUtilization = hopUtilization;
	}

	public double getCoolingLossPct() {
		return coolingLossPct;
	}

	public void setCoolingLossPct(double coolingLossPct) {
		this.coolingLossPct = coolingLossPct;
	}
	//</editor-fold>
}
