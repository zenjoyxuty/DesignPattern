package com.xuty.designpattern.adapter.classadapter;

import com.xuty.designpattern.adapter.FiveVolt;
import com.xuty.designpattern.adapter.Volt220;

public class VolAdapter extends Volt220 implements FiveVolt {
    @Override
    public int getVol5() {
        return 5;
    }
}
