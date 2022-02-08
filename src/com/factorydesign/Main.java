package com.factorydesign;

public class Main {

    public static void main(String[] args) {
	    SocialMedia sm= new Facebook();
        sm.runningApp();


        FactoryClass fc= new FactoryClass();
        SocialMedia sm1=fc.getApp("IG");
        sm1.runningApp();
    }
}
