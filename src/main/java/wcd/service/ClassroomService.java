package wcd.service;

import wcd.entity.Classroom;
import wcd.repository.ClassroomRepository;
import wcd.repository.Impl.ClassroomRepositoryImpl;

import java.util.List;

public class ClassroomService {
    private final ClassroomRepository classroomRepository;

    public ClassroomService(){
        this.classroomRepository = new ClassroomRepositoryImpl();
    }

    public List<Classroom> getAllClasses(){
        return classroomRepository.findAll();
    }

    public Classroom getClassroomById(int id) throws Exception {
        Classroom classroom = classroomRepository.findById(id);
        if(classroom == null){
            throw new Exception("Classroom not found!");
        }
        return classroom;
    }

    public void saveClassroom(Classroom classroom){
        classroomRepository.save(classroom);
    }
}
