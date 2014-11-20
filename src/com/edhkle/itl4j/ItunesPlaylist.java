/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edhkle.itl4j;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author ehansen
 */
public class ItunesPlaylist {
    
    ItunesLibrary parent;
    String name;
    boolean master;
    int playlistId;
    String playlistPersistentId;
    boolean visible;
    boolean allItems;
    SortedMap<Integer,ItunesTrack> playlistItems = new TreeMap<>();
    
    public ItunesPlaylist() {
        
    }

    public ItunesLibrary getItunesLibrary() {
        return parent;
    }
    
    public void setItunesLibrary(ItunesLibrary parent) {
        this.parent = parent;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMaster() {
        return master;
    }

    public void setMaster(boolean master) {
        this.master = master;
    }

    public int getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(int playlistId) {
        this.playlistId = playlistId;
    }

    public String getPlaylistPersistentId() {
        return playlistPersistentId;
    }

    public void setPlaylistPersistentId(String playlistPersistentId) {
        this.playlistPersistentId = playlistPersistentId;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isAllItems() {
        return allItems;
    }

    public void setAllItems(boolean allItems) {
        this.allItems = allItems;
    }

    public SortedMap<Integer, ItunesTrack> getPlaylistItems() {
        return playlistItems;
    }

    public void setPlaylistItems(SortedMap<Integer, ItunesTrack> playlistItems) {
        this.playlistItems = playlistItems;
    }
    
    public boolean addPlaylistItem(int id) {
        return true;
    }
}
