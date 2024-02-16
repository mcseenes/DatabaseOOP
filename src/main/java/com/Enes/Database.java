package com.Enes;

public abstract class Database {
    private int id;
    public String userName;
    public String password;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public abstract void veriEkle();
    public abstract void veriSil();
    public abstract void veriGuncelle();
    public abstract void verileriGetir();

}
