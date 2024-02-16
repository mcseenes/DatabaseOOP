package com.Enes;

public class MongoDB extends Database{
    public int connectionCount;
    @Override
    public void veriEkle() {
        System.out.println(getClass().getSimpleName()+" e veri eklendi");
    }

    @Override
    public void veriSil() {
        System.out.println(getClass().getSimpleName()+" den veri silindi");
    }

    @Override
    public void veriGuncelle() {

        System.out.println(getClass().getSimpleName()+" de veri guncellendi");
    }

    @Override
    public void verileriGetir() {

        System.out.println(getClass().getSimpleName()+" ye veri getirildi");
    }
    public void baglantiArttir(){
        connectionCount++;
    }
}
