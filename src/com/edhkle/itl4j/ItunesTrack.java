/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edhkle.itl4j;

import com.dd.plist.NSDate;
import com.dd.plist.NSDictionary;
import com.dd.plist.NSNumber;
import com.dd.plist.NSObject;
import com.dd.plist.NSString;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author ehansen
 */
public class ItunesTrack {
    int trackId;
    String name;
    String artist;
    String album;
    String genre;
    String kind;
    int    size;
    int    totalTime;
    int    trackNumber;
    int    year;
    Date   modifiedDate;
    Date   addedDate;
    int    bitRate;
    int    sampleRate;
    String persistentId;
    String trackType;
    String location;
    int    fileFolderCount;
    int    libraryFolderCount;
    
    public ItunesTrack(NSObject object) {
        try {
        Map<String,NSObject> oMap = ((NSDictionary)object);
        trackId = ItunesXMLLibraryParser.getAsInt(oMap.get("Track ID"));
        name = ItunesXMLLibraryParser.getAsString(oMap.get("Name"));
        artist = ItunesXMLLibraryParser.getAsString(oMap.get("Artist"));
        album = ItunesXMLLibraryParser.getAsString(oMap.get("Album"));
        genre = ItunesXMLLibraryParser.getAsString(oMap.get("Genre"));
        kind = ItunesXMLLibraryParser.getAsString(oMap.get("Kind"));
        size = ItunesXMLLibraryParser.getAsInt(oMap.get("Size"));
        totalTime = ItunesXMLLibraryParser.getAsInt(oMap.get("Total Time"));
        trackNumber = ItunesXMLLibraryParser.getAsInt(oMap.get("Track Number"));
        year = ItunesXMLLibraryParser.getAsInt(oMap.get("Year"));
        modifiedDate = ItunesXMLLibraryParser.getAsDate(oMap.get("Date Modified"));
        addedDate = ItunesXMLLibraryParser.getAsDate(oMap.get("Date Added"));
        bitRate = ItunesXMLLibraryParser.getAsInt(oMap.get("Bit Rate"));
        sampleRate = ItunesXMLLibraryParser.getAsInt(oMap.get("Sample Rate"));
        persistentId = ItunesXMLLibraryParser.getAsString(oMap.get("Persistent ID"));
        trackType = ItunesXMLLibraryParser.getAsString(oMap.get("Track Type"));
        location = ItunesXMLLibraryParser.getAsString(oMap.get("Location"));
        fileFolderCount = ItunesXMLLibraryParser.getAsInt(oMap.get("File Folder Count"));
        libraryFolderCount = ItunesXMLLibraryParser.getAsInt(oMap.get("Library Folder Count"));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(object.toXMLPropertyList());
        }
    }


    
    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public int getBitRate() {
        return bitRate;
    }

    public void setBitRate(int bitRate) {
        this.bitRate = bitRate;
    }

    public int getSampleRate() {
        return sampleRate;
    }

    public void setSampleRate(int sampleRate) {
        this.sampleRate = sampleRate;
    }

    public String getPersistentId() {
        return persistentId;
    }

    public void setPersistentId(String persistentId) {
        this.persistentId = persistentId;
    }

    public String getTrackType() {
        return trackType;
    }

    public void setTrackType(String trackType) {
        this.trackType = trackType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getFileFolderCount() {
        return fileFolderCount;
    }

    public void setFileFolderCount(int fileFolderCount) {
        this.fileFolderCount = fileFolderCount;
    }

    public int getLibraryFolderCount() {
        return libraryFolderCount;
    }

    public void setLibraryFolderCount(int libraryFolderCount) {
        this.libraryFolderCount = libraryFolderCount;
    }
    
}
