package com.emp.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.emp.demo.Model.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

}
