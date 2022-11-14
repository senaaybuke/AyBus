package com.aybuke.AyBus.repository.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Table
@Entity
@Data
@Builder
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY);
    Long id;
    int seatNum;
    List<Seat> seatList;
    String numberPlate;

    public Bus(int seatNum, List<Seat> seatList,String numberPlate){
        this.seatNum;
        this.seatList;
        this.numberPlate;
    }
}
