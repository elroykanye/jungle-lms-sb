package com.elroykanye.junglelms.business.mapper;


@Mapper(componentModel = "spring", implementationPackage="<PACKAGE_NAME>.impl")
public interface CourseMaterialMapper {

	CourseMaterialDto mapCourseMaterialToDto(CourseMaterial coursematerial);

	CourseMaterial mapDtoToCourseMaterial(CourseMaterialDto coursematerialDto);

}
