package com.vancuong.ngonngonmoingay.Model;

/**
 * Created by vancu on 20/12/2017.
 */

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ItemsLikeFood implements Serializable
{

    @SerializedName("idlike")
    @Expose
    private Integer idlike;
    @SerializedName("iduser")
    @Expose
    private Integer iduser;
    @SerializedName("idfood")
    @Expose
    private Integer idfood;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("status_like")
    @Expose
    private Integer statusLike;
    private final static long serialVersionUID = 8279250549867106678L;

    /**
     * No args constructor for use in serialization
     *
     */
    public ItemsLikeFood() {
    }

    /**
     *
     * @param iduser
     * @param statusLike
     * @param created
     * @param idfood
     * @param idlike
     */
    public ItemsLikeFood(Integer idlike, Integer iduser, Integer idfood, String created, Integer statusLike) {
        super();
        this.idlike = idlike;
        this.iduser = iduser;
        this.idfood = idfood;
        this.created = created;
        this.statusLike = statusLike;
    }

    public Integer getIdlike() {
        return idlike;
    }

    public void setIdlike(Integer idlike) {
        this.idlike = idlike;
    }

    public Integer getIduser() {
        return iduser;
    }

    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }

    public Integer getIdfood() {
        return idfood;
    }

    public void setIdfood(Integer idfood) {
        this.idfood = idfood;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Integer getStatusLike() {
        return statusLike;
    }

    public void setStatusLike(Integer statusLike) {
        this.statusLike = statusLike;
    }

}