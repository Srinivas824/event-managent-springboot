package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Equipments;
@Repository
public interface EquipmentRepositry extends JpaRepository<Equipments, Integer> {
	
	@Query(value ="SELECT * FROM equipments WHERE equipment_id= ?1", nativeQuery = true)
	List<Equipments>findAllEquipmentsById(int equipmentId);
	
	@Query(value ="SELECT * FROM equipments WHERE event_location= ?1", nativeQuery = true)
	List<Equipments>findAllEquipmentsByLocation(String eventLocation);
}
