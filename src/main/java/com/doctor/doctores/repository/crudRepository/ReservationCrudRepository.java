package com.doctor.doctores.repository.crudRepository;

import com.doctor.doctores.model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
}