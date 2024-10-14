package pe.com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.com.cibertec.model.empleadoEntity;
import pe.com.cibertec.service.AreaService;
import pe.com.cibertec.service.EmpleadoService;

@Controller
@RequestMapping("/empleado")
public class ProductoController {
	@Autowired
	private EmpleadoService empleadoService;
	
	@Autowired
	private AreaService areaService;
	
	@GetMapping("/")
	public String listarEmpleado(Model model) {
		List<empleadoEntity>listarEmpleado = empleadoService.listarEmpleado();
		model.addAttribute("listEmpl",listarEmpleado);
		return "lista_empleado";
}
}