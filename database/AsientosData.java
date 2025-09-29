package database;

import java.util.List;

import componentes.modulos.Asientos;

public class AsientosData {
    public static List<Asientos> asientos = List.of(
    // 🟩 Grupo izquierdo (2x2 en lugar de 3x3)
        new Asientos("L1", false), new Asientos("L2", false),
        new Asientos("L3", false), new Asientos("L4", false),

        // 🟩 Centro-izquierda (3x3 en lugar de 5x5)
        new Asientos("C1", false), new Asientos("C2", false), new Asientos("C3", false),
        new Asientos("C4", false), new Asientos("C5", false), new Asientos("C6", false),
        new Asientos("C7", false), new Asientos("C8", false), new Asientos("C9", false),

        // 🟩 Centro-derecha (3x3 en lugar de 5x5)
        new Asientos("D1", false), new Asientos("D2", false), new Asientos("D3", false),
        new Asientos("D4", false), new Asientos("D5", false), new Asientos("D6", false),
        new Asientos("D7", false), new Asientos("D8", false), new Asientos("D9", false),

        // 🟩 Grupo derecho (2x2 en lugar de 3x3)
        new Asientos("R1", false), new Asientos("R2", false),
        new Asientos("R3", false), new Asientos("R4", false)
);

}
