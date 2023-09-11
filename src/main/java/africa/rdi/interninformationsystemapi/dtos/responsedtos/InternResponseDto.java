package africa.rdi.interninformationsystemapi.dtos.responsedtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class InternResponseDto {
    private String slackName;
    private String track;
    private LocalDate currentDay;
    private LocalDateTime utcTime;
    private String gitHubFileURL;
    private String gitHubRepoURL;
    private Integer statusCode;
}
