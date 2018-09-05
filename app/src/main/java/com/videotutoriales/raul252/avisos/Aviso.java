package com.videotutoriales.raul252.avisos;

public class Aviso {
    private int mId;

    public int getId() {
        return mId;
    }

    public void setId(int mID) {
        this.mId = mID;
    }

    public String getContent() {
        return mContent;
    }

    public void setContent(String mContent) {
        this.mContent = mContent;
    }

    private String mContent;

    public int getImportant() {
        return mImportant;
    }

    public void setImportant(int mImportant) {
        this.mImportant = mImportant;
    }

    private int mImportant;

    public  Aviso(int id, String content, int important){
        mId= id;
        mContent=content;
        mImportant=important;
    }
}
