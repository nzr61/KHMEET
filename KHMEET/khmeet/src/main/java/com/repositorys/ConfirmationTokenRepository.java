package com.repositorys;

import com.models.ConfirmationToken;
import org.springframework.data.repository.CrudRepository;

public interface ConfirmationTokenRepository extends CrudRepository<ConfirmationToken,Long> {
    ConfirmationToken findByConfirmationToken(String confirmationToken);
}
