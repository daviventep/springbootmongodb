package com.uao.apiweb.model;
@Data
@AllArgsConstructor
@NoArgsConstructor

@Document("Usuarios")
public class UsuariosModel {
    private int id;
    private String nombre;
    private String email;

}
