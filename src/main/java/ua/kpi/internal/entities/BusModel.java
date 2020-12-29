package ua.kpi.internal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

//import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/*
CREATE TABLE public.bus_model
(
    id bigint NOT NULL DEFAULT nextval('bus_model_id_seq'::regclass),
    manufacturer character varying(50) COLLATE pg_catalog."default" NOT NULL,
    model character varying(50) COLLATE pg_catalog."default" NOT NULL,
    seat_number integer NOT NULL,
    CONSTRAINT bus_model_pk PRIMARY KEY (id)
)
 */
@Entity
@Table("bus_model")
@Getter
@Setter
public class BusModel {

  @Id
  private Long id;

  private String manufacturer;

  private String model;

  @Column(name = "seat_number")
  private int seatNumber;

}
