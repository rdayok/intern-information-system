package africa.rdi.interninformationsystemapi.utills;

import africa.rdi.interninformationsystemapi.dtos.responsedtos.InternResponseDto;

import java.time.ZonedDateTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class Mapper {
    public static void map(InternResponseDto intern, String slackName, String track) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        String formattedDateTime = dateTime.atOffset(zoneOffset).format(dateFormatter);
        intern.setCurrent_day(dateTime.getDayOfWeek().toString());
        intern.setSlack_name(slackName);
        intern.setTrack(track);
        intern.setUtc_time(formattedDateTime);
    }
}
