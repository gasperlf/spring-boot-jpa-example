package net.ontopsolutions.springbootjpaexample.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "region")
public class Region {

    @Id
    private Long id;

    @OneToOne
    @JoinColumn(name = "code", referencedColumnName = "code")
    private Masterdata masterdata;

    @ManyToOne
    @JoinColumn(name = "label_id", nullable = false)
    private Label label;

    @Override
    public String toString() {
        return "Region{" +
                "id=" + id +
                ", masterdata='" + masterdata + '\'' +
                ", label=" + label +
                '}';
    }
}
