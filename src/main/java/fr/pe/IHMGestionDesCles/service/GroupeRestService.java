package fr.pe.IHMGestionDesCles.service;

import fr.pe.IHMGestionDesCles.model.GroupEntity;
import fr.pe.IHMGestionDesCles.model.ListGroupEntity;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.lang.reflect.Type;
import java.util.*;

@Service
public class GroupeRestService {

    public List<GroupEntity> getGroupAll() {
        RestTemplate restTemplate = new RestTemplate();
        final UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("localhost:8085")
                .path("/groups")
                .build();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity entity = new HttpEntity(headers);


       ResponseEntity<List<GroupEntity>> response = restTemplate.exchange(uriComponents.toUriString(), HttpMethod.GET, null, new ParameterizedTypeReference<List<GroupEntity>>() {});
       return response.getBody();
    }

}
