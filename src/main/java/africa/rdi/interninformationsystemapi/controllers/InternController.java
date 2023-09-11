package africa.rdi.interninformationsystemapi.controllers;

import africa.rdi.interninformationsystemapi.dtos.responsedtos.InternResponseDto;
import africa.rdi.interninformationsystemapi.services.InternServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class InternController {

    private InternServiceInterface serviceInterface;

    public InternController(InternServiceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }

    @RequestMapping(value = "/api", method = RequestMethod.GET)
    public ResponseEntity<InternResponseDto> internInformation(@RequestParam String slack_name, @RequestParam String track) {
        InternResponseDto internInformationResponse = serviceInterface.getInformationFor(slack_name, track);
        return new ResponseEntity<>(internInformationResponse, HttpStatus.OK);
    }

}
