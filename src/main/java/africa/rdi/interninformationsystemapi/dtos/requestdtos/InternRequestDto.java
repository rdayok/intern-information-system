package africa.rdi.interninformationsystemapi.dtos.requestdtos;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
public class InternRequestDto {
    private String slackName;
    private String track;
    private String gitHubFileURL;
    private String gitHubRepoURL;
}
