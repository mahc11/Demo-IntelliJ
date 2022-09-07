package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);

		Task t1 = new Task("Recordar POO", false, LocalDate.of(2022,9,06));
		Task t2 = new Task("Conocer Intellij IDEA", false, LocalDate.of(2022,9,20));
		Task t3 = new Task("Conocer de Spring Boot", false, LocalDate.of(2022,9,20));
		Task t4 = new Task("Finalizando Tareas ...", false, LocalDate.of(2022, 05,19));
		Task t5 = new Task("Recuperar Finalizando tareas ...", false, LocalDate.of(2022, 8, 20));

		TaskList metas = new TaskList("Tareas de fin de año");

		metas.addTarea(t1);
		metas.addTarea(t2);
		metas.addTarea(t3);
		metas.addTarea(t4);
		metas.addTarea(t5);

		System.out.println("Tareas iniciales: ");
		metas.printTareas();

		metas.removeTask("Finalizando Tareas ...");
		System.out.println("Tareas Finales: ");
		metas.printTareas();
	}

}
