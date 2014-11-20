/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edhkle.itl4j;

/**
 *
 * @author ehansen
 */
public class ItunesPlaylistItem {
    int trackId;
    ItunesTrack track;
    
    public ItunesPlaylistItem() {
        
    }
    
    public ItunesPlaylistItem(int id) {
        this.trackId = id;
    }
    
    public ItunesTrack getTrack() {
        return track;
    }
    
    public void setTrack(ItunesTrack track) {
        this.track = track;
    }
}
