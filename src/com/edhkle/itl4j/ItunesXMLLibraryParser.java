/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edhkle.itl4j;

import com.dd.plist.NSDictionary;
import com.dd.plist.PropertyListParser;
import java.io.File;
import java.util.logging.Logger;

/**
 *
 * @author ehansen
 */
public class ItunesXMLLibraryParser {

    final static Logger log = Logger.getLogger(ItunesXMLLibraryParser.class.getName());
    //private static ItunesXMLLibraryParser _instance = new ItunesXMLLibraryParser();
    PropertyListParser parser;
    NSDictionary rootDict;

    boolean parse = false;

    public ItunesXMLLibraryParser() {
    }

    public ItunesLibrary parse(File f) throws Exception {
        if ((f == null) || (!f.isFile())) {
            throw new ItunesXMLLibraryParserException("Cannot parse iTunes XML Library...never received a proper file to read");
        }

        File xmlLibraryFile = f;
        ItunesLibrary itl = null;

        try {
            rootDict = (NSDictionary) PropertyListParser.parse(xmlLibraryFile);
        } catch (Exception e) {
            throw new ItunesXMLLibraryParserException("Failed to parse property list into dictionary!", e);
        }

        if (rootDict == null) {
            log.warning("Could not find rootDict in file: " + xmlLibraryFile.getAbsolutePath());
        } else {

                itl = new ItunesLibrary(rootDict);
                
//                NSObject[] parameters = ((NSArray) rootDict.objectForKey("Parameters")).getArray();
//                for (NSObject param : parameters) {
//                    if (param.getClass().equals(NSNumber.class)) {
//                        Map<String, List<NSNumber>> pmap = new HashMap<String, List<NSNumber>>();
//                        if (pmap.get(name) == null) {
//                            pmap.put(name, new LinkedList<NSNumber>());
//                        }
//                        NSNumber num = (NSNumber) param;
//                        switch (num.type()) {
//                            case NSNumber.BOOLEAN: {
//                                boolean bool = num.boolValue();
//                                log.info("Parsed boolean: [" + name + "]: " + bool);
//                                break;
//                            }
//                            case NSNumber.INTEGER: {
//                                long l = num.longValue();
//                                log.info("Parsed long: [" + name + "]: " + l);
//                                break;
//                            }
//                            case NSNumber.REAL: {
//                                double d = num.doubleValue();
//                                log.info("Parsed double: [" + name + "]: " + d);
//                                break;
//                            }
//                            default: {
//                                throw new ItunesXMLLibraryParserException("Unknown NUMBER type: " + num.type());
//                            }
//                        }
//                        pmap.get(name).add(num);
//                    } else if (param.getClass().equals(NSString.class)) {
//                        Map<String, List<NSString>> smap = new HashMap<>();
//                        if (smap.get(name) == null) {
//                            smap.put(name, new LinkedList<NSString>());
//                        }
//                        smap.get(name).add((NSString) param);
//                    } else {
//                        log.warning("Skipping unknown NS type: " + param.toString() + " :: " + param.toXMLPropertyList());
//                    }
                }
        return itl;
    }
}
