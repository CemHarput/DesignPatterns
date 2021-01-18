package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    HomeElectronics ce=UniversalRemote.getActiveDevice();
    OnCommand onCommand=new OnCommand(ce);
    ButtonInvoker onButton = new ButtonInvoker(onCommand);
    onButton.click();

    LightSystemReceiver ls=new LightSystemReceiver();
    AirconditionReceiver ac=new AirconditionReceiver();
    List<HomeElectronics> all=new ArrayList<HomeElectronics>();
    all.add(ls);
    all.add(ac);
    OffCommand offAll=new OffCommand(all);
    ButtonInvoker offAllButton = new ButtonInvoker(offAll);
    offAllButton.click();
    }
}
