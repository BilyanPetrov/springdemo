package com.example.demo.repository;

import com.example.demo.model.Albums;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumsRepository extends JpaRepository<Albums, Integer> {
}
