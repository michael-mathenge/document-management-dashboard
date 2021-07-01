package com.example.<package_name>.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "<TABLE_NAME>")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Litigation {
    @Id
    @SequenceGenerator(name="sequence_name_b", sequenceName = "<sequence_name_in_database>", allocationSize = 1)
    @GeneratedValue(strategy =GenerationType.SEQUENCE, generator="sequence_name_b")
    private Integer id;
    
}
