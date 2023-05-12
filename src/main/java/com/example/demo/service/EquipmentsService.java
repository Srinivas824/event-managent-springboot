package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EquipmentRepositry;
import com.example.demo.entity.Equipments;

@Service
public class EquipmentsService {
	@Autowired
	EquipmentRepositry eqjpa;
	
	@Transactional
	public void addEquipments(Equipments equipments) {
		eqjpa.save(equipments);
	}
	@Transactional
	public List<Equipments> displayAllEquipments(){
		return eqjpa.findAll();
	}
	@Transactional
	public void removeEquipment(int equipmentId) {
		eqjpa.deleteById(equipmentId);
	}
	@Transactional
	public Equipments selectProductById(int equipmentId) {
		return eqjpa.findById(equipmentId).get();
	}
	@Transactional
	public void updateEqupiments(Equipments equipments) {
		eqjpa.save(equipments);
	}
//	@Transactional
//	public  List<Equipments> searchEquipments(String equipmentType) {
//		return eqjpa.findByEqupimentType(equipmentType);
//	}

	
}
