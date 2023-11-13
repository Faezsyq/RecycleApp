package com.example.recyclerviewapp;

import java.io.Serializable;

public class ContactModel implements Serializable {
    public String color;
    public String nama;
    public String nohp;
    public String status;

    public ContactModel(String color, String nama, String nohp, String status) {
        this.color = color;
        this.nama = nama;
        this.nohp = nohp;
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
