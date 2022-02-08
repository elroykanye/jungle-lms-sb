package com.elroykanye.junglelms.business.mapper

import com.elroykanye.junglelms.data.entity.Course
import com.elroykanye.junglelms.api.dto.CourseDto
import org.mapstruct.Mapper

@Mapper(componentModel = "spring", implementationPackage = "<PACKAGE_NAME>.impl")
interface CourseMapper {
    fun mapCourseToDto(course: Course?): CourseDto?
    fun mapDtoToCourse(courseDto: CourseDto?): Course?
}