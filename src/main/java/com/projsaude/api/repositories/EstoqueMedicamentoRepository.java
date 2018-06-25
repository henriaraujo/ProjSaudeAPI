package com.projsaude.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.projsaude.api.documents.EstoqueMedicamento;

public interface  EstoqueMedicamentoRepository extends  MongoRepository <EstoqueMedicamento, String>{

}
