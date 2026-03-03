package introduccion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

<<<<<<< HEAD
    static List<String> estudiantes = new ArrayList<>();
    static List<Double> calificaciones = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de gestión de estudiantes.");

        while (true) {
            System.out.println("\n1. Agregar estudiante");
            System.out.println("2. Mostrar lista de estudiantes");
            System.out.println("3. Calcular promedio de calificaciones");
            System.out.println("4. Mostrar estudiante con la calificación más alta");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = Integer.parseInt(scanner.nextLine());

            if (opcion == 1) {

                System.out.print("Ingrese el nombre del estudiante: ");
                String nombre = scanner.nextLine();

                System.out.print("Ingrese la calificación del estudiante: ");
                double calificacion = Double.parseDouble(scanner.nextLine());

                estudiantes.add(nombre);
                calificaciones.add(calificacion);

                System.out.println("Estudiante agregado correctamente.");

            } else if (opcion == 2) {

                if (estudiantes.isEmpty()) {
                    System.out.println("No hay estudiantes registrados.");
                } else {
                    System.out.println("\nLista de estudiantes:");
                    for (int i = 0; i < estudiantes.size(); i++) {
                        System.out.println(estudiantes.get(i) +
                                " - Calificación: " + calificaciones.get(i));
                    }
                }

            } else if (opcion == 3) {

                if (calificaciones.isEmpty()) {
                    System.out.println("No hay calificaciones registradas.");
                } else {
                    double suma = 0;

                    for (double calificacion : calificaciones) {
                        suma += calificacion;
                    }

                    double promedio = suma / calificaciones.size();
                    System.out.println("El promedio de calificaciones es: " + promedio);
                }

            } else if (opcion == 4) {

                if (calificaciones.isEmpty()) {
                    System.out.println("No hay calificaciones registradas.");
                } else {

                    double maxCalificacion = calificaciones.get(0);
                    String estudianteMax = estudiantes.get(0);

                    for (int i = 1; i < calificaciones.size(); i++) {
                        if (calificaciones.get(i) > maxCalificacion) {
                            maxCalificacion = calificaciones.get(i);
                            estudianteMax = estudiantes.get(i);
                        }
                    }

                    System.out.println("El estudiante con la calificación más alta es: "
                            + estudianteMax + " con " + maxCalificacion);
                }

            } else if (opcion == 5) {

                System.out.println("Saliendo del sistema...");
                break;

            } else {

                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
=======
    // Variables globales (porque varios métodos las usan)
    static List<String> estudiantes = new ArrayList<>();
    static List<Double> calificaciones = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Bienvenido al sistema de gestión de estudiantes.");

        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero();

            switch (opcion) {
                case 1:
                    agregarEstudiante();
                    break;
                case 2:
                    mostrarEstudiantes();
                    break;
                case 3:
                    calcularPromedio();
                    break;
                case 4:
                    mostrarMayorCalificacion();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        scanner.close();
    }

    // Método para mostrar el menú
    public static void mostrarMenu() {
        System.out.println("\n1. Agregar estudiante");
        System.out.println("2. Mostrar lista de estudiantes");
        System.out.println("3. Calcular promedio");
        System.out.println("4. Mostrar mayor calificación");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Método para agregar estudiante
    public static void agregarEstudiante() {
        System.out.print("Ingrese nombre del estudiante: ");
        String nombre = scanner.nextLine();

        double nota = leerNotaValida();

        estudiantes.add(nombre);
        calificaciones.add(nota);

        System.out.println("Estudiante agregado correctamente.");
    }

    // Método para mostrar estudiantes
    public static void mostrarEstudiantes() {

        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        System.out.println("\nLista de estudiantes:");
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println(estudiantes.get(i) + " - " + calificaciones.get(i));
        }
    }

    // Método para calcular promedio
    public static void calcularPromedio() {

        if (calificaciones.isEmpty()) {
            System.out.println("No hay datos.");
            return;
        }

        double suma = 0;

        for (double nota : calificaciones) {
            suma += nota;
        }

        double promedio = suma / calificaciones.size();
        System.out.println("Promedio: " + promedio);
    }

    // Método para mostrar mayor calificación
    public static void mostrarMayorCalificacion() {

        if (calificaciones.isEmpty()) {
            System.out.println("No hay datos.");
            return;
        }

        double mayor = calificaciones.get(0);
        String nombreMayor = estudiantes.get(0);

        for (int i = 1; i < calificaciones.size(); i++) {
            if (calificaciones.get(i) > mayor) {
                mayor = calificaciones.get(i);
                nombreMayor = estudiantes.get(i);
            }
        }

        System.out.println("Mayor calificación: " + nombreMayor + " con " + mayor);
    }

    // Método para leer entero con validación
    public static int leerEntero() {

        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Ingrese un número válido: ");
            }
        }
    }

    // Método para validar nota entre 0 y 100
    public static double leerNotaValida() {

        while (true) {
            try {
                System.out.print("Ingrese calificación (0-100): ");
                double nota = Double.parseDouble(scanner.nextLine());

                if (nota >= 0 && nota <= 100) {
                    return nota;
                } else {
                    System.out.println("Debe estar entre 0 y 100.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida.");
            }
        }
    }
>>>>>>> f3734992305888c2a24cc531551a33b1da8e7327
}