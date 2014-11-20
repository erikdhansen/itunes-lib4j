/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edhkle.itl4j;

import java.util.Date;

/**
 *
 * @author ehansen
 */
public class ItunesLibraryHeader {    
    
    int             majorVersion;
    int             minorVersion;
    Date             libraryDate;
    String            appVersion;
    int                 features;
    boolean        contentRating;
    String           musicFolder;
    String       libPersistentId;
    
    public ItunesLibraryHeader() {
        
    }

    public int getMajorVersion() {
        return majorVersion;
    }

    public void setMajorVersion(int majorVersion) {
        this.majorVersion = majorVersion;
    }

    public int getMinorVersion() {
        return minorVersion;
    }

    public void setMinorVersion(int minorVersion) {
        this.minorVersion = minorVersion;
    }

    public Date getLibraryDate() {
        return libraryDate;
    }

    public void setLibraryDate(Date libraryDate) {
        this.libraryDate = libraryDate;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public int getFeatures() {
        return features;
    }

    public void setFeatures(int features) {
        this.features = features;
    }

    public boolean isContentRating() {
        return contentRating;
    }

    public void setContentRating(boolean contentRating) {
        this.contentRating = contentRating;
    }

    public String getMusicFolder() {
        return musicFolder;
    }

    public void setMusicFolder(String musicFolder) {
        this.musicFolder = musicFolder;
    }

    public String getLibPersistentId() {
        return libPersistentId;
    }

    public void setLibPersistentId(String libPersistentId) {
        this.libPersistentId = libPersistentId;
    }
    
    
}
