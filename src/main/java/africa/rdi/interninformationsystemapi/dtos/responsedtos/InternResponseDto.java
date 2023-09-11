package africa.rdi.interninformationsystemapi.dtos.responsedtos;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class InternResponseDto {
    private String slack_name;
    private String current_day;
    private String utc_time;
    private String track;
    private String github_file_url = "https://github.com/rdayok/intern-information-system/blob/main/src/main/java/africa/rdi/interninformationsystemapi/controllers/InternController.java";
    private String github_repo_url = "https://github.com/rdayok/intern-information-system";
    private Integer status_code = 200;
}
