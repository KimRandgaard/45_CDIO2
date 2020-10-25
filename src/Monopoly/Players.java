package Monopoly;

public class Players {

    private String navn;
    private Monopoly.Dice6 d1;
    private Monopoly.Dice6 d2;

    Players(String navn)
    {
        this.navn = navn;
        d1 = new Monopoly.Dice6();
        d2 = new Monopoly.Dice6();
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
