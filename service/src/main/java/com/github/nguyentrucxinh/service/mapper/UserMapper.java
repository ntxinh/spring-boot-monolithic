package com.github.nguyentrucxinh.service.mapper;

import com.github.nguyentrucxinh.domain.User;
import com.github.nguyentrucxinh.dto.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO userToUserDTO(User user);

    User userDTOToUser(UserDTO userDTO);
}