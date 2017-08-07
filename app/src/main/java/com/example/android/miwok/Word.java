package com.example.android.miwok;

/**
 * Created by PHYUTHWEHTETHTET on 7/24/2017.
 */

public class Word {
    private static int NO_IMAGE_PROVIDED = -1;
    private String miwokTranslation;
    private String defaultTranslation;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private int rawAudioId;


    public Word(String defaultTranslation, String miwokTranslation, int rawAudioId) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.rawAudioId = rawAudioId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int rawAudioId) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.imageResourceId = imageResourceId;
        this.rawAudioId = rawAudioId;
    }


    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean isValidImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getRawAudioId() {
        return rawAudioId;
    }
}
