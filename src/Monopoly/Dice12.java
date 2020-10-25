package Monopoly;

public class Dice12 {

    private final int MAX = 12;
    private int faceValue;

    public Dice12()
    {

    }

    public void roll()
    {
        faceValue = (int)(Math.random()* MAX +1); // Ruller et tilfældigt tal mellem 1 og 12
    }

    public int getFaceValue()
    {
        return faceValue;
    }


}
