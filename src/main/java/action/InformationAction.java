package action;

import com.opensymphony.xwork2.ActionSupport;
import model.Information;
import org.apache.struts2.ServletActionContext;
import service.InformationService;
import service.InformationServiceImplement;

import java.util.List;

public class InformationAction extends ActionSupport {
    InformationService service = new InformationServiceImplement();
    Information information = new Information();
    List<Information> informationList;
//    String paramId = ServletActionContext.getRequest().getParameter("id");

    public String createInformation(){
        return INPUT;
    }

    public void validateSave() {
        OK();
    }

//    public void validateUpdated() {
//        OK();
//    }

    public String Save(){
        service.insert(information);
        return SUCCESS;
    }

    public String Delete(){
        service.delete(information.getId());
        return SUCCESS;
    }

    public String Updated(){
        service.update(information);
        return SUCCESS;
    }

    public String getById(){
//        information = service.get(Integer.parseInt(paramValue));
        information = service.get(information.getId());
        return INPUT;
    }

    public String list(){
        informationList = service.getAll();
        return SUCCESS;
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }

    public List<Information> getInformationList() {
        return informationList;
    }

    public void setInformationList(List<Information> informationList) {
        this.informationList = informationList;
    }

    private void OK(){
        if (information.getName() == null || information.getName().isEmpty()){
            addFieldError("information.name","Name is required");
        }else if (information.getName().length() < 10 || information.getName().length() > 30){
            addFieldError("information.name","name 10 - 30");
        }
        if (information.getSubjects() == null || information.getSubjects().isEmpty()){
            addFieldError("information.subjects","Subjects is required");
        }
        if (information.getRollNumber() == null || information.getRollNumber().isEmpty()){
            addFieldError("information.rollNumber","RollNumber is required");
        }else if (information.getRollNumber().length() <= 6 || information.getRollNumber().length() >= 8){
            addFieldError("information.rollNumber","RollNUmber phai co 7 ky tu");
        }
        if (information.getTheoreticalPoint() >=100){
            addFieldError("information.theoreticalPoint","Theoretical Point phai nho hon hoac bang 100");
        }
        if (information.getPracticePoints() > 15){
            addFieldError("information.practicePoints","Practice Points phai ho hon hoac bang 15");
        }
        if (information.getAssignmentPoints() > 10){
            addFieldError("information.AssignmentPoints","Assignment Points phai nho hon hoac bang 10");
        }
    }
}
