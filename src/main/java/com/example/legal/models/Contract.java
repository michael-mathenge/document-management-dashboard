package com.example.legal.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "TM_KPOSB_CONTRACTS")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Contract {
    @Id
    @SequenceGenerator(name="ContrSeq", sequenceName = "contracts_sequence", allocationSize = 1)
    @GeneratedValue(strategy =GenerationType.SEQUENCE, generator="ContrSeq")
    private Integer id;
    private String contract_name;
    private Date start_date;
    private Date end_date;
//    private Boolean contract_expired;
    private Boolean warning_sent;
    private String parties;
    private String nature;
//    private String scope;
    private Integer term;
//    private Date renewal_date;
    private String consideration;
    private String status;
//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "uploaderid")
//    private Collection<Uploader> contractid;
//
//    public Collection<Uploader> getContractid() {
//        return contractid;
//    }
//
//    public void setContractid(Collection<Uploader> contractid) {
//        this.contractid = contractid;
//    }
}
