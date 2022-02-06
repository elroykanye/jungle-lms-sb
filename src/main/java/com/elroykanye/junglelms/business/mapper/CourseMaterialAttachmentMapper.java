package com.elroykanye.junglelms.business.mapper;


@Mapper(componentModel = "spring", implementationPackage="<PACKAGE_NAME>.impl")
public interface CourseMaterialAttachmentMapper {

	CourseMaterialAttachmentDto mapCourseMaterialAttachmentToDto(CourseMaterialAttachment coursematerialattachment);

	CourseMaterialAttachment mapDtoToCourseMaterialAttachment(CourseMaterialAttachmentDto coursematerialattachmentDto);

}
