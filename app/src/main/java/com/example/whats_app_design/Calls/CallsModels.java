package com.example.whats_app_design.Calls;

public class CallsModels {
    private String name;
    private String date;
    private String image;

    public CallsModels(String name, String date, String image) {
        this.name = name;
        this.date = date;
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "StatusModel{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", image='" + image + '\'' +
                '}';
    }


}
