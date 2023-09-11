package africa.rdi.interninformationsystemapi.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Intern")
public class Intern {
    @Id
    private String slackName;
    private String track;
    private String gitHubFileURL;
    private String gitHubRepoURL;
}
