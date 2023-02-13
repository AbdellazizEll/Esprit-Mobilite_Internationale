package com.Debuggers.MobiliteInternational.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="candidatures")
@NoArgsConstructor
@AllArgsConstructor

public class Commentaire implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long commentId;

    private Integer likes;

    private Integer dislikes;

    private Date date;

    private 
}
