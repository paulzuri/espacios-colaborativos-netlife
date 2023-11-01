package com.epn.espacioscolaborativosnetlife.repository.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "reserva")

public class Reserva {
    @GeneratedValue(generator = "seq_reserva", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq_reserva", sequenceName = "seq_reserva",allocationSize = 1)
    @Id
    @Column(name="rsva_id")
    private Integer id;

    @Column(name="rsva_fecha")
    private LocalDate fecha;

    @Column(name="rsva_apertura")
    private LocalTime apertura;

    @Column(name="rsva_cierre")
    private LocalTime cierre;

    @Column(name="rsva_duracion")
    private Double duracion;

    @Column(name="rsva_capacidad")
    private Integer capacidad;

    @Column(name="rsva_persona")
    private String persona; // por mapear

    @Column(name="rsva_recurso")
    private String recurso; // por mapear

    @Column(name="rsva_precio")
    private BigDecimal precio;
    

    
}
