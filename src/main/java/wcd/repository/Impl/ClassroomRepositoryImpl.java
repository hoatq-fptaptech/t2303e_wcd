package wcd.repository.Impl;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import wcd.entity.Classroom;
import wcd.repository.ClassroomRepository;

import java.util.List;

public class ClassroomRepositoryImpl implements ClassroomRepository {
    @Override
    public List<Classroom> findAll() {
//        try(Session session = ) {
//
//        }
        return null;
    }

    @Override
    public void save(Classroom classroom) {

    }

    @Override
    public Classroom findById(int id) {
        return null;
    }

    @Override
    public void update(Classroom classroom) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Classroom> findByName(String name) {
        return null;
    }
}
