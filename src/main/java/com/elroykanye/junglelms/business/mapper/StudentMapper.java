package com.elroykanye.junglelms.business.mapper;


@Mapper(componentModel = "spring", implementationPackage="<PACKAGE_NAME>.impl")
public interface StudentMapper {

	StudentDto mapStudentToDto(Student student);

	Student mapDtoToStudent(StudentDto studentDto);

}
