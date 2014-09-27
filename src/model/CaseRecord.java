/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Alex
 */
public class CaseRecord {
    private boolean changed = false;
    // Поля модели
    private StringProperty no         = new SimpleStringProperty();
    private String name       ;//= new SimpleStringProperty();
    private String surname    ;//= new SimpleStringProperty();
    private String patronymic ;//= new SimpleStringProperty();
    
    private Date birthday = new Date();
    private Date presenceFrom = new Date();
    private Date presenceTo = new Date();
    // Диагноз и заболевания
//    private Diagnosis diagnosis;
    private String    diagnosisText;
    private Integer   diagnosisIndex;
    private boolean noDiseaseSide = true;
    private boolean leftDiseaseSide = false;
    private boolean rightDiseaseSide = false;
    private boolean twoDiseaseSides = false;
    private String[] complications;
    private String[] otherDiseases;
    private String desc;
    // Операция
//    private Operation operation;
    private String    operationText;
    private Integer   operationIndex;
    private Date operationDate = new Date();
    private boolean noOperationSide = true;
    private boolean leftOperationSide = false;
    private boolean rightOperationSide = false;
    private boolean twoOperationSides = false;
    // Швы
    private boolean omitStitches = true;
    private boolean removedStitches = false;
    private boolean notRemovedStitches = false;

    public CaseRecord(String no, String surname, String name, String patronimyc) {
        setNo(no);
        setSurname(surname);
        setName(name);
        setPatronymic(patronimyc);
    }

    public CaseRecord() {
        // TODO Auto-generated constructor stub
    }

    public void reset(){
        setNo("");
        setSurname("");
        setName("");
        setPatronymic("");
    }
    /**
     * 
     * @param newVal
     */
    public void setChanged(boolean changed){
        this.changed = changed;
    }

    public boolean getChanged(){
        return this.changed;
    }

    /**
     * 
     * @param newVal
     */
    @XmlElement(name="No")
    public final void setNo(String no){
        this.no.set(no);
        setChanged(true);
    }

    public final String getNo(){return this.no.get();}
    
    public StringProperty noProperty() {return no;}

    /**
     * 
     * @param newVal
     */
    public void setName(String name){
        //    firePropertyChange("name", this.name, this.name = name);
        setChanged(true);
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return surname;
    }

    /**
     * 
     * @param newVal
     */
    public void setSurname(String surname){
        //firePropertyChange("surname", this.surname, this.surname = surname);
        setChanged(true);
    }

    public String getPatronymic(){
        return patronymic;
    }

    /**
     * 
     * @param newVal
     */
    public void setPatronymic(String patronymic){
        //firePropertyChange("patronymic", this.patronymic, this.patronymic = patronymic);
        setChanged(true);
    }

    public Date getBirthday(){
        return birthday;
    }

    /**
     * 
     * @param newVal
     */
    public void setBirthday(Date birthday){
        //firePropertyChange("birthday", this.birthday, this.birthday = birthday);
        setChanged(true);
    }

    public Date getPresenceFrom(){
        return presenceFrom;
    }

    /**
     * 
     * @param newVal
     */
    public void setPresenceFrom(Date presenceFrom){
        //firePropertyChange("presenceFrom", this.presenceFrom, this.presenceFrom = presenceFrom);
        setChanged(true);
    }

    public Date getPresenceTo(){
        return presenceTo;
    }

    /**
     * 
     * @param newVal
     */
    public void setPresenceTo(Date presenceTo){
        //firePropertyChange("presenceTo", this.presenceTo, this.presenceTo = presenceTo);
        setChanged(true);
    }

    //public Diagnosis getDiagnosis(){
    //    return diagnosis;
    //}

    /**
     * 
     * @param newVal
     */
    //public void setDiagnosis(Diagnosis diagnosis){
        //firePropertyChange("diagnosis", this.diagnosis, this.diagnosis = diagnosis);
    //}

    public String getDiagnosisText(){
        return diagnosisText;
    }

    /**
     * 
     * @param newVal
     */
    public void setDiagnosisText(String diagnosisText){
        //firePropertyChange("diagnosisText", this.diagnosisText, this.diagnosisText = diagnosisText);
        setChanged(true);
    }

    public Integer getDiagnosisIndex(){
        return diagnosisIndex;
    }

    /**
     * 
     * @param newVal
     */
    public void setDiagnosisIndex(Integer diagnosisIndex){
        //firePropertyChange("diagnosisIndex", this.diagnosisIndex, this.diagnosisIndex = diagnosisIndex);
    }

    public boolean getNoDiseaseSide(){
        return noDiseaseSide;
    }

    /**
     * 
     * @param newVal
     */
    public void setNoDiseaseSide(boolean noDiseaseSide){
        //firePropertyChange("noDiseaseSide", this.noDiseaseSide, this.noDiseaseSide = noDiseaseSide);
        setChanged(true);
    }

    public boolean getLeftDiseaseSide(){
        return leftDiseaseSide;
    }

