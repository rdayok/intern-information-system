package africa.rdi.interninformationsystemapi.services;


import africa.rdi.interninformationsystemapi.dtos.requestdtos.InternRequestDto;
import africa.rdi.interninformationsystemapi.dtos.responsedtos.InternResponseDto;

public interface InternServiceInterface {
    InternResponseDto save(InternRequestDto internRequestDto);
}
