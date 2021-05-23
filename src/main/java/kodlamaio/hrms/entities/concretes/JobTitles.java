package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "job_position")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobTitles {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "titles")
    private String jobTitle;

}
