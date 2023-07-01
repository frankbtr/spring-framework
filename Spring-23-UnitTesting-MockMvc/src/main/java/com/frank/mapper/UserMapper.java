package com.frank.mapper;

import com.frank.dto.UserDTO;
import com.frank.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    private final ModelMapper modelMapper;

    public UserMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

   public  User convertToEntity(UserDTO dto){
        return modelMapper.map(dto,User.class);
    }

    public UserDTO convertToDTO(User entity){
        return modelMapper.map(entity,UserDTO.class);
    }
}
