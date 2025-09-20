package entidades;

import lombok.*;

import java.time.LocalTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "empresa")
public class Sucursal {
    private Long id;
    private String nombre;
    private LocalTime horaApertura;
    private LocalTime horaCierre;
    private boolean esCasaMatriz;
    private Domicilio domicilio; // Relación 1 a 1 con Domicilio

    private Empresa empresa;
}
