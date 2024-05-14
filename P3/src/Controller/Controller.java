package Controller;

import java.util.List;
import java.util.ArrayList;
import P1.Subasta;
import P1.Comprador;
import P1.Cajero;
import P1.Pago;
import P1.MetodoPago;
import P1.Operador;
import P1.Oferta;
import P1.Administrador;
import P1.Pieza;

public class Controller {
    // Lista de usuarios válidos
    private List<Usuario> usuariosValidos = new ArrayList<>();

    // Constructor que inicializa las cuentas predefinidas
    public Controller() {
        inicializarUsuariosValidos();
    }

    // Método para inicializar las credenciales predefinidas
    private void inicializarUsuariosValidos() {
        agregarUsuarioValido("admin", "adminpass");
        agregarUsuarioValido("operador", "operpass");
        agregarUsuarioValido("cliente", "clientepass");
    }

    // Método para verificar las credenciales e iniciar sesión
    public boolean iniciarSesion(String nombreUsuario, String contrasena) {
        for (Usuario usuario : usuariosValidos) {
            if (usuario.getNombre().equals(nombreUsuario) && usuario.getContrasena().equals(contrasena)) {
                return true; // Inicio de sesión exitoso
            }
        }
        return false; // Usuario no encontrado o contraseña incorrecta
    }

    // Método para agregar más usuarios válidos (simulados)
    public void agregarUsuarioValido(String nombreUsuario, String contrasena) {
        usuariosValidos.add(new Usuario(nombreUsuario, contrasena));
    }

    // Clase interna para representar a un usuario
    private static class Usuario {
        private String nombre;
        private String contrasena;

        public Usuario(String nombre, String contrasena) {
            this.nombre = nombre;
            this.contrasena = contrasena;
        }

        public String getNombre() {
            return nombre;
        }

        public String getContrasena() {
            return contrasena;
        }
    }

    // Otros métodos relacionados con la lógica de la aplicación
    public void iniciarSubasta(Subasta subasta) {
        subasta.iniciarSubasta();
    }

    public void finalizarSubasta(Subasta subasta) {
        subasta.finalizarSubasta();
    }

    public void registrarOferta(Subasta subasta, Comprador comprador, float monto) {
        subasta.registrarOferta(comprador, monto);
    }

    public void procesarPago(Cajero cajero, Pago pago) {
        cajero.procesarPagos(pago);
    }

    public void emitirRecibo(Cajero cajero, Pago pago) {
        cajero.emitirRecibos(pago);
    }

    public void registrarMetodoPago(Cajero cajero, MetodoPago metodoPago) {
        cajero.registrarMetodosDePago(metodoPago);
    }

    public void administrarSubastas(Operador operador) {
        operador.administraSubastas();
    }

    public void registrarOferta(Operador operador, Subasta subasta, Oferta oferta) {
        operador.registraOfertas(subasta, oferta);
    }

    public void asistirCompradores(Operador operador, Comprador comprador) {
        operador.asisteCompradores(comprador);
    }

    public void supervisarOperacionCompleta(Administrador administrador) {
        administrador.supervisarOperacionCompleta();
    }

    public void aprobarInclusionPiezas(Administrador administrador, List<Pieza> piezas) {
        administrador.aprobarInclusionPiezas(piezas);
    }

    public void administrarCuentasUsuarios(Administrador administrador) {
        administrador.administrarCuentasUsuarios();
    }

    public void tomarDecisionesEstrategicas(Administrador administrador) {
        administrador.tomarDecisionesEstrategicas();
    }

    public void realizarOferta(Comprador comprador, Subasta subasta, double monto) {
        comprador.realizarOferta(subasta, monto);
    }

    public void realizarCompra(Comprador comprador, List<Pieza> piezas) {
        comprador.realizarCompra(piezas);
    }

    public void registrarPago(Pago pago) {
        pago.registrarPago();
    }

    public void verificarPago(Pago pago) {
        pago.verificarPago();
    }

    public void generarRecibo(Pago pago) {
        pago.generarRecibo();
    }
}
