package za.ac.cput.repository;

import za.ac.cput.domain.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRepository implements IStudentRepository{

    private static StudentRepository repository;

    private Map<Integer, Student> studentMap;

    private StudentRepository(){
        studentMap = new HashMap<>();
    }
    public static StudentRepository getRepository(){
        if (repository == null){
            repository = new StudentRepository();
        }
        return repository;
    }

    @Override
    public Student findByStudentNumber(String studentNumber) {
        return null;
    }

    @Override
    public List<Student> findByFaculty(String faculty) {
        return List.of();
    }

    @Override
    public List<Student> findByYearOfStudy(int yearOfStudy) {
        return List.of();
    }

    @Override
    public List<Student> findByDepartment(String department) {
        return List.of();
    }

    @Override
    public Student create(Student student) {
        studentMap.put(student.getUserId(), student);
        return student;
    }

    @Override
    public Student read(Integer id) {
        return studentMap.get(id);
    }

    @Override
    public Student update(Student student) {
        if (studentMap.containsKey(student.getUserId())) {
            studentMap.put(student.getUserId(), student);

        }
        return student;
    }

    @Override
    public boolean delete(Integer id) {
        return studentMap.remove(id) != null;
    }

    @Override
    public List<Student> getAll() {
        return new ArrayList<>(studentMap.values());
    }
}
