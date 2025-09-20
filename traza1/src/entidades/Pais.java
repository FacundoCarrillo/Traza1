package entidades;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pais {
    private Long id;
    private String nombre;
}
