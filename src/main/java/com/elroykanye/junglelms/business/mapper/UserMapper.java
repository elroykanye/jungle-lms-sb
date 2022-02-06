package com.elroykanye.junglelms.business.mapper;


@Mapper(componentModel = "spring", implementationPackage="<PACKAGE_NAME>.impl")
public interface UserMapper {

	UserDto mapUserToDto(User user);

	User mapDtoToUser(UserDto userDto);

}
