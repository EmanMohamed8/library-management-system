package com.example.librarymanagementsystemdata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data

public class BorrowingRecord extends BaseEntity{
    @Column
    private Date returnDate;

}
