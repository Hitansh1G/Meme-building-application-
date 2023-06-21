package com.crio.starter.Utils;

// import lombok.AllArgsConstructor;
// import lombok.Data;
// import lombok.EqualsAndHashCode;
// import lombok.NoArgsConstructor;
import com.crio.starter.data.MemesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

@Service
// @Data
// @AllArgsConstructor
// @EqualsAndHashCode
// @NoArgsConstructor
public class SequenceGeneratorService {
    
    @Autowired
    private MongoOperations mongoOperations;

    @Autowired SequenceGeneratorService(MongoOperations mongoOperations){
        this.mongoOperations = mongoOperations;
    }

    public long generateSeq(){
        long count = mongoOperations.count(new Query(), MemesEntity.class);
        return count+1;
    }
}
