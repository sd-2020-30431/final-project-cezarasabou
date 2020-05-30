package medhelp.presentation.mapper;

import medhelp.model.User;
import medhelp.presentation.dto.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserMapper {
    UserDTO userToUserDTO(User user);
    @Mapping(target = "user_id", ignore = true)
    User userDTOToUser(UserDTO userDTO);
}
