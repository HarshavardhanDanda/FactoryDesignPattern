package com.factorydesign;

public class FactoryClass {
    public SocialMedia getApp(String name){
        if(name.equals("FB")){
            return new Facebook();
        }
        else if(name.equals("IG")){
            return new Instagram();
        }
        else{
            return new WhatsApp();
        }
    }
}
