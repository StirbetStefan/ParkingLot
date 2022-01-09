/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.park.parkinglot.common;

import java.io.Serializable;

/**
 *
 * @author Stefan
 */
public class PhotoDetails implements Serializable {

    private Integer id;
    private String fileName;
    private String fileType;
    private byte[] fileContent;

    public PhotoDetails(Integer id, String fileName, String fileType, byte[] fileContent) {
        this.id = id;
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileContent = fileContent;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public void setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
    }

    public Integer getId() {
        return id;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public byte[] getFileContent() {
        return fileContent;
    }


}
