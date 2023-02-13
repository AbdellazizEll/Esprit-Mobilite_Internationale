package com.Debuggers.MobiliteInternational.Entity;

import com.Debuggers.MobiliteInternational.Entity.Enum.Niveau;
import com.Debuggers.MobiliteInternational.Entity.Enum.Status;
import com.Debuggers.MobiliteInternational.Entity.Enum.StudyField;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="candidatures")
@NoArgsConstructor
@AllArgsConstructor
public class Candidature implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private Long candidatureId;

    private String CoverLettre;

    private String attachements;

    private StudyField option;

    private Niveau levelEng;

    private Niveau levelFr;

    private Status status ;


}
