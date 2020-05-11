package net.ontopsolutions.springbootjpaexample.rest;

import lombok.RequiredArgsConstructor;
import net.ontopsolutions.springbootjpaexample.domain.entities.Label;
import net.ontopsolutions.springbootjpaexample.domain.repositories.LabelRepository;
import net.ontopsolutions.springbootjpaexample.domain.repositories.LabelResponse;
import net.ontopsolutions.springbootjpaexample.domain.repositories.RegionResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class LabelController {

    private final LabelRepository labelRepository;
    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<LabelResponse>> getLabels(){
        return ResponseEntity.ok(labelRepository
                .findAll()
                .stream()
                .map(label -> {
                    LabelResponse labelResponse= new LabelResponse(label.getId(),label.getName(),null);
                    labelResponse.setRegionResponseList(label.getRegionList().stream().map(region -> {
                        return new RegionResponse(region.getId(),region.getMasterdata().getName());
                        //return new RegionResponse();
                    }).collect(Collectors.toList()));
                    return  labelResponse;
                })
                .collect(Collectors.toList())
        );
    }
}
