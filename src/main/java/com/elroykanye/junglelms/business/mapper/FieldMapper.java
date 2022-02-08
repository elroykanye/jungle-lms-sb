package com.elroykanye.junglelms.business.mapper;


import com.elroykanye.junglelms.api.dto.FieldDto;
import com.elroykanye.junglelms.data.entity.Field;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", implementationPackage="<PACKAGE_NAME>.impl")
public interface FieldMapper {

	FieldDto mapFieldToDto(Field field);

	Field mapDtoToField(FieldDto fieldDto);

}
