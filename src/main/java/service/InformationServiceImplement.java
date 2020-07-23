package service;

import dao.InDatabaseInformationDao;
import dao.InformationDao;
import model.Information;

import java.util.Calendar;
import java.util.List;

public class InformationServiceImplement implements InformationService{
    InformationDao dao = new InDatabaseInformationDao();

    public List<Information> getAll() {
        return dao.getAll();
    }

    public void update(Information information) {
        information.setCreateAT(Calendar.getInstance().getTimeInMillis());
        information.setUpdateAt(Calendar.getInstance().getTimeInMillis());
        dao.update(information);
    }

    public void delete(Integer id) {
        dao.delete(id);
    }

    public Information get(Integer id) {
        return dao.getById(id);
    }

    public void insert(Information information) {
        information.setCreateAT(Calendar.getInstance().getTimeInMillis());
        information.setUpdateAt(Calendar.getInstance().getTimeInMillis());
        dao.insert(information);
    }
}
