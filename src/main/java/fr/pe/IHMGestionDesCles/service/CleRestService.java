package fr.pe.IHMGestionDesCles.service;

import fr.pe.IHMGestionDesCles.model.CleEntity;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.lang.reflect.Type;
import java.util.*;

@Service
public class CleRestService {

    public List<CleEntity> getCleAll() {
        RestTemplate restTemplate = new RestTemplate();
        final UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("localhost:8085")
                .path("/cles")
                .build();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity entity = new HttpEntity(headers);


        ResponseEntity<List<CleEntity>> response = restTemplate.exchange(uriComponents.toUriString(), HttpMethod.GET, null, new ParameterizedTypeReference<List<CleEntity>>() {});
        return response.getBody();
    }

}
