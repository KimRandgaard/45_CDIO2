package Monopoly;

public class Balance {


    public int CurrentValue;

    public Balance() {
        CurrentValue = 1000;
    }

    void AddToCurrentValue(int Money){
        CurrentValue =+ Money;

    }


    public int getCurrentValue() {
        return CurrentValue;
    }

    public void setCurrentValue(int currentValue) {
        CurrentValue = currentValue;
    }

    // man starter på 1000
    // +/- afhængig af felt

}
