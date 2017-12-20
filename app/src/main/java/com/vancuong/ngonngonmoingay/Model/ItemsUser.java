package com.vancuong.ngonngonmoingay.Model;

/**
 * Created by vancu on 20/12/2017.
 */

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ItemsUser implements Serializable
{

    @SerializedName("iduser")
    @Expose
    private int iduser;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("fb_id")
    @Expose
    private String fbId;
    @SerializedName("google_id")
    @Expose
    private String googleId;
    @SerializedName("role")
    @Expose
    private int role;
    @SerializedName("block")
    @Expose
    private int block;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("avatar")
    @Expose
    private String avatar;
    @SerializedName("food_number")
    @Expose
    private int foodNumber;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("food_practice")
    @Expose
    private int foodPractice;
    @SerializedName("description")
    @Expose
    private String description;
    private final static long serialVersionUID = -5368353622911611457L;

    /**
     * No args constructor for use in serialization
     *
     */
    public ItemsUser() {
    }

    /**
     *
     * @param fbId
     * @param iduser
     * @param username
     * @param location
     * @param description
     * @param name
     * @param block
     * @param role
     * @param avatar
     * @param password
     * @param foodPractice
     * @param foodNumber
     * @param googleId
     */
    public ItemsUser(int iduser, String name, String fbId, String googleId, int role,
                     int block, String username, String password, String avatar, int foodNumber,
                     String location, int foodPractice, String description) {
        super();
        this.iduser = iduser;
        this.name = name;
        this.fbId = fbId;
        this.googleId = googleId;
        this.role = role;
        this.block = block;
        this.username = username;
        this.password = password;
        this.avatar = avatar;
        this.foodNumber = foodNumber;
        this.location = location;
        this.foodPractice = foodPractice;
        this.description = description;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFbId() {
        return fbId;
    }

    public void setFbId(String fbId) {
        this.fbId = fbId;
    }

    public String getGoogleId() {
        return googleId;
    }

    public void setGoogleId(String googleId) {
        this.googleId = googleId;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getFoodNumber() {
        return foodNumber;
    }

    public void setFoodNumber(int foodNumber) {
        this.foodNumber = foodNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getFoodPractice() {
        return foodPractice;
    }

    public void setFoodPractice(int foodPractice) {
        this.foodPractice = foodPractice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}