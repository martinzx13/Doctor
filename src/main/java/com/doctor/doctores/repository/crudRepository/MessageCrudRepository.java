package com.doctor.doctores.repository.crudRepository;

import com.doctor.doctores.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}