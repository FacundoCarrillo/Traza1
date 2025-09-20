package entidades;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Localidad {
    private Long id;
    private String nombre;
    private Provincia provincia;
}
