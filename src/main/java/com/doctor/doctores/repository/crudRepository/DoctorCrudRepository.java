package com.doctor.doctores.repository.crudRepository;

import com.doctor.doctores.model.Doctor;
import org.springframework.data.repository.CrudRepository;

public interface DoctorCrudRepository extends CrudRepository<Doctor, Integer> {
}
