package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EquipmentRepositry;
import com.example.demo.entity.Equipments;
import com.example.demo.service.EquipmentsService;

@RestController
//@RequestMapping("/equipment")
//@CrossOrigin("http://localhost:4200")
public class EquipmentController {
	
	@Autowired
	EquipmentRepositry er;
	
	private EquipmentsService eqptdao;
	@Autowired
	public EquipmentController(EquipmentsService eqptdao) {
		this.eqptdao=eqptdao;
	}
	@RequestMapping("add")
	public void  addEquipment(@RequestBody Equipments eqpt) {
		eqptdao.addEquipments(eqpt);
	}
	@GetMapping("displayAllEquipments")
	public List<Equipments> displayAllEqip(){
		return eqptdao.displayAllEquipments();
	}
	@DeleteMapping("deleteEquipmentById/{equipmentId}")
	public void deleteEquipment(@PathVariable("equipmentId")int equipmentId) {
		eqptdao.removeEquipment(equipmentId);
	}
	@PostMapping("updateEquip")
	public void updateEquipments(@RequestBody Equipments eqpt) {
		eqptdao.updateEqupiments(eqpt);
	}
	
	@GetMapping("getImages/{equipmentId}")
	public List<Equipments> getequipmentsById(@PathVariable("equipmentId") int equipmentId){
		return er.findAllEquipmentsById(equipmentId);
	}
	@GetMapping("getEventByLocation/{eventLocation}")
	public List<Equipments> getequipmentsByLocationName(@PathVariable("eventLocation") String eventLocation){
		return er.findAllEquipmentsByLocation(eventLocation);
	}

}
