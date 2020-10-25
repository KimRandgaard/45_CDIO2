package Monopoly;

public class Players {

    private String navn;
    private Dice6 d1;
    private Dice6 d2;

    Players(String navn)
    {
        this.navn = navn;
        d1 = new Dice6();
        d2 = new Dice6();
    }


    void roll()
    {

        d1.roll();
        d1.getFaceValue(); //

        d2.roll();
        d2.getFaceValue(); //
    }


    String getNavn()
    {
        return navn;
    }

    int getFaceValue1()
    {
        return d1.getFaceValue();
    }

    int getFaceValue2(){
        return d2.getFaceValue();
    }



}
