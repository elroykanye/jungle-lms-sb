package com.elroykanye.junglelms.business.mapper;


@Mapper(componentModel = "spring", implementationPackage="<PACKAGE_NAME>.impl")
public interface CourseMapper {

	CourseDto mapCourseToDto(Course course);

	Course mapDtoToCourse(CourseDto courseDto);

}
