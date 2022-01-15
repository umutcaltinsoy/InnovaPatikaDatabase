package com.innova.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection extends DatabaseInformation{
    // Db Connection
    private Connection connection;

    // Db connection information
    private String url = this.getUrl();
    private String userName = this.getUserName();
    private String userPassword = this.getUserPassword();

    // Singleton Design Pattern
    // 1) private instance oluştur
    // 2) private constructor oluştur
    // 3) dışarı açılacak yapıyı oluşturacağız yani getInstance() methodu
    private DatabaseConnection instance;

    // private const.
    private DatabaseConnection() {
        try {
            Class.forName(this.getForNameData());
            System.out.println("Driver Success !!!");
            this.connection = DriverManager.getConnection(url, userName, userPassword);
            System.out.println("Connection Success...");

        }catch (Exception e){
            System.out.println("Error Connection failed !!!");
            e.printStackTrace();
        }
    }

//    amaç: eğer bağlantı varsa onu kullanmak
//    eğer bağlantı kapatılmış veya bağlantı yoksa instance yapmak
    public DatabaseConnection getInstance() {
        try {
            if (instance == null) // bağlantı yoksa
                this.instance = new DatabaseConnection();
            else if (instance.connection.isClosed()) // bağlantı kapatılmışsa
                this.instance = new DatabaseConnection();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return instance; // varsa bağlantı onu kullan
    }

    // test etmek istiyorum çalışıyor mu çalışmıyor mu ?
    public static void main(String[] args) {
        DatabaseConnection databaseConnection = new DatabaseConnection();
    }

}
