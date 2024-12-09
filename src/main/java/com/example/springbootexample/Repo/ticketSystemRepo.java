package com.example.springbootexample.Repo;
import com.example.springbootexample.Model.ticketSystemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ticketSystemRepo extends JpaRepository<ticketSystemModel, Integer> {
}
