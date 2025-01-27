package com.casestudy.reservation.controller;

import com.casestudy.reservation.testConfig.TestBaseConfiguration;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.LinkedMultiValueMap;

import java.util.Map;

import static  org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringRunner.class)
class AdminTestController extends TestBaseConfiguration {

    @Test
    @DisplayName("Test Admin Controller GET Api")
    void testGetUsers() throws JsonProcessingException {

        LinkedMultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        ResponseEntity<String> response = restGetCall("/stationDetails2");

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        String expectedJsonToString = "{\n" +
                "  \"message\": \"SUCCESS\",\n" +
                "  \"data\": [\n" +
                "  {\n"+
                "    \"id\": 1, \n" +
                "    \"stationName\": \"AHMEDABAD\",\n"+
                "    \"stationCode\": \"ADI\"\n"+
                "  },\n"+
                "  {\n"+
                "    \"id\":  2, \n" +
                "    \"stationName\": \"AJMER\",\n"+
                "    \"stationCode\": \"AII\"\n"+
                "  }\n"+
                "  ],\n"+
                "  \"error\": null\n" +
                "}";
        String responseJsonTOString = response.getBody();

        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> responseMa = mapper.readValue(responseJsonTOString, Map.class);

        JsonNode expectedNode = mapper.readTree(expectedJsonToString);
        JsonNode actualNode = mapper.readTree(responseJsonTOString);
        boolean areEqual = compareJsonNodesIgnoreExtraKeys(expectedNode,actualNode);
        assertTrue(areEqual);

    }
}
