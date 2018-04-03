package assignment.Weight.Watchers.testRunner;

import org.testng.annotations.Test;

import utility.BaseClass;
import utility.TestData;

public class TestRunner extends BaseClass{
	
	@Test
	public void test1(){
		Ass1().assignmment1(TestData.reverse);
		
	}
	@Test
	public void test2a(){
		Ass2().assigmentTwoA();
	}

	
	@Test
	public void test2b(){
		Ass2().Assignment2b();
	}
	
	@Test
	public void test3a(){
		Ass3().doesFileExist(TestData.dictionary_Path);
	}
	
	@Test
	public void test3b(){
		Ass3().assigmment3B();
	}
}
