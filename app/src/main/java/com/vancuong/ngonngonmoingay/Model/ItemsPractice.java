package com.vancuong.ngonngonmoingay.Model;

/**
 * Created by vancu on 20/12/2017.
 */

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ItemsPractice implements Serializable
{

    @SerializedName("idpractice")
    @Expose
    private int idpractice;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("iduser")
    @Expose
    private int iduser;
    @SerializedName("idfood")
    @Expose
    private int idfood;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("created")
    @Expose
    private String created;
    private final static long serialVersionUID = 4520329375150063871L;

    /**
     * No args constructor for use in serialization
     *
     */
    public ItemsPractice() {
    }

    /**
     *
     * @param iduser
     * @param title
     * @param created
     * @param description
     * @param idpractice
     * @param idfood
     * @param image
     */
    public ItemsPractice(int idpractice, String description, int iduser, int idfood, String image, String title, String created) {
        super();
        this.idpractice = idpractice;
        this.description = description;
        this.iduser = iduser;
        this.idfood = idfood;
        this.image = image;
        this.title = title;
        this.created = created;
    }

    public int getIdpractice() {
        return idpractice;
    }

    public void setIdpractice(int idpractice) {
        this.idpractice = idpractice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public int getIdfood() {
        return idfood;
    }

    public void setIdfood(int idfood) {
        this.idfood = idfood;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

}


