package com.keshav.repository;

import com.keshav.domain.B;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the B entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BRepository extends JpaRepository<B, Long> {}
