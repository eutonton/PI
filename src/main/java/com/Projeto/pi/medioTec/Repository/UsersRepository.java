package com.Projeto.pi.medioTec.Repository;

import com.Projeto.pi.medioTec.Entity.Disciplines.Disciplines;
import com.Projeto.pi.medioTec.Entity.User.UserRole;
import com.Projeto.pi.medioTec.Entity.User.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface UsersRepository extends JpaRepository<Users, String> {

    Users findByCpf(String cpf);

    void deleteById(String id);

    List<Users> findByStudentClass_Id(String classId);

    List<Users> findByRole(UserRole role);

    Optional<Users> findById(String id);

    List<Users> findDistinctByDisciplinesInAndRole(Set<Disciplines> disciplines, UserRole role);

    List<Users> findByName(String name);
}
