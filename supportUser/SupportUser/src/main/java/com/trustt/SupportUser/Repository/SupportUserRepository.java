package com.trustt.SupportUser.Repository;

import com.trustt.SupportUser.Entity.SupportUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupportUserRepository extends JpaRepository<SupportUser, Long > {

}
