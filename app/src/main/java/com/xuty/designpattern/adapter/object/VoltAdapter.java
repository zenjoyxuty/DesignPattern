package com.xuty.designpattern.adapter.object;

import com.xuty.designpattern.adapter.FiveVolt;
import com.xuty.designpattern.adapter.Volt220;

public class VoltAdapter  implements FiveVolt {

    Volt220 volt220;

    public VoltAdapter(Volt220 volt220){
        this.volt220 = volt220;
    }

    public int getVolt220(){
        return volt220.getVolt220();
    }
    @Override
    public int getVol5() {
        return 5;
    }
}
