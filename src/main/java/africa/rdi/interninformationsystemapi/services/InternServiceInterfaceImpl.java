package africa.rdi.interninformationsystemapi.services;

import africa.rdi.interninformationsystemapi.data.models.Intern;
import africa.rdi.interninformationsystemapi.data.repositories.InternRepository;
import africa.rdi.interninformationsystemapi.dtos.requestdtos.InternRequestDto;
import africa.rdi.interninformationsystemapi.dtos.responsedtos.InternResponseDto;
import africa.rdi.interninformationsystemapi.utills.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InternServiceInterfaceImpl implements InternServiceInterface{

    @Autowired
    private InternRepository internRepository;

    public InternResponseDto save(InternRequestDto internRequestDto) {
        Intern intern = new Intern();
        InternResponseDto internResponseDto = new InternResponseDto();
        Mapper.map(intern, internRequestDto);
        Intern newIntern = internRepository.save(intern);
        return internResponseDto;
    }
}
