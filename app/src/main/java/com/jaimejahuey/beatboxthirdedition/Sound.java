package com.jaimejahuey.beatboxthirdedition;

/**
 * Created by jaimejahuey on 1/17/18.
 */

//Model class used to create the sounds in the BeatBox model class
public class Sound {
    private String mAssetPath;
    private String mName;

    public Sound(String assetPath){
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String filename = components[components.length-1];
        mName = filename.replace(".wav", "");
    }

    public String getAssetPath(){
        return mAssetPath;
    }

    public String getName(){
        return mName;
    }

}
