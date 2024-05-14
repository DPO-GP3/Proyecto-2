package Visual;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Controller.Controller;
import P1.Subasta;
import P1.Comprador;
import P1.Cajero;
import P1.Pago;
import P1.MetodoPago;
import P1.Operador;
import P1.Oferta;
import P1.Administrador;
import P1.Pintura;
import P1.Video;
import P1.Escultura;
import P1.Fotografia;
import P1.Pieza;

public class Visual {
    public static void main(String[] args) {
        // Creamos una instancia del controlador
        Controller controller = new Controller();

        // Simulamos un inicio de sesión
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario:");
        String nombreUsuario = scanner.nextLine();
        System.out.println("Ingrese su contraseña:");
        String contrasena = scanner.nextLine();

        boolean inicioSesionExitoso = controller.iniciarSesion(nombreUsuario, contrasena);

        // Si el inicio de sesión fue exitoso, mostramos el menú de opciones
        if (inicioSesionExitoso) {
            System.out.println("Inicio de sesión exitoso.");
            mostrarMenu(controller);
        } else {
            // Si el inicio de sesión falla, mostramos un mensaje de error
            System.out.println("Inicio de sesión fallido. Verifique las credenciales e inténtelo de nuevo.");
        }

        scanner.close();
    }

    // Método para mostrar el menú de opciones al usuario
    private static void mostrarMenu(Controller controller) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Iniciar subasta");
            System.out.println("2. Finalizar subasta");
            System.out.println("3. Registrar oferta");
            System.out.println("4. Procesar pago");
            System.out.println("5. Emitir recibo");
            System.out.println("6. Registrar método de pago");
            System.out.println("7. Administrar subastas");
            System.out.println("8. Registrar oferta (Operador)");
            System.out.println("9. Asistir compradores (Operador)");
            System.out.println("10. Supervisar operación completa");
            System.out.println("11. Aprobar inclusión piezas");
            System.out.println("12. Administrar cuentas de usuarios");
            System.out.println("13. Tomar decisiones estratégicas");
            System.out.println("14. Realizar oferta");
            System.out.println("15. Realizar compra");
            System.out.println("16. Registrar pago");
            System.out.println("17. Verificar pago");
            System.out.println("18. Generar recibo");
            System.out.println("19. Salir");

            int opcion = scanner.nextInt();
            List<Subasta> listaDeSubastasActivas = new ArrayList<>();

