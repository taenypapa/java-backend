package com.bigdata.center;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "T_Center")
public class Center {

    @Id
    @Column(name="ctr_seq")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long seq;

    @Column(name="ctr_name", length = 255)
    private String name;

    @Column(name="ctr_type", length = 10)
    private String type;

    @Column(name="ctr_address", length = 255)
    private String address;

    @Column(name="ctr_description", length = 1000)
    private String description;

    @Column(name="ctr_lat", length = 20)
    private String lat;

    @Column(name="ctr_lng", length = 20)
    private String lng;
}
