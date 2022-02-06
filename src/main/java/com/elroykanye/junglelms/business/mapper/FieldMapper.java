package com.elroykanye.junglelms.business.mapper;


@Mapper(componentModel = "spring", implementationPackage="<PACKAGE_NAME>.impl")
public interface FieldMapper {

	FieldDto mapFieldToDto(Field field);

	Field mapDtoToField(FieldDto fieldDto);

}
