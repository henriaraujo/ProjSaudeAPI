package com.projsaude.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.projsaude.api.documents.EstoqueMaterial;

public interface  EstoqueMaterialRepository extends  MongoRepository <EstoqueMaterial, String>{

}
