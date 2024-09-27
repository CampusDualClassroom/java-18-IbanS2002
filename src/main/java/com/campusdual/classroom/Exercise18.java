package com.campusdual.classroom;
import com.campusdual.util.Utils;
public class Exercise18 {

	public static void main(String[] args) {

		int[]Myarray=createAndInitializeArray(10);

		showInlineArray(Myarray);
	}


	public static int[] createAndInitializeArray(int size) {

		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = i + 1;
		}

		return array;
	}

	public static void showInlineArray(int[] array) {
		// Recorrer el array y mostrar los elementos
		for (int i = 0; i < array.length; i++) {
			// Imprimir los elementos en el formato secuencial
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(" "); // Espacio entre números
			}
		}
		System.out.println(); // Nueva línea al final
	}
}
