package com.projsaude.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.projsaude.api.documents.MovimentacaoMaterial;

public interface  MovimentacaoMaterialRepository extends  MongoRepository <MovimentacaoMaterial, String>{

}
