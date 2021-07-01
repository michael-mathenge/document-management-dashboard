package com.example.<package_name>.models;

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
@Table(name = "<TABLE_NAME>")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Contract {
    @Id
    @SequenceGenerator(name="<sequence_name_a>", sequenceName = "<sequence_name_in_database>", allocationSize = 1)
    @GeneratedValue(strategy =GenerationType.SEQUENCE, generator="<sequence_name_a>")
    private Integer id;
    
}
