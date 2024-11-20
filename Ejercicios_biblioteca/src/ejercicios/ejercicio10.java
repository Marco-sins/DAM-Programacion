package ejercicios;

import java.util.Random;

public class ejercicio10 {
	public static void main(String[] args) {
		int num1 = (int) (Math.random() * 6) + 1;
		System.out.println("El primer jugador ha sacado: " + num1);
		int num2 = (int) (Math.random() * 6) + 1;
		System.out.println("El segundo jugador ha sacado: " + num2);
		int num3 = (int) (Math.random() * 6) + 1;
		System.out.println("El tercer jugador ha sacado: " + num3 + "\n");
		boolean imayo = num1 > num2  ? true : false;
		boolean jmayo = num3 > num1 ? true : false;
		boolean kmayo = num2 > num3 ? true : false;
		boolean iequal = num1 == num2  ? true : false;
		boolean jequal = num3 == num1 ? true : false;
		boolean kequal = num2 == num3 ? true : false;
		String msg1 = iequal ? (kequal? "Los tres números son iguales" : (kmayo ? "El primer y el segundo jugador tienen el número más alto" : "El tercer jugador tiene el número más alto")) : jequal ? imayo ? "El primer y tercer jugador tienen el número más alto" : "El segundo jugador tiene el número más alto" : kequal ? imayo ? "El primer jugador tiene el número más alto" : "El segundo y tercer jugador tienen el número más alto" : imayo ? (jmayo ? "El tercer jugador ha sacado el número más grande" : "El primer jugador ha sacado el número más grande") : kmayo ? "El segundo jugador ha sacado el número más grande" : "El tercer jugador ha sacado el número más grande";
		String msg2 = iequal ? (kequal? "Los tres números son iguales" : (kmayo ? "El tercer jugador tiene el número más bajo" : "El primer y segundo jugador tienen el número más bajo")) : jequal ? imayo ? "El segundo jugador tiene el número más bajo" : "El primer y tercer jugador tienen el número más bajo" : kequal ? imayo ? "El segundo y tercer jugador tienen el número más bajo" : "El primer jugador tiene el número más bajo" : imayo ? (kmayo ? "El tercer jugador ha sacado el número más pequeño" : "El segundo jugador ha sacado el número más pequeño") : jmayo ? "El primer jugador ha sacado el número más pequeño" : "El tercer jugador ha sacado el número más pequeño";
		System.out.println(msg1 + "\n");
		System.out.println(msg2);
	}
}