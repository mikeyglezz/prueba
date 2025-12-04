import java.util.Arrays;

public class Bingo {

	public static final int FILAS = 9;
	public static final int COLUMNAS = 10;
	public static final int VACIO = 0;
	private int panel[][];

	public Bingo() {

		panel = new int[FILAS][COLUMNAS];

		for (int i = 0; i < FILAS; i++) {

			for (int j = 0; j < COLUMNAS; j++) {

				panel[i][j] = VACIO;
			}
		}
	}

	public void jugar() throws InterruptedException {
		Carton carton = new Carton();

		for (int i = 0; i < FILAS; i++) {

			for (int j = 0; j < COLUMNAS; j++) {

				panel[i][j] = (int) (Math.random() * 89 + 1);

				if(panel[i][j] == carton[0])
					
			}

		}


		carton.generarCarton();
		imprimir();
	}

	private void imprimir() throws InterruptedException {

		System.out.println();

		for (int i = 0; i < FILAS; i++) {

			for (int j = 0; j < COLUMNAS; j++) {

				System.out.print(panel[i][j]);
				System.out.print(" ");
				Thread.sleep(200);
			}
			System.out.println();
		}

	}

}
