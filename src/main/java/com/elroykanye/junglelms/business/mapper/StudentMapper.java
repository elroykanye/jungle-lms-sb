package com.elroykanye.junglelms.business.mapper;


import com.elroykanye.junglelms.api.dto.StudentDto;
import com.elroykanye.junglelms.data.entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", implementationPackage="<PACKAGE_NAME>.impl")
public interface StudentMapper {

	StudentDto mapStudentToDto(Student student);

	Student mapDtoToStudent(StudentDto studentDto);

}
