package base;

import java.util.UUID;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;
import javafx.beans.property.StringProperty;

public class Person_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		PersonDomainModel Bert=new PersonDomainModel();
		Bert.setFirstName("Bert");
		Bert.setLastName("Gibbons");
		Bert.setStreet("Main St");
		Bert.setPostalCode(30);
		Bert.setCity("NYC");
		Bert.setBirthday(null);
		UUID BertID=UUID.randomUUID();
		Bert.setID(BertID);
		PersonDAL BertDAL=new PersonDAL();
		BertDAL.addPerson(Bert);
		BertDAL.getPersons();
		BertDAL.updatePerson(Bert);
		BertDAL.deletePerson(BertID);
		
	}

}
