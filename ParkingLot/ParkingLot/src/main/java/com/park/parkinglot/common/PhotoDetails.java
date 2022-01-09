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
public class PhotoDetails implements Serializable{
    
    private Integer id;
    private String fileName;
    private String fileType;
    private byte[] fileContent;
    
    public PhotoDetails(Integer id, String fileName, String fileType, byte[] fileContent){
        this.id=id;
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileContent = fileContent;
    }

    public String getFileType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getFileContent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
