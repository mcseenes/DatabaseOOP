package com.Enes;

import java.util.Scanner;

public class Manager {
    MongoDB mongoDB = new MongoDB();
    PostareSql postareSql = new PostareSql();
    private int connectionCount;

    public int getConnectionCount() {

        return connectionCount;
    }

    public void setConnectionCount(int connectionCount) {

        this.connectionCount = connectionCount;
    }

    int secim;
    int database;

    public void MongoDBCalistir() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                **************
                LUTFEN SECIM YAPINIZ
                1-MongoDB ye VERI EKLE
                2-MongoDB den VERI SIL
                3-MongoDBye VERI GETIR 
                4-MongoDB de VERI GUNCELLE
                 0-CIKIS
                ****************************
                """);
        secim = scanner.nextInt();


        switch (secim) {
            case 0:
                System.out.println("PROGRAM SONLANDIRILDI");
                break;
            case 1:
                mongoDB.veriEkle();
                break;

            case 2:
                mongoDB.veriSil();
                break;

            case 3:
                mongoDB.verileriGetir();
                break;

            case 4:
                mongoDB.veriGuncelle();
                break;

            default:
                System.err.println("LUTFEN DOGRU DEGER  GIRINIZ");
                break;


        }
    }

        public void postareSqlCalistir () {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("""
                    **************
                    LUTFEN SECIM YAPINIZ
                    1-PostareSql e VERI EKLE
                    2-PostareSql den VERI SIL
                    3-PostareSql den VERI GETIR 
                    4-PostareSql de VERI GUNCELLE
                    0-CIKIS
                    ****************************
                    """);
            secim = scanner1.nextInt();


            switch (secim) {
                case 0:
                    System.out.println("PROGRAM SONLANDIRILDI");
                    break;
                case 1:
                    postareSql.veriEkle();
                    break;

                case 2:
                    postareSql.veriSil();
                    break;

                case 3:
                    postareSql.verileriGetir();
                    break;


                case 4:
                    postareSql.veriGuncelle();
                    break;

                default:
                    System.err.println("LUTFEN DOGRU DEGER  GIRINIZ");
                    break;


            }


        }

    }


