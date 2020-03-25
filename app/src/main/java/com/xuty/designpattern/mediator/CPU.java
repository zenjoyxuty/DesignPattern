package com.xuty.designpattern.mediator;

public class CPU extends Colleague {

    private String dataVideo,dataSound;
    public CPU(Mediator mediator) {
        super(mediator);
    }

    public String getDataVideo() {
        return dataVideo;
    }

    public void setDataVideo(String dataVideo) {
        this.dataVideo = dataVideo;
    }

    public String getDataSound() {
        return dataSound;
    }

    public void setDataSound(String dataSound) {
        this.dataSound = dataSound;
    }

    public void decode(String data){
        String[] tmp = data.split(",");

        dataVideo =tmp[0];
        dataSound = tmp[1];
        mediator.changed(this);
    }
}
