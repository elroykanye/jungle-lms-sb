package com.elroykanye.junglelms.business.mapper;


import com.elroykanye.junglelms.api.dto.EnrolmentDto;
import com.elroykanye.junglelms.data.entity.Enrolment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", implementationPackage="<PACKAGE_NAME>.impl")
public interface EnrolmentMapper {

	EnrolmentDto mapEnrolmentToDto(Enrolment enrolment);

	Enrolment mapDtoToEnrolment(EnrolmentDto enrolmentDto);

}
