package com.example.gugaguga.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gugaguga.workshopmongo.domain.User;
import com.example.gugaguga.workshopmongo.repository.UserRepository;

@Service
public class UserService {

  @Autowired
  private UserRepository repo;

  public List<User> findAll() {
    return repo.findAll();
  }
}
