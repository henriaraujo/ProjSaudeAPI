package com.projsaude.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.projsaude.api.documents.MovimentacaoMedicamento;

public interface  MovimentacaoMedicamentoRepository extends  MongoRepository <MovimentacaoMedicamento, String>{

}
