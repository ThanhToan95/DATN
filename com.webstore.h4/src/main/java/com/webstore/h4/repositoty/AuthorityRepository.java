package com.webstore.h4.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webstore.h4.entity.Authority;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority,Integer> {

}
