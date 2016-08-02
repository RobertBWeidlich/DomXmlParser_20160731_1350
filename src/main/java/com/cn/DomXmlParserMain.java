package com.cn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;

/**
 * @author rbw
 * @file DomXmlParserMain.java
 * @date Sun Jul 31 15:48:06 EDT 2016
 * @purpose Main function for DomXmlParser.
 */

public class DomXmlParserMain {
    private static PrintStream SO = System.out;

    /**
     *
     * @param xmlPathNameArg - name of XML file to parse
     * @throws Exception
     *
     * Parse XML file using [org.w3c.dom] library and dump to stdout
     */
    DomXmlParserMain(String xmlPathNameArg) throws Exception {
        //String xmlStr = this.getStrFromFile(xmlPathNameArg);
        String xmlStr = DomXmlParser.getStrFromFile(xmlPathNameArg);

        SO.println("TEXT:");
        SO.println(">>>");
        SO.println(xmlStr);
        SO.println("<<<");
    }

//    public String getStrFromFile(String pathArg) throws java.io.IOException {
//        final int BUF_SZ = 4096;
//
//        StringBuffer sb = new StringBuffer(BUF_SZ);
//        BufferedReader reader = new BufferedReader(new FileReader(pathArg));
//        char[] buf = new char[BUF_SZ];
//
//        int numRead;
//        while((numRead = reader.read(buf)) != -1) {
//            String readData = String.valueOf(buf, 0, numRead);
//            sb.append(buf);
//        }
//
//        reader.close();
//
//        return sb.toString();
//    }


    public static void main(String[] args) {
        int argc = args.length;

        SO.println("1550");
        SO.println("Sun Jul 31 15:48:06 EDT 2016");
        for (String arg : args) {
            SO.println(arg);
        }
        String xmlFilePath = null;

        if (argc < 1) {
            String userDir = System.getProperty("user.dir");
            String dataSubDir = "/target/test-classes/data/";
            String defDataFile1 = "cn_rss_raw-x.mudflats-20160731.1708.13.xml";
            xmlFilePath = userDir + dataSubDir + defDataFile1;
        }
        else {
            xmlFilePath = args[0];
        }

        try {
            DomXmlParserMain dxpm = new DomXmlParserMain(xmlFilePath);
        }
        catch (Exception e) {}

        int aa = 77;
    }
}
