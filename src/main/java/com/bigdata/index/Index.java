package com.bigdata.index;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "T_INDEX")
public class Index {

    @Id
    @Column(name="idx_seq")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long seq;

    @Column(name="idx_name", nullable = false, length = 100)
    private String name;

    @Column(name="idx_enrollment_date", nullable = true)
    private LocalDateTime enrollmentDate;
}
