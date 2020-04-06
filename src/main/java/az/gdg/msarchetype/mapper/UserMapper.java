package az.gdg.msarchetype.mapper;

import az.gdg.msarchetype.model.dto.UserDTO;
import az.gdg.msarchetype.model.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserEntity dtoToEntity(UserEntity memberDto);

    UserDTO entityToDto(UserEntity memberEntity);

    List<UserDTO> entityToDtoList(List<UserEntity> memberEntities);
}
