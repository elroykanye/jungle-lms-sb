package com.elroykanye.junglelms.business.mapper;


import com.elroykanye.junglelms.api.dto.InstitutionDto;
import com.elroykanye.junglelms.data.entity.Institution;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", implementationPackage="<PACKAGE_NAME>.impl")
public interface InstitutionMapper {

	InstitutionDto mapInstitutionToDto(Institution institution);

	Institution mapDtoToInstitution(InstitutionDto institutionDto);

}
