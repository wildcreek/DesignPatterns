package com.wildcreek.designpatterns.adapter;

/**
 * Created by Administrator on 2017/11/22.
 */

public class ACPowerAdapter extends BoxPowerDevice {
    ACPowerSource acPowerSource ;
    public ACPowerAdapter(ACPowerSource acPowerSource){
        this.acPowerSource = acPowerSource;
    }

    public void providePower(){
        acPowerSource.provideACPower();
        super.providePower();
    }
}
