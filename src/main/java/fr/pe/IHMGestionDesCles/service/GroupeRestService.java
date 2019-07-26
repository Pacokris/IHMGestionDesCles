package fr.pe.IHMGestionDesCles.service;

import fr.pe.IHMGestionDesCles.model.GroupEntity;
import fr.pe.IHMGestionDesCles.model.ListGroupEntity;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.*;

@Service
public class GroupeRestService {

    public ListGroupEntity getGroupAll() {
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

        return restTemplate.exchange(uriComponents.toUriString(), HttpMethod.GET, entity, ListGroupEntity.class).getBody();
    }

}
