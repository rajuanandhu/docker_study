package com.example.demo.repos;

import com.example.demo.entity.docker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface dockerrepo extends JpaRepository<docker,Long> {
}
