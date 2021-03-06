package com.jaimejahuey.beatboxthirdedition;

/**
 * Created by jaimejahuey on 1/17/18.
 */

public class SoundViewModel {
    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox beatBox){
        mBeatBox = beatBox;
    }

    public Sound getSound(){
        return mSound;
    }

    public void setSound(Sound sound){
        mSound = sound;
    }

    public String getTitle(){
        return mSound.getName();
    }

}
