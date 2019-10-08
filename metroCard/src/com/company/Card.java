package com.company;

public class Card {
//    int stations[]={1,2,3,4,5,6,7,8,9,10};
     int stationNumber;

    private static int cardBalance=250;
    private final int MIN_VALUE = 5;
    int stationsTravelled=0,stationNumber1=0,stationNumber2=0;
    int cardNumber=0;
    int fare=0;

    public void details(int cardNumber,int entryStationNumber,int exitStationNumber) {
        this.cardNumber = cardNumber;
        this.stationNumber1 = entryStationNumber;
        this.stationNumber2 = exitStationNumber;
        entry(cardNumber,stationNumber1,stationNumber2);
    }

    public void entry(int cardNumber,int stationNumber1,int stationNumber2){
        System.out.println("Card Number : "+cardNumber);
        System.out.println(" Entry Station Number : "+stationNumber1);
        exit(stationNumber2);
    }

    public void exit(int stationNumber2){
        System.out.println("Exit Station Number : "+stationNumber2);

        stationsTravelled=(stationNumber2-stationNumber1);
        System.out.println("Stations Travelled"+stationsTravelled);

        fare=stationsTravelled*10;
        System.out.println("Ride Fare : "+fare);

        cardBalance=cardBalance-fare;
        if (cardBalance<MIN_VALUE) {
            System.out.println("Low Balance : "+cardBalance);
        }
        else {
            System.out.println("Card Balance : " + cardBalance);
        }


    }


}
