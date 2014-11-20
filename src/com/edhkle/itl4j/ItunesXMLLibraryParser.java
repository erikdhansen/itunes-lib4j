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
import com.dd.plist.PropertyListParser;
import java.io.File;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ehansen
 */
public class ItunesXMLLibraryParser {

    final static Logger log = Logger.getLogger(ItunesXMLLibraryParser.class.getName());
    private final static ItunesXMLLibraryParser _me = new ItunesXMLLibraryParser();
    
    private ItunesXMLLibraryParser() {
    }

    public static ItunesLibrary parse(File f) throws Exception {
        NSDictionary rootDict;
        if ((f == null) || (!f.isFile())) {
            throw new ItunesXMLLibraryParserException("Cannot parse iTunes XML Library...never received a proper file to read");
        }

        File xmlLibraryFile = f;
        ItunesLibrary itl = null;

        try {
            rootDict = (NSDictionary) PropertyListParser.parse(xmlLibraryFile);
            dumpKeys(rootDict);            
        } catch (Exception e) {
            throw new ItunesXMLLibraryParserException("Failed to parse property list into dictionary!", e);
        }

        if (rootDict == null) {
            log.log(Level.WARNING, "Could not find rootDict in file: {0}", xmlLibraryFile.getAbsolutePath());
        } else {

            itl = new ItunesLibrary(rootDict);
        }
        return itl;
    }

    public static String getAsString(NSObject object) {
        if (object == null) {
            return "";
        }
        return ((NSString) object).getContent();
    }

    public static int getAsInt(NSObject object) {
        if (object == null) {            
            return -1;
        }
        return ((NSNumber) object).intValue();
    }

    public static Date getAsDate(NSObject object) {
        if (object == null) {
            return null;
        }
        return ((NSDate) object).getDate();
    }

    public static void dumpKeys(NSDictionary dict) {
        StringBuilder msg = new StringBuilder();
        msg.append("*********** Dictionary Keys [START] *************\n");
        for(String key : dict.keySet()) {
            msg.append(key).append("\n");
        }
        msg.append("*********** Dictionary Keys [END] *************\n");        
        log.log(Level.INFO, msg.toString());
    }
}