            switch (opcion) {
                case 1:
                    controller.iniciarSubasta(new Subasta());
                    break;
                case 2:
                    controller.finalizarSubasta(new Subasta());
                    break;
                case 3:
                    controller.registrarOferta(new Subasta(), new Comprador("NombreComprador", 1000.0, 500.0), 100.0f);
                    break;
                case 4:
                    controller.procesarPago(new Cajero("NombreCajero", "Cajero"), new Pago("NombreDelComprador", "Efectivo", 100.0, 1));
                    break;
                case 5:
                    Cajero cajero = new Cajero("NombreCajero", "Cajero");
                    Pago pago = new Pago("NombreDelComprador", "Efectivo", 100.0, 1);
                    controller.emitirRecibo(cajero, pago);
                    break;
                case 6:
                    controller.registrarMetodoPago(new Cajero("NombreCajero", "Cajero"), new MetodoPago("NombreDelComprador", "Tarjeta de Crédito"));
                    break;
                case 7:
                    Operador operador = new Operador("NombreOperador", "RolOperador", listaDeSubastasActivas);
                    controller.administrarSubastas(operador);
                    break;
                case 8:
                    Comprador comprador = new Comprador("NombreComprador", 1000.0, 500.0);
                    Oferta oferta = new Oferta(comprador, 200.0);
                    Subasta subasta = new Subasta();
                    controller.registrarOferta(new Operador("NombreOperador", "RolOperador", listaDeSubastasActivas), subasta, oferta);
                    break;
                case 9:
                    controller.asistirCompradores(new Operador("NombreOperador", "RolOperador", listaDeSubastasActivas), new Comprador("NombreComprador", 1000.0, 500.0));
                    break;
                case 10:
                    controller.supervisarOperacionCompleta(new Administrador("NombreAdministrador", "RolAdministrador"));
                    break;
                case 11:
                    List<Pieza> piezas = new ArrayList<>();
                    piezas.add(new Pintura("ID-Pintura001", "Pintura", "La Noche Estrellada", 1889, "Vincent van Gogh", "73.7 cm x 92.1 cm", "Óleo sobre lienzo", 2.5f, false, "Expuesto en el MoMA", "En exhibición", "Azul y amarillo", "Impresionismo", "Postimpresionista"));
                    piezas.add(new Video("VID123", "Video", "Documental de la Naturaleza", 2020, "Jane Doe", "N/A", "Digital", 0, false, "Disponible en 4K", "En archivo", "45 minutos", "3840x2160"));
                    piezas.add(new Escultura("ESC001", "Escultura", "David", 1504, "Michelangelo Buonarroti", "17 ft x 7 ft", "Mármol", 5575, false, "Ubicada en la Galería de la Academia de Florencia", "En exhibición", "Mármol"));
                    piezas.add(new Fotografia("FOTO001", "Fotografia", "Atardecer en la ciudad", 2022, "Alex Martinez", "640x480", "Papel fotográfico", 0.5f, false, "Foto impresa en alta calidad", "En archivo", "Alta", "Color"));
                    controller.aprobarInclusionPiezas(new Administrador("NombreAdministrador", "RolAdministrador"), piezas);
                    break;
                case 12:
                    controller.administrarCuentasUsuarios(new Administrador("NombreAdministrador", "RolAdministrador"));
                    break;
                case 13:
                    controller.tomarDecisionesEstrategicas(new Administrador("NombreAdministrador", "RolAdministrador"));
                    break;
                case 14:
                    Subasta subastaParaOferta = new Subasta();
                    controller.realizarOferta(new Comprador("NombreComprador", 1000.0, 500.0), subastaParaOferta, 300.0f);
                    break;
                case 15:
                    comprador = new Comprador("NombreComprador", 1000.0, 500.0);
                    List<Pieza> piezasParaComprar = new ArrayList<>();
                    piezasParaComprar.add(new Pintura("ID-Pintura001", "Pintura", "La Noche Estrellada", 1889, "Vincent van Gogh", "73.7 cm x 92.1 cm", "Óleo sobre lienzo", 2.5f, false, "Expuesto en el MoMA", "En exhibición", "Azul y amarillo", "Impresionismo", "Postimpresionista"));
                    piezasParaComprar.add(new Video("VID123", "Video", "Documental de la Naturaleza", 2020, "Jane Doe", "N/A", "Digital", 0, false, "Disponible en 4K", "En archivo", "45 minutos", "3840x2160"));
                    piezasParaComprar.add(new Escultura("ESC001", "Escultura", "David", 1504, "Michelangelo Buonarroti", "17 ft x 7 ft", "Mármol", 5575, false, "Ubicada en la Galería de la Academia de Florencia", "En exhibición", "Mármol"));
                    piezasParaComprar.add(new Fotografia("FOTO001", "Fotografia", "Atardecer en la ciudad", 2022, "Alex Martinez", "640x480", "Papel fotográfico", 0.5f, false, "Foto impresa en alta calidad", "En archivo", "Alta", "Color"));
                    comprador.realizarCompra(piezasParaComprar);
                    break;
                case 16:
                    Pago pagoParaRegistro = new Pago("NombreDelComprador", "Efectivo", 100.0, 1);
                    controller.registrarPago(pagoParaRegistro);
                    break;
                case 17:
                    Pago pagoParaVerificacion = new Pago("NombreDelComprador", "Efectivo", 100.0, 1);
                    controller.verificarPago(pagoParaVerificacion);
                    break;
                case 18:
                    Pago pagoParaRecibo = new Pago("NombreDelComprador", "Efectivo", 100.0, 1);
                    controller.generarRecibo(pagoParaRecibo);
                    break;
                case 19:
                    continuar = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
            }
        }

        scanner.close();
    }
}
