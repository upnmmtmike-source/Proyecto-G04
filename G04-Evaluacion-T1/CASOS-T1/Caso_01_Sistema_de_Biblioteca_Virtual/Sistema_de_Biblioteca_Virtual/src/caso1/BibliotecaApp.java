package caso1;

public class BibliotecaApp {
    public static void main(String[] args) {
    	 Autor autor1 = new Autor("Isabel Allende", "Chilena");
    	    Autor autor2 = new Autor("Julio Cortázar", "Argentino");
    	    Autor autor3 = new Autor("Miguel de Cervantes", "Español");
    	    Autor autor4 = new Autor("Jorge Luis Borges", "Argentino");
    	    Autor autor5 = new Autor("Juan Rulfo", "Mexicano");

    	    try {
    	        Libro libro1 = new Libro("La casa de los espíritus", autor1, 1982);
    	        libro1.mostrarInfo();
    	    } catch (IllegalArgumentException e) {
    	        System.out.println("Error al registrar libro1: " + e.getMessage());
    	    }

    	    System.out.println("--------------------");

    	    try {
    	        Libro libro2 = new Libro("Rayuela", autor2, 1963, "912-84-006-0254-7");
    	        libro2.mostrarInfo();
    	    } catch (IllegalArgumentException e) {
    	        System.out.println("Error al registrar libro2: " + e.getMessage());
    	    }

    	    System.out.println("--------------------");

    	    try {
    	        Libro libroError = new Libro("El Quijote", autor3, 1605);
    	        libroError.mostrarInfo();
    	    } catch (IllegalArgumentException e) {
    	        System.out.println("Error al registrar libroError: " + e.getMessage());
    	    }

    	    System.out.println("--------------------");

    	    try {
    	        Libro libro3 = new Libro("Ficciones", autor4, 1944, "978-84-206-4444-3");
    	        libro3.mostrarInfo();
    	    } catch (IllegalArgumentException e) {
    	        System.out.println("Error al registrar libro3: " + e.getMessage());
    	    }

    	    System.out.println("--------------------");

    	    try {
    	        Libro libro4 = new Libro("Pedro Paramo", autor5, 1955, "978-84-320-5634-7");
    	        libro4.mostrarInfo();
    	    } catch (IllegalArgumentException e) {
    	        System.out.println("Error al registrar libro4: " + e.getMessage());
    	    }
         
        
    }
}
