package com.vancuong.ngonngonmoingay.Model;

/**
 * Created by vancu on 20/12/2017.
 */

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ItemsComment implements Serializable
{

    @SerializedName("idcomment")
    @Expose
    private Integer idcomment;
    @SerializedName("iduser")
    @Expose
    private Integer iduser;
    @SerializedName("idpractice")
    @Expose
    private Integer idpractice;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("text")
    @Expose
    private String text;
    private final static long serialVersionUID = -263185826819362186L;

    /**
     * No args constructor for use in serialization
     *
     */
    public ItemsComment() {
    }

    /**
     *
     * @param iduser
     * @param idcomment
     * @param text
     * @param created
     * @param idpractice
     */
    public ItemsComment(Integer idcomment, Integer iduser, Integer idpractice, String created, String text) {
        super();
        this.idcomment = idcomment;
        this.iduser = iduser;
        this.idpractice = idpractice;
        this.created = created;
        this.text = text;
    }

    public Integer getIdcomment() {
        return idcomment;
    }

    public void setIdcomment(Integer idcomment) {
        this.idcomment = idcomment;
    }

    public Integer getIduser() {
        return iduser;
    }

    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }

    public Integer getIdpractice() {
        return idpractice;
    }

    public void setIdpractice(Integer idpractice) {
        this.idpractice = idpractice;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}