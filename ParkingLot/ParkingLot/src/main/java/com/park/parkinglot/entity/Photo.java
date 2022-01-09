/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.park.parkinglot.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Stefan
 */
@Entity
public class Photo implements Serializable {

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getFilename() {
        return fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public byte[] getFileContent() {
        return fileContent;
    }

    public Car getCar() {
        return car;
    }

    public User getUser() {
        return user;
    }

    public Photo getPhoto() {
        return photo;
    }
    public void setFilename(String filename) {
        this.fileName = filename;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public void setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String fileName;
    private String fileType;
    private byte[] fileContent;
    
    @OneToOne
    @JoinColumn(name = "CAR_KEY")
    private Car car;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_KEY")
    private User user;
    
    @OneToOne(mappedBy="car", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private Photo photo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Photo)) {
            return false;
        }
        Photo other = (Photo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.park.parkinglot.entity.Photo[ id=" + id + " ]";
    }

    public String getFileName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
