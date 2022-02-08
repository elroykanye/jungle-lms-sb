package com.elroykanye.junglelms.business.mapper;


import com.elroykanye.junglelms.api.dto.UserDto;
import com.elroykanye.junglelms.data.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", implementationPackage="<PACKAGE_NAME>.impl")
public interface UserMapper {

	UserDto mapUserToDto(User user);

	User mapDtoToUser(UserDto userDto);

}
