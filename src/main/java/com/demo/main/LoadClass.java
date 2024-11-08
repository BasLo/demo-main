package com.demo.main;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class LoadClass {

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            JsonNode jsonNode = objectMapper.readTree(new File("/Users/evgeniyzurov/IdeaProjects/code/demo-main/src/main/resources/all-vehicles-model.json"));
            Set<String> models = new HashSet<>();
            for (JsonNode node : jsonNode) {
                JsonNode make = node.get("make");
                models.add(make.asText());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
