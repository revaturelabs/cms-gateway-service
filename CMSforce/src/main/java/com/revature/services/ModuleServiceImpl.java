package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.revature.entities.Module;
import com.revature.repositories.ModuleRepository;

public class ModuleServiceImpl implements ModuleService {
	
	@Autowired
	ModuleRepository mr;

	@Override
	public List<Module> getAllModules() {
		try {
			List<Module> modules = new ArrayList<Module>();
			mr.findAll().forEach(modules :: add);
			return modules;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Module getModuleById(int id) {
		try {
			return mr.findOne(id);
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
