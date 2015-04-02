package se.radley.brewhub.io.beerxml.schema;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "EQUIPMENT")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Equipment {

    @XmlElement(name = "NAME")
    protected String name;

    @XmlElement(name = "VERSION")
    protected int version;

    @XmlElement(name = "NOTES")
    protected String notes;

    @XmlElement(name = "BOIL_SIZE")
    protected double boilSize;

    @XmlElement(name = "BATCH_SIZE")
    protected double batchSize;

    @XmlElement(name = "TUN_VOLUME")
    protected double tunVolume;

    @XmlElement(name = "TUN_WEIGHT")
    protected double tunWeight;

    @XmlElement(name = "TUN_SPECIFIC_HEAT")
    protected double tunSpecificHeat;

    @XmlElement(name = "TOP_UP_WATER")
    protected double topUpWater;

    @XmlElement(name = "TRUB_CHILLER_LOSS")
    protected double trubChillerLoss;

    @XmlElement(name = "EVAP_RATE")
    protected double evapRate;

    @XmlElement(name = "BOIL_TIME")
    protected double boilTime;

    @XmlElement(name = "CALC_BOIL_VOLUME")
    protected boolean calcBoilVolume;

    @XmlElement(name = "LAUTER_DEADSPACE")
    protected double lauterDeadspace;

    @XmlElement(name = "TOP_UP_KETTLE")
    protected double topUpKettle;

    @XmlElement(name = "HOP_UTILIZATION")
    protected double hopUtilization;

    @XmlElement(name = "COOLING_LOSS_PCT")
    protected double coolingLossPct;

    // DISPLAY_BOIL_SIZE = 64.00 l
    // DISPLAY_BATCH_SIZE = 50.00 l
    // DISPLAY_TUN_VOLUME = 70.00 l
    // DISPLAY_TUN_WEIGHT = 24.00 kg
    // DISPLAY_TOP_UP_WATER = 0.00 l
    // DISPLAY_TRUB_CHILLER_LOSS = 6.00 l
    // DISPLAY_LAUTER_DEADSPACE = 0.00 l
    // DISPLAY_TOP_UP_KETTLE = 0.00 l
}
