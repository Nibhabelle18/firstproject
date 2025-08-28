package org.sony.project.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Entity
@Getter
@Table(name="student")
public class StudentEntity {
    @Id
    private int studentid;
    @Column
    private String fname;
    private String lname;
    private Date dob;
}
