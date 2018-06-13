package com.projsaude.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.projsaude.api.documents.Almoxarifado;

public interface  AlmoxarifadoRepository extends  MongoRepository <Almoxarifado, String>{

}
