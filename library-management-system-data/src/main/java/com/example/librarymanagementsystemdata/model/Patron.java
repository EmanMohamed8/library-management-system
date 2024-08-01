package com.example.librarymanagementsystemdata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "patron")
public class Patron extends BaseEntity{
    @Column
    private String name;
    @Column
    private String phoneNumber;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private String address;
    @Column
    private String city;
}
