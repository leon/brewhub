package se.radley.brewhub.io.beerxml.schema;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WATER")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Water {

    @XmlElement(name = "NAME")
    protected String name;

    @XmlElement(name = "VERSION")
    protected int version;

    @XmlElement(name = "NOTES")
    protected String notes;

    @XmlElement(name = "AMOUNT")
    protected double amount;

    @XmlElement(name = "PH")
    protected double ph;

    @XmlElement(name = "CALCIUM")
    protected double calcium;

    @XmlElement(name = "BICARBONATE")
    protected double bicarbonate;

    @XmlElement(name = "SULFATE")
    protected double sulfate;

    @XmlElement(name = "CHLORIDE")
    protected double chloride;

    @XmlElement(name = "SODIUM")
    protected double sodium;

    @XmlElement(name = "MAGNESIUM")
    protected double magnesium;

    // DISPLAY_AMOUNT
}
