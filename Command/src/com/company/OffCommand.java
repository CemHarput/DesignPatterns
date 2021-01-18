package com.company;

import java.util.List;

public class OffCommand implements Command {
    List<HomeElectronics> homeElectronicsList;

    public OffCommand(List<HomeElectronics> homeElectronicsList) {
        this.homeElectronicsList = homeElectronicsList;
    }

    @Override
    public void Execute() {
       for(HomeElectronics homeElec:homeElectronicsList) {
           homeElec.off();

       }

    }
}
