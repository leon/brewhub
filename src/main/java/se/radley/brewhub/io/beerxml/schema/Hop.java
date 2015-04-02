package se.radley.brewhub.io.beerxml.schema;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HOP")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Hop {

    @XmlElement(name = "NAME")
    protected String name;

    @XmlElement(name = "VERSION")
    protected int version;

    @XmlElement(name = "NOTES")
    protected String notes;

    @XmlElement(name = "ORIGIN")
    protected String origin;

    @XmlElement(name = "TYPE")
    protected String type;

    @XmlElement(name = "FORM")
    protected String form;

    @XmlElement(name = "ALPHA")
    protected double alpha;

    @XmlElement(name = "BETA")
    protected double beta;

    @XmlElement(name = "HSI")
    protected double hsi;

    @XmlElement(name = "USE")
    protected String use;

    @XmlElement(name = "AMOUNT")
    protected double amount;

    @XmlElement(name = "TIME")
    protected double time;

    // DISPLAY_AMOUNT
    // INVENTORY
    // DISPLAY_TIME
}
