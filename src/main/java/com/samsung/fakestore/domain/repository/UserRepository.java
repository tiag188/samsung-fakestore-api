
package com.samsung.fakestore.domain.repository;

import com.samsung.fakestore.domain.model.User;
import java.util.List;

public interface UserRepository {
    List<User> findAll();
}
