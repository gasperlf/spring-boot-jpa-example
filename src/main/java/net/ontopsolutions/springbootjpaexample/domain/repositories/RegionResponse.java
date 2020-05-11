package net.ontopsolutions.springbootjpaexample.domain.repositories;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegionResponse {
    private Long id;
    private String name;
}
