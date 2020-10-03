package com.example.intentexplicitparcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class Biodata implements Parcelable {

    private  String nama;
    private  String umur;

    public Biodata(String nama, String umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public  String getNama() { return nama; }
    public  String getUmur() { return umur; }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nama);
        dest.writeString(umur);
    }

    public Biodata(Parcel parcel) {
        nama = parcel.readString();
        umur = parcel.readString();
    }

    public static final Parcelable.Creator<Biodata> CREATOR = new Parcelable.Creator<Biodata>() {

        @Override
        public Biodata createFromParcel(Parcel parcel) {
            return new Biodata(parcel);
        }

        @Override
        public Biodata[] newArray(int size) {
            return new Biodata[0];
        }
    };

    public int describeContents() {
        return hashCode();
    }
}