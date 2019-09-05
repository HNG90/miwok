package com.example.hiren.miwok;

/*
  The word class are the vocabulary words that the user wants to learn in both the default translation and miwok translations.
 */
public class Word {
    private static final int NO_IMAGE_PROVIDED = -1;
    // The default translation for the word
    private String mDefaultTranslation;
    // The miwok translation for the word
    private String mMiwokTranslation;
    //image resource id for the image corresponding to the word
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mSoundResourceId;

    /**
     * The new word object constructor, takes in 2 or 3 inputs depending on the category
     *
     * @param defaultTranslation this is the word already in the users native language
     * @param miwokTranslation   this is the miwok word that the user wants to learn
     * @param soundResourceId    this is the id of a sound file that will play when a listview item is clicked on
     */
    public Word(String defaultTranslation, String miwokTranslation, int soundResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSoundResourceId = soundResourceId;
    }

    /**
     * The new word object constructor, takes in 2 or 3 inputs depending on the category
     *
     * @param defaultTranslation this is the word already in the users native language
     * @param miwokTranslation   this is the miwok word that the user wants to learn
     * @param imageResourceId    this is the drawable image id for the images used in the app
     * @param soundResourceId    this is the id of a sound file that will play when a listview item is clicked on
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int soundResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mSoundResourceId = soundResourceId;
    }

    //Get the default translation
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    //Get the Miwok translation
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    //Get the image for the corresponding word
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /*
     *   Determines whether or not the current word has an image
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    //Get the sound id for the corresponding word

    public int getSoundResourceId() {
        return mSoundResourceId;
    }
}
