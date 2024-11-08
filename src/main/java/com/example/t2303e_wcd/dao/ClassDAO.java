package com.example.t2303e_wcd.dao;

import com.example.t2303e_wcd.entity.Classroom;

import java.util.List;

public class ClassDAO implements DAOInterface<Classroom> {
    @Override
    public List<Classroom> all() {
        return null;
    }

    @Override
    public boolean create(Classroom classroom) {
        return false;
    }

    @Override
    public boolean update(Classroom classroom) {
        return false;
    }

    @Override
    public boolean delete(Classroom classroom) {
        return false;
    }

    @Override
    public <K> Classroom find(K id) {
        return null;
    }
}
