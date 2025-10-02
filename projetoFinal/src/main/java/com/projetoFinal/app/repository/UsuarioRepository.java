package com.projetoFinal.app.repository;

import org.springframework.data.repository.CrudRepository;
import com.projetoFinal.app.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    Usuario findByIdUsuario(long idUser);

    Usuario deleteByIdUsuario(long idUser);

}
