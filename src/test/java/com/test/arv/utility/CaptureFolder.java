/*package com.test.arv.utility;

import java.io.File;

public class CaptureFolder {

    private String captureFolder = ".";
    private static String SUB_FOLDER = "sikuli_captured";
    private static CaptureFolder MYSELF = null;
    private boolean setted = false;

    public Boolean isCaptureMatchedImage = true;

    private CaptureFolder() {}

    public static CaptureFolder getInstance() {
        if (MYSELF == null) {
            MYSELF = new CaptureFolder();
        }
        return MYSELF;
    }

    public void setCaptureFolder(String captureFolder) {
        this.captureFolder = captureFolder + "/" + CaptureFolder.SUB_FOLDER;
        setted = true;
        File file = new File(this.captureFolder);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public String getCaptureFolder() {
        return captureFolder;
    }

    public String getSubFolder() {
        if (setted) {
            return CaptureFolder.SUB_FOLDER;
        } else {
            return ".";
        }
    }

}*/