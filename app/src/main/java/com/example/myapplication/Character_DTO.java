package com.example.myapplication;

public class Character_DTO {
    private int charIndex;
    private String charName;
    private String charSex;
    private int charCm;
    private int charKg;
    private String charTag;
    private boolean like;
    private String createDate; //date?
    private int img;
    private String content;
    private int star;


    public Character_DTO(int charIndex, String charName, String charSex, int charCm, int charKg, String charTag, boolean like, String createDate, int img, String content, int star) {
        this.charIndex = charIndex;
        this.charName = charName;
        this.charSex = charSex;
        this.charCm = charCm;
        this.charKg = charKg;
        this.charTag = charTag;
        this.like = like;
        this.createDate = createDate;
        this.img = img;
        this.content = content;
        this.star = star;
    }

    public int getCharIndex() {
        return charIndex;
    }

    public void setCharIndex(int charIndex) {
        this.charIndex = charIndex;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getCharSex() {
        return charSex;
    }

    public void setCharSex(String charSex) {
        this.charSex = charSex;
    }

    public int getCharCm() {
        return charCm;
    }

    public void setCharCm(int charCm) {
        this.charCm = charCm;
    }

    public int getCharKg() {
        return charKg;
    }

    public void setCharKg(int charKg) {
        this.charKg = charKg;
    }

    public String getCharTag() {
        return charTag;
    }

    public void setCharTag(String charTag) {
        this.charTag = charTag;
    }

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }


}





