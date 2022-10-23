package com.codegym.receipt.model;

import java.util.regex.Pattern;

public class CheckFilePicture {
    private static final String FILE_PICTURE = "[\\w\\s()-.]*[.]png";

    public static boolean checkFile(String file){

        if (Pattern.compile(FILE_PICTURE).matcher(file).matches()) {
            return true;
        }

        return false;
    }

}
