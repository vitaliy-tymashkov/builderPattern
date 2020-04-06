package com.epam.model.subclasses;

public class SubData {
    private String data;
    private String hash;

//    public String getData() {
//        return data;
//    }

    public void setData(String data) {
        this.data = data;
    }

//    public String getHash() {
//        return hash;
//    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    @Override
    public String toString() {
        return "SubData{" +
                "data='" + data + '\'' +
                ", hash='" + hash + '\'' +
                '}';
    }

    public String toXml() {
        return "<SubData>" + "\n" +
                ((data != null) ? ("<data>" + data + "</data>" + "\n") : "") +
                ((hash != null) ? ("<hash>" + hash + "</hash>" + "\n") : "") +
                "</SubData>";
    }
}
