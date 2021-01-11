package com.company;


import com.company.Explosives.Explosive;
import com.company.Explosives.Rocket;
import com.company.Explosives.SatchelCharge;
import com.company.Explosives.TimedExplosiveCharge;

public class ExplosiveFactory implements AbstractFactory<Explosive> {
    @Override
    public Explosive create(String ExplosiveType) {
        if("Rocket".equalsIgnoreCase(ExplosiveType)){

            return new Rocket(100);
        }
        if("SatchelCharge".equalsIgnoreCase(ExplosiveType)){

            return new SatchelCharge(50);
        }
        if("TimedExplosiveCharge".equalsIgnoreCase(ExplosiveType)){

            return new TimedExplosiveCharge(200);
        }
        else{
            return null;
        }

    }
}