    /**
     * 
     * @param newVal
     */
    public void setLeftDiseaseSide(boolean leftDiseaseSide){
        //firePropertyChange("leftDiseaseSide", this.leftDiseaseSide, this.leftDiseaseSide = leftDiseaseSide);
        setChanged(true);
    }

    public boolean getRightDiseaseSide(){
        return rightDiseaseSide;
    }

    /**
     * 
     * @param newVal
     */
    public void setRightDiseaseSide(boolean rightDiseaseSide){
        //firePropertyChange("rightDiseaseSide", this.rightDiseaseSide, this.rightDiseaseSide = rightDiseaseSide);
        setChanged(true);
    }

    public boolean getTwoDiseaseSides(){
        return twoDiseaseSides;
    }

    /**
     * 
     * @param newVal
     */
    public void setTwoDiseaseSides(boolean twoDiseaseSides){
        //firePropertyChange("twoDiseaseSides", this.twoDiseaseSides, this.twoDiseaseSides = twoDiseaseSides);
        setChanged(true);
    }

    public String[] getComplications(){
        return complications;
    }

    /**
     * 
     * @param newVal
     */
    public void setComplications(String[] newVal){
        complications = newVal;
    }

    public String[] getOtherDiseases(){
        return otherDiseases;
    }

    /**
     * 
     * @param newVal
     */
    public void setOtherDiseases(String[] newVal){
        otherDiseases = newVal;
    }

    public String getDesc(){
        return desc;
    }

    /**
     * 
     * @param newVal
     */
    public void setDesc(String desc){
        //firePropertyChange("desc", this.desc, this.desc = desc);
        setChanged(true);
    }

    //public Operation getOperation(){
    //    return operation;
    //}

    /**
     * 
     * @param newVal
     */
    //public void setOperation(Operation operation){
        //firePropertyChange("operation", this.operation, this.operation = operation);
    //}

    public String getOperationText(){
            return operationText;
    }

    /**
     * 
     * @param newVal
     */
    public void setOperationText(String operationText){
        //firePropertyChange("operationText", this.operationText, this.operationText = operationText);
        setChanged(true);
    }

    public Integer getOperationIndex(){
        return operationIndex;
    }

    /**
     * 
     * @param newVal
     */
    public void setOperationIndex(Integer operationIndex){
        //firePropertyChange("operationIndex", this.operationIndex, this.operationIndex = operationIndex);
    }

    public Date getOperationDate(){
        return operationDate;
    }

    /**
     * 
     * @param newVal
     */
    public void setOperationDate(Date operationDate){
        //firePropertyChange("operationDate", this.operationDate, this.operationDate = operationDate);
        setChanged(true);
    }

    public boolean getNoOperationSide(){
        return noOperationSide;
    }

    /**
     * 
     * @param newVal
     */
    public void setNoOperationSide(boolean noOperationSide){
        //firePropertyChange("noOperationSide", this.noOperationSide, this.noOperationSide = noOperationSide);
        setChanged(true);
    }

    public boolean getLeftOperationSide(){
        return leftOperationSide;
    }

    /**
     * 
     * @param newVal
     */
    public void setLeftOperationSide(boolean leftOperationSide){
        //firePropertyChange("leftOperationSide", this.leftOperationSide, this.leftOperationSide = leftOperationSide);
        setChanged(true);
    }


    public boolean getRightOperationSide(){
        return rightOperationSide;
    }

    /**
     * 
     * @param newVal
     */
    public void setRightOperationSide(boolean rightOperationSide){
        //firePropertyChange("rightOperationSide", this.rightOperationSide, this.rightOperationSide = rightOperationSide);
        setChanged(true);
    }

    public boolean getTwoOperationSides(){
        return twoOperationSides;
    }

    /**
     * 
     * @param newVal
     */
    public void setTwoOperationSides(boolean twoOperationSides){
        //firePropertyChange("twoOperationSides", this.twoOperationSides, this.twoOperationSides = twoOperationSides);
        setChanged(true);
    }

    public boolean getOmitStitches(){
        return omitStitches;
    }

    /**
     * 
     * @param newVal
     */
    public void setOmitStitches(boolean omitStitches){
        //firePropertyChange("omitStitches", this.omitStitches, this.omitStitches = omitStitches);
        setChanged(true);
    }

    public boolean getRemovedStitches(){
        return removedStitches;
    }

    /**
     * 
     * @param newVal
     */
    public void setRemovedStitches(boolean removedStitches){
        //firePropertyChange("removedStitches", this.removedStitches, this.removedStitches = removedStitches);
        setChanged(true);
    }

    public boolean getNotRemovedStitches(){
        return notRemovedStitches;
    }

    /**
     * 
     * @param newVal
     */
    public void setNotRemovedStitches(boolean notRemovedStitches){
        //firePropertyChange("notRemovedStitches", this.notRemovedStitches, this.notRemovedStitches = notRemovedStitches);
        setChanged(true);
    }

    //@Override
    public String toString() {
        return surname + "_" + name.charAt(0) + patronymic.charAt(0) + " (" + no + ")";
    }


}
