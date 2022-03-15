package com.resonance.stepdefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Parameterization {
	int x, y, result = 0;
	ArrayList<Integer> al = new ArrayList<>();
	String fname, lname, fullName;

	@Given("I have number {int} and {int}")
	public void acceptTwoNumber(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@When("I add them")
	public void addNumbers() {
		result = x + y;
	}
	
	@Then("Verify if the result is prime number")
	public void checkIfResultIsPrime() {
		boolean isPrime=false;
		int count=0;
		for(int i=0;i<result;i++) {
			if(result%2==0) {
				count++;
			}
		}
		if(count>2) {
			System.out.println("Result is not prime:"+result);
		}else
		{
			System.out.println("Result is prime:"+result);
		}

	}

	@Then("Verify that addition is even")
	public void isAdditionEven() {
		Assert.assertTrue(result % 2 == 0, "Addtion is not even:" + result);

	}

	@Given("I have first name as {string}")
	public void acceptFirstName(String fname) {
		this.fname = fname;
	}

	@When("I append last name {string}")
	public void appendName(String lname) {
		String name = fname.concat(" " + lname);
		fullName = name;
	}

	@Then("I can see full name")
	public void displayFullName() {
		System.out.println("Fullname:" + fullName);

	}

	@Given("I have following numbers:")
	public void acceptListOfElements(Map<Integer,Integer> map) {
		// al.addAll(list);
		Set<Entry<Integer,Integer>> entries=map.entrySet();
		Iterator<Entry<Integer,Integer>> itr=entries.iterator();
		while(itr.hasNext()) {
			Entry entry=itr.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
	}

	@When("I add all elements of list")
	public void addElementsOfList() {
		for (Integer element : al) {
			result = result + element;
		}

	}
	@Given("I have numbers from {int}")
	public void readDataFromExcel(int rowNumber) throws Exception {
		String dir=System.getProperty("user.dir");
		FileInputStream fis=new FileInputStream(dir+"//src//test//resources//TestData//Numbers.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(fis);
		Sheet sheet=book.getSheetAt(0);
		Row row=sheet.getRow(rowNumber);
		this.x=(int) row.getCell(0).getNumericCellValue();
		this.y=(int) row.getCell(0).getNumericCellValue();
		
		
		}

}
