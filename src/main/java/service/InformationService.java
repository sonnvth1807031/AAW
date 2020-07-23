package service;

import model.Information;

import java.util.List;

public interface InformationService {
    List<Information> getAll();

    void update(Information information);

    void delete(Integer id);

    Information get(Integer id);

    void insert(Information information);
}
