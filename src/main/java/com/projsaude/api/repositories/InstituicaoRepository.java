package com.projsaude.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.projsaude.api.documents.Instituicao;

public interface  InstituicaoRepository extends  MongoRepository <Instituicao, String>{

}
