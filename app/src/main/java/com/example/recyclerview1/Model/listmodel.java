package com.example.recyclerview1.Model;

public class listmodel {
    String Company;
    int image,cost;

    public listmodel(String company, int image, int cost) {
        Company = company;
        this.image = image;
        this.cost = cost;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
