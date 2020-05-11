package net.ontopsolutions.springbootjpaexample.domain.repositories;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class LabelResponse {

    private Long id;
    private String name;

    private List<RegionResponse> regionResponseList;
}
