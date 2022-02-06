package com.elroykanye.junglelms.business.mapper;


@Mapper(componentModel = "spring", implementationPackage="<PACKAGE_NAME>.impl")
public interface TeacherMapper {

	TeacherDto mapTeacherToDto(Teacher teacher);

	Teacher mapDtoToTeacher(TeacherDto teacherDto);

}
