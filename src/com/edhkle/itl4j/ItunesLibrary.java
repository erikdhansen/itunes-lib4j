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
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 *
 * @author ehansen
 */
public class ItunesLibrary {
    final static Logger log = Logger.getLogger(ItunesLibrary.class.getName());
    
    ItunesLibraryHeader header = null;
    
    NSDictionary          dict;
    ItunesTracks          tracks;
    List<ItunesPlaylist>  playlists = new LinkedList<>();
    
    public ItunesLibrary(NSDictionary dict) throws ItunesXMLLibraryParserException {
        this.dict = dict;
        header = parseHeader();        
        Map<String,NSObject> dMap = dict.getHashMap();
        Map<String,NSObject> trackMap = ((NSDictionary)dMap.get("Tracks")).getHashMap();
        setTracks(new ItunesTracks(trackMap));
    }

    private ItunesLibraryHeader parseHeader() throws ItunesXMLLibraryParserException {
        ItunesLibraryHeader header = new ItunesLibraryHeader();
        try {
            header.setMajorVersion(((NSNumber)dict.objectForKey("Major Version")).intValue());
            header.setMinorVersion(((NSNumber)dict.objectForKey("Minor Version")).intValue());
            header.setLibraryDate(((NSDate)dict.objectForKey("Date")).getDate());
            header.setAppVersion(((NSString)dict.objectForKey("Application Version")).getContent());
            header.setFeatures(((NSNumber)dict.objectForKey("Features")).intValue());
            header.setContentRating(((NSNumber)dict.objectForKey("Show Content Ratings")).boolValue());
            header.setMusicFolder(((NSString)dict.objectForKey("Music Folder")).getContent());
            header.setLibPersistentId(((NSString)dict.objectForKey("Library Persistent ID")).getContent());
        } catch (Exception e) {
            throw new ItunesXMLLibraryParserException("Failed to parse library header!", e);
        }
        log.info("Parsed iTunes Library Header: " + header.toString());
        return header;
    }

    public ItunesTracks getTracks() {
        return tracks;
    }

    public void setTracks(ItunesTracks tracks) {
        this.tracks = tracks;
    }
    
    public void addItunesPlaylist(ItunesPlaylist playlist) {
        playlist.setItunesLibrary(this);
        playlists.add(playlist);
    }
    
    public void removeItunesPlaylist(ItunesPlaylist playlist) {
        playlists.remove(playlist);
        playlist.setItunesLibrary(null);
    }
}
