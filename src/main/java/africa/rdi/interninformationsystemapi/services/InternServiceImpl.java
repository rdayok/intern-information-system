package africa.rdi.interninformationsystemapi.services;

import africa.rdi.interninformationsystemapi.dtos.responsedtos.InternResponseDto;
import africa.rdi.interninformationsystemapi.utills.Mapper;
import org.springframework.stereotype.Service;

@Service
public class InternServiceImpl implements InternServiceInterface{


    public InternResponseDto getInformationFor(String slackName, String track) {
        InternResponseDto internResponseDto = new InternResponseDto();
        Mapper.map(internResponseDto, slackName, track);
        return internResponseDto;
    }
}
