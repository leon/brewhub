package se.radley.brewhub.io.beerxml.schema;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "MISC")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Misc {

    @XmlElement(name = "NAME")
    protected String name;

    @XmlElement(name = "VERSION")
    protected int version;

    @XmlElement(name = "NOTES")
    protected String notes;

    @XmlElement(name = "TYPE")
    protected String type;

    @XmlElement(name = "USE")
    protected String use;

    @XmlElement(name = "USE_FOR")
    protected String useFor;

    @XmlElement(name = "AMOUNT")
    protected double amount;

    @XmlElement(name = "TIME")
    protected double time;

    @XmlElement(name = "AMOUNT_IS_WEIGHT")
    protected double amountIsWeight;

    // DISPLAY_AMOUNT
    // INVENTORY
    // DISPLAY_TIME
    // BATCH_SIZE
}
