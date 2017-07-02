package com.fts.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.JsonSchemaGenerator;
import com.fts.domain.insurance.InsuranceDTO;

/**
 * Created by WangYue on 2017/7/2.
 */
public class MyJsonSchemaGenerator {
    public static void main(String... args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
// configure mapper, if necessary, then create schema generator
        JsonSchemaGenerator schemaGen = new JsonSchemaGenerator(mapper);
        JsonSchema schema = schemaGen.generateSchema(InsuranceDTO.class);

        System.out.println(mapper.writeValueAsString(schema));
    }
}
