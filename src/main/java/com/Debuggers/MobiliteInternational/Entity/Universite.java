package com.Debuggers.MobiliteInternational.Entity;


import com.Debuggers.MobiliteInternational.Entity.Enum.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="universite")
public class Universite {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private  Long universiteId;

    private String nameUniversite;

    private String location;

    private Float lattitude;

    private Float longitude;

    private String description;

    private Type type;

    private String image;


}
