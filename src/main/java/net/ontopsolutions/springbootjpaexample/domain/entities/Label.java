package net.ontopsolutions.springbootjpaexample.domain.entities;

import lombok.*;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "label")
public class Label {

    @Id
    private Long id;

    private String name;

    @OneToMany(mappedBy = "label", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @Where(clause = "masterdata1_.type = 'REGION'")
    private List<Region> regionList= new ArrayList<>();

    @Override
    public String toString() {
        return "Label{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", regionList=" + regionList +
                '}';
    }
}
