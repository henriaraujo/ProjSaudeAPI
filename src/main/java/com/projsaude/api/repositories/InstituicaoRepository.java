package com.projsaude.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.projsaude.api.documents.Material;

public interface  MaterialRepository extends  MongoRepository <Material, String>{

}
