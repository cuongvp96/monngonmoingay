package com.vancuong.ngonngonmoingay.Model;

/**
 * Created by vancu on 20/12/2017.
 */

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ItemsFood implements Serializable
{

    @SerializedName("idfood")
    @Expose
    private int idfood;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("view")
    @Expose
    private int view;
    @SerializedName("making")
    @Expose
    private String making;
    @SerializedName("material")
    @Expose
    private String material;
    @SerializedName("iduser")
    @Expose
    private int iduser;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("tag")
    @Expose
    private String tag;
    private final static long serialVersionUID = -1896622969191885847L;

    /**
     * No args constructor for use in serialization
     *
     */
    public ItemsFood() {
    }

    /**
     *
     * @param iduser
     * @param created
     * @param tag
     * @param description
     * @param name
     * @param idfood
     * @param making
     * @param view
     * @param material
     */
    public ItemsFood(int idfood, String name, String description, int view, String making, String material,
                     int iduser, String created, String tag) {
        super();
        this.idfood = idfood;
        this.name = name;
        this.description = description;
        this.view = view;
        this.making = making;
        this.material = material;
        this.iduser = iduser;
        this.created = created;
        this.tag = tag;
    }

    public int getIdfood() {
        return idfood;
    }

    public void setIdfood(int idfood) {
        this.idfood = idfood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public String getMaking() {
        return making;
    }

    public void setMaking(String making) {
        this.making = making;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

}
