package mamede.api_development.service;

import mamede.api_development.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
