package edu.qs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.qs.model.entity.Leave;

public interface LeaveRepository extends JpaRepository<Leave, Integer> {
 
}
