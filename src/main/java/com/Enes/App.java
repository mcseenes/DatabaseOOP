package com.Enes;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Database mongoDB = new MongoDB();
        Database postareSql = new PostareSql();
        DatabaseSec("MONGODB");
        DatabaseSecKullanici();
    }
    public static void DatabaseSec(String database) {//PARAMETRELI
        Manager manager = new Manager();
        if (database.equalsIgnoreCase("MongoDB")) {
            manager.MongoDBCalistir();
        } else if (database.equalsIgnoreCase("PostareSql")) {
            manager.postareSqlCalistir();
        } else
            System.err.println("LUTFEN DOGRU VERITABANI GIRINIZ");
    }

    public static void DatabaseSecKullanici() {//PARAMETRESIZ
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
        LUTFEN ISLEM YAPMAK ISTEDIGINIZ VERITABANINI GIRINIZ
        MongoDB ICIN:MongoDB
        PostareSql ICIN:PostareSql
        """);
        String database = scanner.nextLine();
        switch (database) {
            case "MongoDB":
                manager.MongoDBCalistir();break;
            case "PostareSql":
                manager.postareSqlCalistir();break;
            default:
                System.err.println("LUTFEN DOGRU VERITABANI GIRINIZ");break;
        }
    }
}






