package com.ayproject.submission;

import android.os.Parcel;
import android.os.Parcelable;

public class Handphone implements Parcelable {
    private String name;
    private String detail;
    private int photo;
    private String chipset;
    private String memori;
    public String kamera;
    public String batre;

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String harga;

    public Handphone() {

    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getMemori() {
        return memori;
    }

    public void setMemori(String memori) {
        this.memori = memori;
    }

    public String getKamera() {
        return kamera;
    }

    public void setKamera(String kamera) {
        this.kamera = kamera;
    }

    public String getBatre() {
        return batre;
    }

    public void setBatre(String batre) {
        this.batre = batre;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(detail);
        parcel.writeInt(photo);
        parcel.writeString(chipset);
        parcel.writeString(memori);
        parcel.writeString(kamera);
        parcel.writeString(batre);
        parcel.writeString(harga);

    }

    protected Handphone(Parcel in){
        name = in.readString();
        detail = in.readString();
        photo = in.readInt();
        chipset = in.readString();
        memori = in.readString();
        kamera = in.readString();
        batre = in.readString();
        harga = in.readString();
    }

    public static Creator<Handphone> CREATOR = new Creator<Handphone>() {
        @Override
        public Handphone createFromParcel(Parcel in) {
            return new Handphone(in);
        }

        @Override
        public Handphone[] newArray(int size) {
            return new Handphone[size];
        }
    };
}
