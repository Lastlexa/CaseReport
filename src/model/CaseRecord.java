/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
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
    // Основная информация
    private StringProperty no = new SimpleStringProperty();
    private StringProperty name       = new SimpleStringProperty();
    private StringProperty surname    = new SimpleStringProperty();
    private StringProperty patronymic = new SimpleStringProperty();
    
    private ObjectProperty<Date> birthday = new SimpleObjectProperty<Date>();
    private ObjectProperty<Date> presenceFrom = new SimpleObjectProperty<Date>();
    private ObjectProperty<Date> presenceTo = new SimpleObjectProperty<Date>();
    // Диагноз и заболевания
//    private Diagnosis diagnosis;
    private StringProperty  diagnosisText  = new SimpleStringProperty();
    private IntegerProperty diagnosisIndex = new SimpleIntegerProperty();
    private BooleanProperty noDiseaseSide  = new SimpleBooleanProperty(true);
    private BooleanProperty leftDiseaseSide  = new SimpleBooleanProperty(false);
    private BooleanProperty rightDiseaseSide = new SimpleBooleanProperty(false);
    private BooleanProperty twoDiseaseSides  = new SimpleBooleanProperty(false);
    private StringProperty[] complications;
    private StringProperty[] otherDiseases;
    private StringProperty desc = new SimpleStringProperty();;
    // Операция
