/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edhkle.itl4j;

import com.dd.plist.NSObject;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 *
 * @author ehansen
 */
public class ItunesTracks extends HashMap<Integer, ItunesTrack> {
    final static Logger log = Logger.getLogger(ItunesTrack.class.getName());
    
    public ItunesTracks(Map<String,NSObject> nsObjMap) {
        for(Map.Entry<String,NSObject> entry : nsObjMap.entrySet()) {
            this.put(Integer.parseInt(entry.getKey()), new ItunesTrack(entry.getValue()));
        }
    }
}
