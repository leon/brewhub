package se.radley.brewhub.io.beerxml.schema;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlType(name = "RECIPE")
//@JsonIgnoreProperties(ignoreUnknown = true)
public class Recipe {

    @XmlElement(name = "NAME")
    protected String name;

    @XmlElement(name = "VERSION")
    protected int version;

    @XmlElement(name = "TYPE")
    protected String type;

    @XmlElement(name = "BREWER")
    protected String brewer;

    @XmlElement(name = "ASST_BREWER")
    protected String assistantBrewer;

    @XmlElement(name = "BATCH_SIZE")
    protected double batchSize;

    @XmlElement(name = "BOIL_SIZE")
    protected double boilSize;

    @XmlElement(name = "BOIL_TIME")
    protected double boilTime;

    @XmlElement(name = "EFFICIENCY")
    protected double efficiency;

    /*@XmlElement(name = "HOPS")
    protected List<Hop> hops;

    @XmlElement(name = "FERMENTABLES")
    protected List<Fermentable> fermentables;

    @XmlElement(name = "MISCS")
    protected List<Misc> miscs;

    @XmlElement(name = "WATERS")
    protected List<Water> waters;

    @XmlElement(name = "STYLE")
    protected Style style;*/
}
