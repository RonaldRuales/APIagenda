package ec.robrapp.agenda.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;


@Data //libreria de lombok
@AllArgsConstructor
@Entity
@Table(name="contacto")
public class Contacto {
    @Id //especifica la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcontacto")
    private Integer id;



    private String nombre;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "fechanac")
    private LocalDate fechaNacimiento;

    private String celular;

    @Column(name = "email")
    private String mail;


}
