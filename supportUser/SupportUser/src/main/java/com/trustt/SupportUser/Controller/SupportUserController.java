package com.trustt.SupportUser.Controller;

import com.trustt.SupportUser.DTO.SupportUserRequestDTO;
import com.trustt.SupportUser.DTO.SupportUserResponseDTO;
import com.trustt.SupportUser.Service.SupportUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/actor/api/v1")
public class SupportUserController {

    @Autowired
    SupportUserService supportUserService;

    @PostMapping("/createSupportUser")
    public SupportUserResponseDTO createSupportUser(@RequestBody SupportUserRequestDTO requestDTO){
        return supportUserService.createSupportUser(requestDTO);
    }

    @GetMapping("/supportUser/{id}")
    public SupportUserResponseDTO getSupportUser(@PathVariable long id){
        return supportUserService.getSupportUser(id);
    }
}
