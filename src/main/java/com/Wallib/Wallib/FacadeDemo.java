package com.Wallib.Wallib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacadeDemo {

	public static void main(String[] args) {

		ShapeMaker shapeMaker = new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRenctangle();
		shapeMaker.drawSquare();

		//SpringApplication.run(FacadeDemo.class, args);
	}

}
