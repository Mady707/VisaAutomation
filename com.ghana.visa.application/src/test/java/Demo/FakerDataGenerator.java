package Demo;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

public class FakerDataGenerator {

	public static void main(String[] args) {
		FakeValuesService fakeValuesService = new FakeValuesService(
			      new Locale("en-IND"), new RandomService());
			 
			    String email = fakeValuesService.bothify("????##@gmail.com");
			    Matcher emailMatcher = Pattern.compile("\\w{4}\\d{2}@gmail.com").matcher(email);
			  System.out.println("email===>" +email);
			  
			  Faker faker1 = new Faker(new Locale("en-IND"));
				
			String number1 =  faker1.phoneNumber().cellPhone().replaceAll("[-+.^:,]","");
		System.out.println("faker.name();" +faker1.name().firstName());
		System.out.println("last name;" +faker1.name().lastName());
		System.out.println("fmiddle" +faker1.name().nameWithMiddle());
		System.out.println("faker.phoneNumber();;" +number1);
		System.out.println("faker.address();" +faker1.address().city());
		System.out.println("faker.address();" +faker1.address().state());

	}

}
