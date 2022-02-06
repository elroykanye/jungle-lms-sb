package com.elroykanye.junglelms.business.mapper;


@Mapper(componentModel = "spring", implementationPackage="<PACKAGE_NAME>.impl")
public interface InstitutionMapper {

	InstitutionDto mapInstitutionToDto(Institution institution);

	Institution mapDtoToInstitution(InstitutionDto institutionDto);

}
