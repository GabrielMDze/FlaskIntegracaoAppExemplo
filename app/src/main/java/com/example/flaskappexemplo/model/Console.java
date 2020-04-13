package com.example.flaskappexemplo.model;

public class Console {
    private long id;
    private String name;
    private int year;
    private double price;
    private String ativo;
    private long qtnJogos;

    public Console() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAtivo() { return ativo;  }

    public void setAtivo(String ativo) { this.ativo = ativo; }

    public long getQtnJogos() { return qtnJogos; }

    public void setQtnJogos(long qtnJogos) { this.qtnJogos = qtnJogos; }

    @Override
    public String toString() {
        return name;
    }
}
