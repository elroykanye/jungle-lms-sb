package com.elroykanye.junglelms.business.mapper;


@Mapper(componentModel = "spring", implementationPackage="<PACKAGE_NAME>.impl")
public interface EnrolmentMapper {

	EnrolmentDto mapEnrolmentToDto(Enrolment enrolment);

	Enrolment mapDtoToEnrolment(EnrolmentDto enrolmentDto);

}
