package com.elroykanye.junglelms.business.mapper;


import com.elroykanye.junglelms.api.dto.CourseMaterialAttachmentDto;
import com.elroykanye.junglelms.data.entity.CourseMaterialAttachment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", implementationPackage="<PACKAGE_NAME>.impl")
public interface CourseMaterialAttachmentMapper {

	CourseMaterialAttachmentDto mapCourseMaterialAttachmentToDto(CourseMaterialAttachment coursematerialattachment);

	CourseMaterialAttachment mapDtoToCourseMaterialAttachment(CourseMaterialAttachmentDto coursematerialattachmentDto);

}
