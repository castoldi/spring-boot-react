package com.castoldi.springbootreact.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.castoldi.springbootreact.domain.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}