//    private Operation operation;
    private StringProperty    operationText   = new SimpleStringProperty();;
    private IntegerProperty   operationIndex   = new SimpleIntegerProperty();
    private ObjectProperty<Date> operationDate = new SimpleObjectProperty<Date>();
    private BooleanProperty noOperationSide    = new SimpleBooleanProperty(true);
    private BooleanProperty leftOperationSide  = new SimpleBooleanProperty(false);
    private BooleanProperty rightOperationSide = new SimpleBooleanProperty(false);
    private BooleanProperty twoOperationSides  = new SimpleBooleanProperty(false);
    // Швы
    private BooleanProperty omitStitches = new SimpleBooleanProperty(true);
    private BooleanProperty removedStitches = new SimpleBooleanProperty(false);
    private BooleanProperty notRemovedStitches = new SimpleBooleanProperty(false);

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

    public void setChanged(boolean changed){
        this.changed = changed;
    }

    public boolean getChanged(){
        return this.changed;
    }
    
    // property: no
    @XmlElement(name="No")
    public final void setNo(String no){
        this.no.set(no);
        setChanged(true);
    }
    public final String getNo(){return this.no.get();}

    public StringProperty noProperty() {return no;}

    // property: name
    public void setName(String name){
        this.name.set(name);
        setChanged(true);
    }

    public String getName(){
        return name.get();
    }

    public StringProperty nameProperty() {return name;}

    // property: surname
    public String getSurname(){
        return surname.get();
    }
    
    public void setSurname(String surname){
        this.surname.set(surname);
        setChanged(true);
    }

    public StringProperty surnameProperty() {return surname;}

    // property: patronymic
    public String getPatronymic(){
        return patronymic.get();
    }

    public void setPatronymic(String patronymic){
        this.patronymic.set(patronymic);
        setChanged(true);
    }

    public StringProperty patronymicProperty() {return surname;}

    // property: birthday
    public Date getBirthday(){
        return birthday.get();
    }

    public void setBirthday(Date birthday){
        this.birthday.set(birthday);
        setChanged(true);
    }

    public ObjectProperty<Date> birthdayProperty() {return birthday;}

    // property: presenceFrom
    public Date getPresenceFrom(){
        return presenceFrom.get();
    }

    public void setPresenceFrom(Date presenceFrom){
        this.presenceFrom.set(presenceFrom);
        setChanged(true);
    }

    public ObjectProperty<Date> presenceFromProperty() {return presenceFrom;}

    // property: presenceTo
    public Date getPresenceTo(){
        return presenceTo.get();
    }

    public void setPresenceTo(Date presenceTo){
        this.presenceTo.set(presenceTo);
        setChanged(true);
    }

    public ObjectProperty<Date> presenceToProperty() {return presenceTo;}

    //public Diagnosis getDiagnosis(){
    //    return diagnosis;
    //}

    //public void setDiagnosis(Diagnosis diagnosis){
        //firePropertyChange("diagnosis", this.diagnosis, this.diagnosis = diagnosis);
    //}

    // property: diagnosisText
    public String getDiagnosisText(){
        return diagnosisText.get();
    }

    public void setDiagnosisText(String diagnosisText){
        this.diagnosisText.set(diagnosisText);
        setChanged(true);
    }

    public StringProperty diagnosisTextProperty() {return diagnosisText;}

    // property: diagnosisIndex
    public Integer getDiagnosisIndex(){
        return diagnosisIndex.get();
    }

    public void setDiagnosisIndex(Integer diagnosisIndex){
        this.diagnosisIndex.set(diagnosisIndex);
    }

    public IntegerProperty diagnosisIndexProperty() {return diagnosisIndex;}

    // property: noDiseaseSide
    public boolean getNoDiseaseSide(){
        return noDiseaseSide.get();
    }

    public void setNoDiseaseSide(boolean noDiseaseSide){
        this.noDiseaseSide.set(noDiseaseSide);
        setChanged(true);
    }

    public BooleanProperty noDiseaseSideProperty() {return noDiseaseSide;}

    // property: leftDiseaseSide
    public boolean getLeftDiseaseSide(){
        return leftDiseaseSide.get();
    }

    public void setLeftDiseaseSide(boolean leftDiseaseSide){
        this.leftDiseaseSide.set(leftDiseaseSide);
        setChanged(true);
    }

    public BooleanProperty leftDiseaseSideProperty() {return leftDiseaseSide;}

    // property: rightDiseaseSide
    public boolean getRightDiseaseSide(){
        return rightDiseaseSide.get();
    }

    public void setRightDiseaseSide(boolean rightDiseaseSide){
        this.rightDiseaseSide.set(rightDiseaseSide);
        setChanged(true);
    }

    public BooleanProperty rightDiseaseSideProperty() {return rightDiseaseSide;}

    // property: twoDiseaseSide
    public boolean getTwoDiseaseSides(){
        return twoDiseaseSides.get();
    }

    public void setTwoDiseaseSides(boolean twoDiseaseSides){
        this.twoDiseaseSides.set(twoDiseaseSides);
        setChanged(true);
    }

    public BooleanProperty twoDiseaseSidesProperty() {return twoDiseaseSides;}

    // property: complications
    //public String[] getComplications(){
    //    return complications.;
    //}

    //public void setComplications(String[] newVal){
    //    complications = newVal;
    //}

   // public StringProperty[] complicationsProperty() {return complications;}

    // property: twoDiseaseSide
    //public String[] getOtherDiseases(){
    //    return otherDiseases;
   // }

    //public void setOtherDiseases(String[] newVal){
    //    otherDiseases = newVal;
    //}

    // property: desc
    public String getDesc(){
        return desc.get();
    }

    public void setDesc(String desc){
        this.desc.set(desc);
        setChanged(true);
    }

    public StringProperty descProperty() {return desc;}

    // property: diagnosisIndex
    //public Operation getOperation(){
    //    return operation;
    //}

    //public void setOperation(Operation operation){
        //firePropertyChange("operation", this.operation, this.operation = operation);
    //}

    // property: operationText
    public String getOperationText(){
            return operationText.get();
    }

    public void setOperationText(String operationText){
        this.operationText.set(operationText);
        setChanged(true);
    }

    public StringProperty operationTextProperty() {return operationText;}

    // property: operationIndex
    public Integer getOperationIndex(){
        return operationIndex.get();
    }

    public void setOperationIndex(Integer operationIndex){
        this.operationIndex.set(operationIndex);
    }

    public IntegerProperty operationIndexProperty() {return operationIndex;}

    // property: operationDate
    public Date getOperationDate(){
        return operationDate.get();
    }

    public void setOperationDate(Date operationDate){
        this.operationDate.set(operationDate);
        setChanged(true);
    }

    public ObjectProperty<Date> operationDateProperty() {return operationDate;}

    // property: noOperationSide
    public boolean getNoOperationSide(){
        return noOperationSide.get();
    }

    public void setNoOperationSide(boolean noOperationSide){
        this.noOperationSide.set(noOperationSide);
        setChanged(true);
    }

    public BooleanProperty noOperationSideProperty() {return noOperationSide;}

    // property: leftOperationSide
    public boolean getLeftOperationSide(){
        return leftOperationSide.get();
    }

    public void setLeftOperationSide(boolean leftOperationSide){
        this.leftOperationSide.set(leftOperationSide);
        setChanged(true);
    }

    public BooleanProperty leftOperationSideProperty() {return leftOperationSide;}

    // property: rightOperationSide
    public boolean getRightOperationSide(){
        return rightOperationSide.get();
    }

    public void setRightOperationSide(boolean rightOperationSide){
        this.rightOperationSide.set(rightOperationSide);
        setChanged(true);
    }

    public BooleanProperty rightOperationSideProperty() {return rightOperationSide;}

    // property: twoOperationSides
    public boolean getTwoOperationSides(){
        return twoOperationSides.get();
    }

    public void setTwoOperationSides(boolean twoOperationSides){
        this.twoOperationSides.set(twoOperationSides);
        setChanged(true);
    }

    public BooleanProperty twoOperationSidesProperty() {return twoOperationSides;}

    // property: omitStitches
    public boolean getOmitStitches(){
        return omitStitches.get();
    }

    public void setOmitStitches(boolean omitStitches){
        this.omitStitches.set(omitStitches);
        setChanged(true);
    }

    public BooleanProperty omitStitchesProperty() {return omitStitches;}

    // property: removedStitches
    public boolean getRemovedStitches(){
        return removedStitches.get();
    }

    public void setRemovedStitches(boolean removedStitches){
        this.removedStitches.set(removedStitches);
        setChanged(true);
    }

    public BooleanProperty removedStitchesProperty() {return removedStitches;}

    // property: notRemovedStitches
    public boolean getNotRemovedStitches(){
        return notRemovedStitches.get();
    }

    public void setNotRemovedStitches(boolean notRemovedStitches){
        this.notRemovedStitches.set(notRemovedStitches);
        setChanged(true);
    }

    public BooleanProperty notRemovedStitchesProperty() {return notRemovedStitches;}

    //@Override
    public String toString() {
        return getSurname() + "_" + getName().charAt(0) + getPatronymic().charAt(0) + " (" + getNo() + ")";
    }

}
