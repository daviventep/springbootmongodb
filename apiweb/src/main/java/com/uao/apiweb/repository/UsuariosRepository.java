package com.uao.apiweb.model;


public interface class IUsuariosRepository extends MongoRepository<UsuariosModel, int> {
    private int id;
    private String nombre;
    private String email;

}
