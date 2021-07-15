package ejercicio7grupal;

public class Exercice2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaracion de las arrays
		Serie series[] = new Serie[5];
		Videojuego juegos[] = new Videojuego[5];
		
		Serie ser1 = new Serie();
		series[0] = ser1;
		Serie ser2 = new Serie("The Witcher", "Project");
		series[1] = ser2;
		Serie ser3 = new Serie("The Witcher", 6, "Aventura", "Project");
		series[2] = ser3;
		Serie ser4 = new Serie("The Cacatua", "Ejemplo");
		series[3] = ser4;
		Serie ser5 = new Serie("The Cacatua", 1, "Misterio", "Ejemplo123");
		series[4] = ser5;
		
		Videojuego jueg1 = new Videojuego();
		juegos[0] = jueg1;
		Videojuego jueg2 = new Videojuego("The Witcher 3", 200);
		juegos[1] = jueg2;
		Videojuego jueg3 = new Videojuego("The Witcher", "Aventura","Project", 50);
		juegos[2] = jueg3;
		Videojuego jueg4 = new Videojuego("The last of us", 1000);
		juegos[3] = jueg4;
		Videojuego jueg5 = new Videojuego("Minecraft", "Aventura","Mojang", 1000);
		juegos[4] = jueg5;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("-------------------VIDEOJUEGO----------------------\n");
			System.out.println(juegos[i]+"\n");
			System.out.println("----------------------SERIE-------------------\n");
			System.out.println(series[i]+"\n");
		}
		
		//Pasamos los objetos a entregados
		jueg1.Entregar();
		jueg4.Entregar();
		ser1.Entregar();
		ser4.Entregar();
		ser5.Entregar();
		
		System.out.println("//////////////////////////////////////////////////////////////\n");
		for (int i = 0; i < 5; i++) {
			//Comprobamos si el juego esta entregado, de ser así lo mostramos y lo devolvemos
			if(juegos[i].isEntregado()) {
				System.out.println("-------------------VIDEOJUEGO ENTREGADO----------------------\n");
				System.out.println(juegos[i]+"\n");
				juegos[i].Devolver();
			}
			//Comprobamos si la serie esta entregado, de ser así lo mostramos y lo devolvemos
			if(series[i].isEntregado()) {
				System.out.println("----------------------SERIE ENTREGADA-------------------\n");
				System.out.println(series[i]+"\n");
				series[i].Devolver();
			}
		}
		
		//CompareTo Videojuego
		Videojuego maxJ = new Videojuego();
		
		for (int i = 0; i < juegos.length; i++) {
			if(juegos[i].compareTo(maxJ)==1)
				maxJ=juegos[i];
		}
		System.out.println("El videojuego con mayor numero de horas es: \n");
		System.out.println(maxJ+"\n");
		
		//CompareTo Serie
		Serie maxS = new Serie();
		for (int i = 0; i < series.length; i++) {
			if(series[i].compareTo(maxS)==1)
				maxS=series[i];
		}
		System.out.println("La serie con mayor numero de temporadas es: \n");
		System.out.println(maxS+"\n");
	}

}
