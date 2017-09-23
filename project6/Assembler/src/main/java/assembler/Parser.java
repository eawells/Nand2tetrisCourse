package assembler;

import java.io.InputStream;
import java.util.*;

public class Parser {
	private List<List<String>> listOfParsedStrings;
	
	public Parser(InputStream file){
		listOfParsedStrings = new ArrayList<List<String>>();
	}

	public void parseString(String string) {
		List<String> parsedString = new ArrayList<String>();
		listOfParsedStrings.add(parsedString);
		parsedString.add("@");
	}

	public List<List<String>> getList() {
		return listOfParsedStrings;
	}

}
