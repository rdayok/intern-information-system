package africa.rdi.interninformationsystemapi.services;

import africa.rdi.interninformationsystemapi.dtos.responsedtos.InternResponseDto;

public interface InternServiceInterface {

    InternResponseDto getInformationFor(String slackName, String track);
}
