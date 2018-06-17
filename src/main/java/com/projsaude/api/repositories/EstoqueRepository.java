package com.projsaude.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.projsaude.api.documents.Estoque;

public interface  EstoqueRepository extends  MongoRepository <Estoque, String>{

}
