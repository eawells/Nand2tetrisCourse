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
		for(int i= 0; i<string.length(); i++){
			parsedString.add(string.substring(i,i+1));
		}
	}

	public List<List<String>> getList() {
		return listOfParsedStrings;
	}

}
