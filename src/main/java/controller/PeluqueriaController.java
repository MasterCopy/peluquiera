package controller;

import java.util.Arrays;
import java.util.List;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import model.Cita;

@RestController
public class PeluqueriaController {

	@Autowired
	RestTemplate template;
	
	String url = "http://localhost:8080";
	
	@GetMapping(value = "/altaCita/{nombre}/{diaCita}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Cita>> altaCita(@PathVariable("nombre") String nombre,@PathVariable("diaCita") Long diaCita){
		Cita citaPersona = new Cita(nombre, "S", new DateTime(diaCita).toDate());
		template.postForLocation(url + "/cita", citaPersona);
		Cita[] citas = template.getForObject(url + "/citas", Cita[].class);
		return new ResponseEntity<List<Cita>>(Arrays.asList(citas), HttpStatus.CREATED);
	}

}
