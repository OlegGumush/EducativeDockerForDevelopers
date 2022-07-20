package com.spring.docker;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoEntityRepository extends JpaRepository<TodoEntity, Integer> {
}