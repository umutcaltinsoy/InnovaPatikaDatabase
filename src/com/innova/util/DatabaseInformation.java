package com.innova.util;

abstract public class DatabaseInformation {
//object variables
    private String url;
    private String userName;
    private String userPassword;
    private String forNameData;


    public DatabaseInformation() {

//        I got an error about SSL, so I changed the url section instead of using this
//        this.url = "jdbc:mysql://localhost:3306/innova_patika_project_1";
        this.url = "jdbc:mysql://localhost:3306/innova_patika_project_1?autoReconnect=true&useSSL=false";
        this.userName = "root";
        this.userPassword = "root";
        this.forNameData = "com.mysql.jdbc.Driver";


    }

    public DatabaseInformation(String url, String userName, String userPassword, String forNameData) {
        this.url = url;
        this.userName = userName;
        this.userPassword = userPassword;
        this.forNameData = forNameData;
    }

    @Override
    public String toString() {
        return "DatabaseInformation{" +
                "url='" + url + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", forNameData='" + forNameData + '\'' +
                '}';
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getForNameData() {
        return forNameData;
    }

    public void setForNameData(String forNameData) {
        this.forNameData = forNameData;
    }
}
