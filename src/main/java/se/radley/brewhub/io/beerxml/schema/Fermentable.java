package se.radley.brewhub.io.beerxml.schema;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "FERMENTABLE")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Fermentable {

    @XmlElement(name = "NAME")
    protected String name;

    @XmlElement(name = "VERSION")
    protected int version;

    @XmlElement(name = "NOTES")
    protected String notes;

    @XmlElement(name = "TYPE")
    protected String type;

    @XmlElement(name = "AMOUNT")
    protected double amount;

    @XmlElement(name = "YIELD")
    protected double yield;

    @XmlElement(name = "COLOR")
    protected double color;

    @XmlElement(name = "ADD_AFTER_BOIL")
    protected boolean addAfterBoil;

    @XmlElement(name = "ORIGIN")
    protected String origin;

    @XmlElement(name = "SUPPLIER")
    protected String supplier;

    @XmlElement(name = "COARSE_FINE_DIFF")
    protected double courseFineDiff;

    @XmlElement(name = "MOISTURE")
    protected double moisture;

    @XmlElement(name = "DIASTATIC_POWER")
    protected double diastaticPower;

    @XmlElement(name = "PROTEIN")
    protected double protein;

    @XmlElement(name = "MAX_IN_BATCH")
    protected double maxInBatch;

    @XmlElement(name = "RECOMMEND_MASH")
    protected boolean recommendMash;

    @XmlElement(name = "IBU_GAL_PER_LB")
    protected double ibuGalPerLB;

    @XmlElement(name = "POTENTIAL")
    protected double potential;

    // DISPLAY_AMOUNT
    // INVENTORY
    // DISPLAY_COLOR
    // EXTRACT_SUBSTITUTE


    /*
    <NAME>Maris Otter (Crisp)</NAME>
 <VERSION>1</VERSION>
 <TYPE>Grain</TYPE>
 <AMOUNT>9.9999936</AMOUNT>
 <YIELD>82.5000000</YIELD>
 <COLOR>5.5000001</COLOR>
 <ADD_AFTER_BOIL>FALSE</ADD_AFTER_BOIL>
 <ORIGIN>United Kingdom</ORIGIN>
 <SUPPLIER>MaltMagnus.se</SUPPLIER>
 <NOTES>Sorten Maris Otter &#228;r framodlad av Dr GDH Bell i Cambridge genom att korsa Proctor och Pioneer korn. Maris Otter har odlats f&#246;r m&#228;ltning mer &#228;n 45 &#229;r och dess stamtavla och meriter, levererar &#229;r efter &#229;r en konsekvent, bearbetbar och smakrik malt. Maris Otter anses vara Pale Ale maltens Rolls Royce.</NOTES>
 <COARSE_FINE_DIFF>1.5000000</COARSE_FINE_DIFF>
 <MOISTURE>2.8000000</MOISTURE>
 <DIASTATIC_POWER>50.0000000</DIASTATIC_POWER>
 <PROTEIN>11.7000000</PROTEIN>
 <MAX_IN_BATCH>100.0000000</MAX_IN_BATCH>
 <RECOMMEND_MASH>TRUE</RECOMMEND_MASH>
 <IBU_GAL_PER_LB>0.0000000</IBU_GAL_PER_LB>
 <DISPLAY_AMOUNT>10.00 kg</DISPLAY_AMOUNT>
 <INVENTORY>0.00 kg</INVENTORY>
 <POTENTIAL>1.0379500</POTENTIAL>
 <DISPLAY_COLOR>5.5 EBC</DISPLAY_COLOR>
 <EXTRACT_SUBSTITUTE>Pale Liquid Extract</EXTRACT_SUBSTITUTE>
     */
}
