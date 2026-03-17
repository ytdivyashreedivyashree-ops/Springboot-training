package com.example.Addition.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.Addition.dto.AddRequest;
import com.example.Addition.dto.AddResponse;
import com.example.Addition.entity.AddEntity;
import com.example.Addition.repository.AddRepo;

@Service
public class AddService {

    private final AddRepo addRepo;

    public AddService(AddRepo addRepo) {
        this.addRepo = addRepo;
    }

    public AddResponse calculate(AddRequest request) {
        Integer a = request.getA();
        Integer b = request.getB();
        Integer c = a + b;

        AddEntity entity = new AddEntity();
        entity.setA(a);
        entity.setB(b);
        entity.setC(c);

        AddEntity saved = addRepo.save(entity);

        AddResponse res = new AddResponse();
        res.setA(saved.getA());
        res.setB(saved.getB());
        res.setC(saved.getC());

        return res;
    }

 
    public List<AddResponse> getEveryAddition() {
        List<AddEntity> entities = addRepo.findAll();

        return entities.stream().map(entity -> {
            AddResponse res = new AddResponse();
            res.setA(entity.getA());
            res.setB(entity.getB());
            res.setC(entity.getC());
            return res;
        }).collect(Collectors.toList());
    }
}