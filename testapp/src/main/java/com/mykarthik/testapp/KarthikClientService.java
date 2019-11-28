package com.mykarthik.testapp;

import com.mykarthik.testapp.model.LocationRequest;
import com.mykarthik.testapp.model.LocationRequest.Address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class KarthikClientService {
  @Autowired  
  RestTemplate restTemplate;
  
  @Value("${demo.uri}")
  private String uri;
  @Value("${demo.uri2}")
  private String uri2;

  public String getNameAge() {

    return restTemplate.exchange(uri, HttpMethod.GET, buildSampleRequest(), String.class).getBody();
  }

  public Object getAddress() {
    ResponseEntity<Object> x = null;
    try {
      x = restTemplate.exchange(uri2, HttpMethod.POST, buildComplexRequest(), Object.class);
    } catch (Exception e) {
      log.error("error :", e);
    }

    return x.getBody();
  }

  public HttpEntity<Object> buildSampleRequest() {
    HttpHeaders headers = new HttpHeaders();
    headers.setBasicAuth("arul", "arul");
    return new HttpEntity<>("", headers);
  }

  public HttpEntity<Object> buildComplexRequest() {

    LocationRequest locationRequest = new LocationRequest();

   
    locationRequest.setPinCode(600042);
    locationRequest.setCity("Chennai");
    locationRequest.setState("TN");
    locationRequest.setAddress(new Address("2nd stret", "vela", 155));

    HttpHeaders headers = new HttpHeaders();
    headers.setBasicAuth("arul", "arul");
    headers.setContentType(MediaType.APPLICATION_JSON);
    return new HttpEntity<>(locationRequest, headers);
  }

}