package com.trustt.SupportUser.Service;

import com.trustt.SupportUser.DTO.SupportUserRequestDTO;
import com.trustt.SupportUser.DTO.SupportUserResponseDTO;
import com.trustt.SupportUser.Entity.SupportUser;
import com.trustt.SupportUser.Repository.SupportUserRepository;
import com.trustt.SupportUser.Util.SupportUserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class SupportUserService {

    @Autowired
    private SupportUserRepository supportUserRepository;

    @Autowired
    private SupportUserValidator supportUserValidator;

    // AtomicLong to handle thread-safe serial number incrementation
    private static AtomicLong serialNumber = new AtomicLong(1);

    public SupportUserResponseDTO createSupportUser(SupportUserRequestDTO supportUserRequestDTO){
        supportUserValidator.supportUserValidator(supportUserRequestDTO);

        SupportUser user = new SupportUser();
        user.setName(supportUserRequestDTO.getName());
        user.setEmail(supportUserRequestDTO.getEmail());
        user.setPhone(supportUserRequestDTO.getPhone());
        user.setDob(supportUserRequestDTO.getDob());
        user.setDoj(supportUserRequestDTO.getDoj());

        String generatedCode = generateCode(supportUserRequestDTO.getName(),supportUserRequestDTO.getPhone());
        user.setCode(generatedCode);

        SupportUser saveNewUser = supportUserRepository.save(user);

        SupportUserResponseDTO userResponseDTO = new SupportUserResponseDTO();
        userResponseDTO.setId(saveNewUser.getId());
        userResponseDTO.setCode(saveNewUser.getCode());

        return userResponseDTO;
    }

    public SupportUserResponseDTO getSupportUser(Long id){
        Optional<SupportUser> user = supportUserRepository.findById(id);
        if(user.isPresent()){
            SupportUserResponseDTO responseDTO = new SupportUserResponseDTO();
            responseDTO.setId(user.get().getId());
            responseDTO.setCode(user.get().getCode());

            return responseDTO;
        }
        return null;
    }


    //private static long serialNumber = 1;
    public String generateCode(String name, String phone){
        int serialLength = String.valueOf(serialNumber).length();
        String nameCode = name.length()>3 ? name.substring(0,3) : name;
        String phoneCode = phone.substring(phone.length()-3);
        String serialPart = String.format("%0" + serialLength + "d", serialNumber.getAndIncrement());

        return nameCode + phoneCode + serialPart;
        //serialNumber++;
    }
}

