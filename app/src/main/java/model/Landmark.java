package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexandru on 1/24/2017.
 */

public class Landmark implements Serializable {

    private String name;
    private String address;
    private String open;
    private String admission;
    private String telephone;
    private String website;
    private String text;
    private List<Integer> imgList;
    private List<Integer> imgListSmall;


    public Landmark() {

    }

    public Landmark(String name, String address, String open, String admission, String telephone, String website, String text) {
        this.name = name;
        this.address = address;
        this.open = open;
        this.admission = admission;
        this.telephone = telephone;
        this.website = website;
        this.text = text;
    }

    /**
     * Creates a landmark object that has only name, address, admission, timetable and a description
     *
     * @param name      name of landmark
     * @param address   address of landmark
     * @param admission admission of landmark
     * @param open      timetable
     * @param text      description of landmark
     */

    public void makeBasicLandmark(String name, String address, String admission, String open, String text) {
        this.name = name;
        this.address = address;
        this.open = open;
        this.admission = admission;
        this.text = text;
        this.telephone = "";
        this.website = "";
        this.imgList = new ArrayList<>();
        this.imgListSmall = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getAdmission() {
        return admission;
    }

    public void setAdmission(String admission) {
        this.admission = admission;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public List<Integer> getImgList() {
        return imgList;
    }

    public void setImgList(List<Integer> imgList) {
        this.imgList = imgList;
    }

    public List<Integer> getImgListSmall() {
        return imgListSmall;
    }

    public void setImgListSmall(List<Integer> imgListSmall) {
        this.imgListSmall = imgListSmall;
    }
}
