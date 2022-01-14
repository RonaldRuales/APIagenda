package ec.robrapp.agenda;

import ec.robrapp.agenda.model.Contacto;
import ec.robrapp.agenda.repo.ContactoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@Slf4j //anotacion de login de lombok eso me permite trabajar sin get ni setter y ahorramos codigos
@SpringBootApplication
//vamos a comentar de la linea 1 por que vamos a editar el codigo segun el curso
//video 8 listar contactos thymeleaft youtube todotic thymeleaft
public class AgendaApplication {

/*
	@Autowired

	private ContactoRepository contactoRepository;

	@PostConstruct
	void init()
	{
		Contacto contacto1= new Contacto();
		contacto1.setNombre("Kathaleya Ruales");
		contacto1.setCelular("0984358230");
		contacto1.setMail("kruales@rpi.gob.ec");
		contacto1.setFechaNacimiento(LocalDate.now());
		contactoRepository.save(contacto1);

		Contacto contacto2= new Contacto();
		contacto2.setNombre("Benjamin");
		contacto2.setCelular("0984358234");
		contacto2.setMail("benjamin@rpi.gob.ec");
		contacto2.setFechaNacimiento(LocalDate.now());
		contactoRepository.save(contacto2);

		contactoRepository.findAll().forEach(c ->{
			System.out.println("Contacto: "+c.getNombre());
		} );

		//cambiamos un poco el codigo para resaltar el tema de lombok
		contactoRepository.findAll().forEach(c ->{
			log.info("Contacto: {}",c);
		} );

	}
*/
	public static void main(String[] args) {
		SpringApplication.run(AgendaApplication.class, args);
	}

}
