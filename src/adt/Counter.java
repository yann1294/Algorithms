package adt;

public class Counter {
    private int counter = 0;
    private String str = null;

    public Counter(String str) {
        this.str = str;
    }

    public void increment(){
        counter++;
    }

    public int getStr() {
        return counter;
    }

    @Override
    public String toString() {
        return str + ": " + counter;
    }
}
