package dao;

import model.Information;

import java.util.List;

public interface InformationDao {
    List<Information> getAll();

    Information getById(Integer id);

    void update(Information information);

    void insert(Information information);

    void delete(Integer id);
}
