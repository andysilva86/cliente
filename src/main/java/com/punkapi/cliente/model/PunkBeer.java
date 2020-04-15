
package com.punkapi.cliente.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "tagline",
    "first_brewed",
    "description",
    "image_url",
    "abv",
    "ibu",
    "target_fg",
    "target_og",
    "ebc",
    "srm",
    "ph",
    "attenuation_level",
    "volume",
    "boil_volume",
    "method",
    "ingredients",
    "food_pairing",
    "brewers_tips",
    "contributed_by",
    "versao",
    "ipVersao"
})
public class PunkBeer {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("tagline")
    private String tagline;
    @JsonProperty("first_brewed")
    private String firstBrewed;
    @JsonProperty("description")
    private String description;
    @JsonProperty("image_url")
    private String imageUrl;
    @JsonProperty("abv")
    private float abv;
    @JsonProperty("ibu")
    private int ibu;
    @JsonProperty("target_fg")
    private int targetFg;
    @JsonProperty("target_og")
    private int targetOg;
    @JsonProperty("ebc")
    private int ebc;
    @JsonProperty("srm")
    private int srm;
    @JsonProperty("ph")
    private float ph;
    @JsonProperty("attenuation_level")
    private int attenuationLevel;
    @JsonProperty("volume")
    private Volume volume;
    @JsonProperty("boil_volume")
    private BoilVolume boilVolume;
    @JsonProperty("method")
    private Method method;
    @JsonProperty("ingredients")
    private Ingredients ingredients;
    @JsonProperty("food_pairing")
    private List<String> foodPairing = null;
    @JsonProperty("brewers_tips")
    private String brewersTips;
    @JsonProperty("contributed_by")
    private String contributedBy;
    @JsonProperty("versao")
    private int versao;
    @JsonProperty("ipVersao")
    private String ipVersao;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("tagline")
    public String getTagline() {
        return tagline;
    }

    @JsonProperty("tagline")
    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    @JsonProperty("first_brewed")
    public String getFirstBrewed() {
        return firstBrewed;
    }

    @JsonProperty("first_brewed")
    public void setFirstBrewed(String firstBrewed) {
        this.firstBrewed = firstBrewed;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("image_url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("abv")
    public float getAbv() {
        return abv;
    }

    @JsonProperty("abv")
    public void setAbv(float abv) {
        this.abv = abv;
    }

    @JsonProperty("ibu")
    public int getIbu() {
        return ibu;
    }

    @JsonProperty("ibu")
    public void setIbu(int ibu) {
        this.ibu = ibu;
    }

    @JsonProperty("target_fg")
    public int getTargetFg() {
        return targetFg;
    }

    @JsonProperty("target_fg")
    public void setTargetFg(int targetFg) {
        this.targetFg = targetFg;
    }

    @JsonProperty("target_og")
    public int getTargetOg() {
        return targetOg;
    }

    @JsonProperty("target_og")
    public void setTargetOg(int targetOg) {
        this.targetOg = targetOg;
    }

    @JsonProperty("ebc")
    public int getEbc() {
        return ebc;
    }

    @JsonProperty("ebc")
    public void setEbc(int ebc) {
        this.ebc = ebc;
    }

    @JsonProperty("srm")
    public int getSrm() {
        return srm;
    }

    @JsonProperty("srm")
    public void setSrm(int srm) {
        this.srm = srm;
    }

    @JsonProperty("ph")
    public float getPh() {
        return ph;
    }

    @JsonProperty("ph")
    public void setPh(float ph) {
        this.ph = ph;
    }

    @JsonProperty("attenuation_level")
    public int getAttenuationLevel() {
        return attenuationLevel;
    }

    @JsonProperty("attenuation_level")
    public void setAttenuationLevel(int attenuationLevel) {
        this.attenuationLevel = attenuationLevel;
    }

    @JsonProperty("volume")
    public Volume getVolume() {
        return volume;
    }

    @JsonProperty("volume")
    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    @JsonProperty("boil_volume")
    public BoilVolume getBoilVolume() {
        return boilVolume;
    }

    @JsonProperty("boil_volume")
    public void setBoilVolume(BoilVolume boilVolume) {
        this.boilVolume = boilVolume;
    }

    @JsonProperty("method")
    public Method getMethod() {
        return method;
    }

    @JsonProperty("method")
    public void setMethod(Method method) {
        this.method = method;
    }

    @JsonProperty("ingredients")
    public Ingredients getIngredients() {
        return ingredients;
    }

    @JsonProperty("ingredients")
    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    @JsonProperty("food_pairing")
    public List<String> getFoodPairing() {
        return foodPairing;
    }

    @JsonProperty("food_pairing")
    public void setFoodPairing(List<String> foodPairing) {
        this.foodPairing = foodPairing;
    }

    @JsonProperty("brewers_tips")
    public String getBrewersTips() {
        return brewersTips;
    }

    @JsonProperty("brewers_tips")
    public void setBrewersTips(String brewersTips) {
        this.brewersTips = brewersTips;
    }

    @JsonProperty("contributed_by")
    public String getContributedBy() {
        return contributedBy;
    }

    @JsonProperty("contributed_by")
    public void setContributedBy(String contributedBy) {
        this.contributedBy = contributedBy;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	public int getVersao() {
		return versao;
	}

	public void setVersao(int versao) {
		this.versao = versao;
	}

	public String getIpVersao() {
		return ipVersao;
	}

	public void setIpVersao(String ipVersao) {
		this.ipVersao = ipVersao;
	}
}