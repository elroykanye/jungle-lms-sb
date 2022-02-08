package com.elroykanye.junglelms.business.mapper;


import com.elroykanye.junglelms.api.dto.CourseMaterialDto;
import com.elroykanye.junglelms.data.entity.CourseMaterial;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", implementationPackage="<PACKAGE_NAME>.impl")
public interface CourseMaterialMapper {

	CourseMaterialDto mapCourseMaterialToDto(CourseMaterial coursematerial);

	CourseMaterial mapDtoToCourseMaterial(CourseMaterialDto coursematerialDto);

}
