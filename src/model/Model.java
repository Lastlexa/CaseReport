/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.sql.ResultSet;

import db.*;


/**
 *
 * @author Alex
 */
public class Model {
    
    private CaseRecord record;
    private ArrayList<Diagnosis> diagnosises = new ArrayList<Diagnosis>();
    private ArrayList<Operation> operations  = new ArrayList<Operation>();
    private final String fileExt = "crx";
    private String lastFileName = "";

    public Model(){
    }

    public Model(CaseRecord newRecord){
	setRecord(newRecord);
    }

    public CaseRecord getRecord(){
	return record;
    }

/**
 * 
 * @param newVal
 */
    public void setRecord(CaseRecord newVal){
	record = newVal;
    }

    public String getFileExt(){
	return fileExt;
    }

    public String getLastFileName(){
	return lastFileName;
    }

/**
 * 
 * @param newVal
 */
    public void setLastFileName(String lastFileName){
	this.lastFileName = lastFileName;
    }

    public ArrayList<Diagnosis> getDiagnosises(){
	return diagnosises;
    }

/**
 * 
 * @param newVal
 */
    public void setDiagnosises(ArrayList<Diagnosis> newValue){
	diagnosises = newValue;
    }

    public ArrayList<Operation> getOperations(){
	return operations;
    }

/**
 * 
 * @param newVal
 */
    public void setOperations(ArrayList<Operation> newValue){
	operations = newValue;
    }
	
    public void loadDict() throws Exception{
	DB.runDB();
	loadDiagnosisDict();
	loadOperationDict();
    }
	
    private void loadDiagnosisDict() throws Exception{
	ResultSet rs = DiagnosisDictGateway.findDict();
	diagnosises.clear();
	while ( rs.next() ) { 
            Diagnosis d = new Diagnosis(rs.getInt(1), rs.getInt(2), rs.getString(3));
		diagnosises.add(d);
        }
    }

    private void loadOperationDict() throws Exception{
        ResultSet rs = OperationDictGateway.findDict();
	operations.clear();
	while ( rs.next() ) { 
            Operation o = new Operation(rs.getInt(1), rs.getInt(2), rs.getString(3));
            operations.add(o);
	}
    } 
}
