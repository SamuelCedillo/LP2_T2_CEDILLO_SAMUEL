package pe.com.cibertec.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.cibertec.model.empleadoEntity;
import pe.com.cibertec.repository.EmpleadoRepository;
import pe.com.cibertec.service.EmpleadoService;

@Service

public class EmpleadoServiceImpl implements EmpleadoService{
	@Autowired
	private EmpleadoRepository empleadoRepository;
	@Override
	public List<empleadoEntity> listarEmpleado() {
		// TODO Auto-generated method stub
		return empleadoRepository.findAll();
	}

	@Override
	public void crearEmpleado(empleadoEntity empleadoEntity) {
		empleadoRepository.save(empleadoEntity);
	}
}
