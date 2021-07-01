package com.example.legal.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "uploader_id")
public class Uploader {

    @Id
    private Integer id;

//    @ManyToOne
//    @JoinColumn(name="contractid", insertable = false, updatable = false)
//    private Contract contract;
//
//    private Integer contractid;

    @ManyToOne(optional = false)
    private Contract uploaderid;

    public Contract getUploaderid() {
        return uploaderid;
    }

    public void setUploaderid(Contract uploaderid) {
        this.uploaderid = uploaderid;
    }
}
