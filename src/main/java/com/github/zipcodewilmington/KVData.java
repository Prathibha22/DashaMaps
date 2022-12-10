package com.github.zipcodewilmington;

public class KVData<T extends Comparable<T>> implements Comparable<KVData<T>> {
    private String k;
    private Integer v;

    public KVData(String key, Integer value) {
        this.k = key;
        this.v = value;
    }

    public KVData(String key) {
        this.k = key;
        this.v = null;
    }

    public String getKey() {
        return k;
    }

    public Integer getValue() {
        return v;
    }

    public void setKey(String key) {
        this.k = key;
    }

    public void setValue(Integer value) {
        this.v = value;
    }

    @Override
    public int compareTo(KVData<T> o) {
        if (this.k.equals(o.getKey())) return 0;
        else return -1;
    }
}