package pe.com.cibertec.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="tb_empleado")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class empleadoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "area_id")
	private Integer areaId;
	
	@Column(name = "Dni_empleado", nullable = false)
	private String dni_empleado;
	
	@Column(name = "nombre_empleado", nullable = false)
	private String nombre_empleado;
	
	@Column(name = "apellido_empleado", nullable = false)
	private String apellido_empleado;
	
	@Column(name = "fecha_nacimiento", nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaNacimiento;
	
	@Column(name = "direccion", nullable = false)
	private String direccion;
	
	@Column(name = "correo", nullable = false)
	private String correo;
	
	
	@ManyToOne
	@JoinColumn(name = "fk_area", nullable = false)
	private empleadoEntity empleadoEntity;
	
	
}
