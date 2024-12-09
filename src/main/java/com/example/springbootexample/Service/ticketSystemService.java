package com.example.springbootexample.Service;
import com.example.springbootexample.Repo.ticketSystemRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ticketSystemService {
    @Autowired
    private ticketSystemRepo ticketSystemRepo;
    @Autowired
    private ModelMapper modelMapper;




}
