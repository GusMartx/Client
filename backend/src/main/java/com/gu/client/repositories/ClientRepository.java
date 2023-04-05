package com.gu.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gu.client.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
