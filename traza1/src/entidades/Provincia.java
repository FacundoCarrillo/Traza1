package entidades;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Provincia {
    private Long id;
    private String nombre;
    private Pais pais;
}
