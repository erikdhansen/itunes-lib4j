/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edhkle.itl4j;

import java.io.File;

/**
 *
 * @author ehansen
 */
public class Main {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("usage: il4j <iTunes XML Library File>");
            System.exit(-1);
        }
        
        String filename = args[0];
        File xmlInventoryFile = new File(filename);
        try {
            ItunesLibrary library = ItunesXMLLibraryParser.parse(xmlInventoryFile);
            System.out.println("Completed importing iTunes Library.  Track Count: " + library.getTracks().size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
