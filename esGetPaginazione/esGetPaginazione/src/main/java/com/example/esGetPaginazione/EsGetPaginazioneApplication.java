package com.example.esGetPaginazione;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EsGetPaginazioneApplication implements ApplicationRunner {

    @Autowired
     CarRepository carRepository;

	public static void main(String[] args) {
		SpringApplication.run(EsGetPaginazioneApplication.class, args);
	}
    public  void initDb(){
        CarEntity newCar1 = new CarEntity("PrimaAuto",CarColor.BIANCO);
        carRepository.save(newCar1);

        CarEntity newCar2 = new CarEntity("SecAuto",CarColor.NERO);
        carRepository.save(newCar2);

        CarEntity newCar3 = new CarEntity("TerAuto",CarColor.ROSA);
        carRepository.save(newCar3);

        CarEntity newCar4 = new CarEntity("QuartAuto",CarColor.ROSSO);
        carRepository.save(newCar4);

        CarEntity newCar5 = new CarEntity("QuintAuto",CarColor.BLU);
        carRepository.save(newCar5);

    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        initDb();
    }
}
