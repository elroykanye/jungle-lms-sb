package com.elroykanye.junglelms.business.mapper;


import com.elroykanye.junglelms.api.dto.TeacherDto;
import com.elroykanye.junglelms.data.entity.Teacher;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", implementationPackage="<PACKAGE_NAME>.impl")
public interface TeacherMapper {

	TeacherDto mapTeacherToDto(Teacher teacher);

	Teacher mapDtoToTeacher(TeacherDto teacherDto);

}
