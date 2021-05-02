package com.company.Tirgul9;

public class TripleCalculator implements ITripleCalculator{

    private int boomCount;
    @Override
    public int calc(int number) {
        if(number == 0) {
            return 300;
        }
        else if (number ==7) {
            return 7;
        }
        else if (number %7 == 0) {
            return 7;
        }
        else {
            return number*3;
        }


    }

}
