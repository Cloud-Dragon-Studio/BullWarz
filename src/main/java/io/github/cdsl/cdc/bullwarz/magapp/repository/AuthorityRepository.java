package io.github.cdsl.cdc.bullwarz.magapp.repository;

import io.github.cdsl.cdc.bullwarz.magapp.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
