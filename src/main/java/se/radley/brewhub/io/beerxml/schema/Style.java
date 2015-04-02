package se.radley.brewhub.io.beerxml.schema;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "STYLE")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Style {

    @XmlElement(name = "NAME")
    protected String name;

    @XmlElement(name = "VERSION")
    protected int version;

    @XmlElement(name = "NOTES")
    protected String notes;

    @XmlElement(name = "TYPE")
    protected String type;

    @XmlElement(name = "CATEGORY")
    protected String category;

    @XmlElement(name = "CATEGORY_NUMBER")
    protected int categoryNumber;

    @XmlElement(name = "STYLE_LETTER")
    protected String styleLetter;

    @XmlElement(name = "STYLE_GUIDE")
    protected String styleGuide;

    @XmlElement(name = "PROFILE")
    protected String profile;

    @XmlElement(name = "INGREDIENTS")
    protected String ingredients;

    @XmlElement(name = "EXAMPLES")
    protected String examples;

    @XmlElement(name = "OG_MIN")
    protected double ogMin;

    @XmlElement(name = "OG_MAX")
    protected double ogMax;

    @XmlElement(name = "FG_MIN")
    protected double fgMin;

    @XmlElement(name = "FG_MAX")
    protected double fgMax;

    @XmlElement(name = "IBU_MIN")
    protected double ibuMin;

    @XmlElement(name = "IBU_MAX")
    protected double ibuMax;

    @XmlElement(name = "COLOR_MIN")
    protected double colorMin;

    @XmlElement(name = "COLOR_MAX")
    protected double colorMax;

    @XmlElement(name = "CARB_MIN")
    protected double carbMin;

    @XmlElement(name = "CARB_MAX")
    protected double carbMax;

    @XmlElement(name = "ABV_MAX")
    protected double abvMax;

    @XmlElement(name = "ABV_MIN")
    protected double abvMin;

    // DISPLAY_OG_MIN
    // DISPLAY_OG_MAX
    // DISPLAY_FG_MIN
    // DISPLAY_FG_MAX
    // DISPLAY_COLOR_MIN
    // DISPLAY_COLOR_MAX
}
