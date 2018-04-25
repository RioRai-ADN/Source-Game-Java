/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Rio.Rai
 */
public class Categories {
    
    private int catID;
    private String catName;
    private String catDescription;
    private String catPicture;

    public Categories() {
    }

    public Categories(int catID, String catName, String catDescription, String catPicture) {
        this.catID = catID;
        this.catName = catName;
        this.catDescription = catDescription;
        this.catPicture = catPicture;
    }

    public int getCatID() {
        return catID;
    }

    public void setCatID(int catID) {
        this.catID = catID;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatDescription() {
        return catDescription;
    }

    public void setCatDescription(String catDescription) {
        this.catDescription = catDescription;
    }

    public String getCatPicture() {
        return catPicture;
    }

    public void setCatPicture(String catPicture) {
        this.catPicture = catPicture;
    }
    
    
}
