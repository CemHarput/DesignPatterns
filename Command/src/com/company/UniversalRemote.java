package com.company;

public class UniversalRemote {
    public static HomeElectronics getActiveDevice(){
        LightSystemReceiver ls=new LightSystemReceiver();
        return ls;
    }

}
