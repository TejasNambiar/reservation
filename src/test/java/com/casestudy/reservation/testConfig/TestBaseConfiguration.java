package com.casestudy.reservation.testConfig;

import com.casestudy.reservation.repository.AdminRepository;
import com.casestudy.reservation.repository.StationRepository;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.File;
import java.util.Iterator;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class TestBaseConfiguration {
    /* Autowire all dependecies */
    @Autowired
    AdminRepository adminRepository;

    @Autowired
    StationRepository stationRepository;

//    @Autowired
//    TrainsRepository trainsRepository;

    @LocalServerPort
    protected static int port = 8091;

    @Autowired
    protected TestRestTemplate testRestTemplate;

    protected static String token = "abc";
    protected static String BASE_URL = "http://localhost:"+ port + "/api/railways/admin";

    protected HttpHeaders getHeaderForPostMethod(){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.set("key",token);
        return headers;
    }

    protected HttpHeaders getHeaderForGetMethod(){
        HttpHeaders headers = new HttpHeaders();
//        headers.set("key",token);
        return headers;
    }

    protected ResponseEntity<String> restGetCall(String apiEndPoint) {
        String fullUrl = BASE_URL + apiEndPoint;

        // Log the URL for debugging
        System.out.println("Full URL: " + fullUrl);

        HttpEntity<Object> entity = new HttpEntity<>(getHeaderForGetMethod());
        System.out.println("Headers: " + entity);

        return testRestTemplate.exchange(
                fullUrl,
                HttpMethod.GET,
                entity,
                String.class
        );
    }

    protected ResponseEntity<String> restGetCallWithParams(String apiEndPoint, MultiValueMap<String, String> queryParams){
        String finalUrl = UriComponentsBuilder.fromUriString(BASE_URL+apiEndPoint)
                .queryParams(queryParams)
                .toUriString();
        HttpEntity<Object> entity = new HttpEntity<>(getHeaderForGetMethod());

        System.out.println("Headers: "+entity);

        ResponseEntity<String> response = testRestTemplate.exchange(
                finalUrl,
                HttpMethod.GET,
                entity,
                String.class
        );
        return response;
    }

    protected ResponseEntity<String> restPostCall(String apiEndPoint, String jsonRequest){
        HttpEntity<String> entity = new HttpEntity<>(jsonRequest,getHeaderForPostMethod());

        ResponseEntity<String> response = testRestTemplate.postForEntity(
                BASE_URL+apiEndPoint,
                entity,
                String.class
        );
        return response;
    }

    protected ResponseEntity<String> restPostCallWithFile(String apiEndPoint, String sso, String filePath){

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        // Add key-value pairs to the map (ensure correct spelling and case sensitivity)
        queryParams.add("sso",sso);

        String finalUrl = UriComponentsBuilder.fromUriString(apiEndPoint)
                .queryParams(queryParams)
                .toUriString();

        Resource fileResource = new FileSystemResource(new File(filePath));

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);
//        headers.set("key",token);

        //Prepare reuest body with file attached
        MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
        body.add("file",fileResource);

        HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(body, headers);

        // Make the post request
        return testRestTemplate.exchange(
                BASE_URL+apiEndPoint,
                HttpMethod.POST,
                requestEntity,
                String.class
        );
    }

    protected boolean compareJsonNodesIgnoreExtraKeys(JsonNode expectedNode, JsonNode actualNode){
        if(expectedNode.isNull() || actualNode.isNull()){
            return expectedNode.isNull() == actualNode.isNull();
        }
        if(expectedNode.isArray()){
            if(!actualNode.isArray() || expectedNode.size() != actualNode.size()){
                return false;
            }
            for(int i = 0; i < expectedNode.size(); i++){
                JsonNode expectedElement = expectedNode.get(i);
                JsonNode actualElement = actualNode.get(i);
                if(!compareJsonNodesIgnoreExtraKeys(expectedElement,actualElement)){
                    return false;
                }
            }
            return true;
        }
        else if(expectedNode.isObject()){
            // check if actual object has all fields from expected object
            Iterator<String> fieldNames1 = expectedNode.fieldNames();
            while(fieldNames1.hasNext()){
                String fieldName = fieldNames1.next();
                JsonNode value1 = expectedNode.get(fieldName);
                JsonNode value2 = actualNode.get(fieldName);
                if(value2 == null || !compareJsonNodesIgnoreExtraKeys(value1,value2)){
                    System.out.println("Mis-Match Expected key value - "+value1+" -- Not Equals to -- key value - "+value2);
                    return false;
                }
            }
            // ignore any extra fields in the actual object
            return true;
        }
        else{
            //compare primitive values
            return expectedNode.asText().equals(actualNode.asText());
        }
    }

}
