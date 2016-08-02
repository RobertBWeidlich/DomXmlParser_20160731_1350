package com.cn;

import org.w3c.dom.Node;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;

/**
 * @author rbw
 * @file DomXmlParser.java
 * @date Sun Jul 31 15:48:06 EDT 2016
 * @purpose a simple DOM XML Parser
 */

public class DomXmlParser {
    private static PrintStream SO = System.out;
    private String[] fqElNameA = null;  // maintain state of depth in XML DOM

    public DomXmlParser(String xmlPathname) throws Exception {

    }

    /**
     * Convert contents of file to String
     *
     * @param pathArg file to be converted to String
     * @return String containing contents of file
     * @throws java.io.IOException
     */
    public static String getStrFromFile(String pathArg) throws java.io.IOException {
        final int BUF_SZ = 4096;

        StringBuffer sb = new StringBuffer(BUF_SZ);
        BufferedReader reader = new BufferedReader(new FileReader(pathArg));
        char[] buf = new char[BUF_SZ];

        int numRead;
        while ((numRead = reader.read(buf)) != -1) {
            String readData = String.valueOf(buf, 0, numRead);
            sb.append(buf);
        }
        reader.close();

        return sb.toString();
    }

    /**
     *
     * @param typeI org.w3c.dom.Node enum values
     * @return String representing typeI
     */
    public String getNodeTypeString(short typeI) {
        switch (typeI) {
            case Node.ELEMENT_NODE:
                return "ELEMENT_NODE";
            case Node.ATTRIBUTE_NODE:
                return "ATTRIBUTE_NODE";
            //
            // ...
            //
            default:
                return "UNKNOWN_NODE";
        }

    }


}
