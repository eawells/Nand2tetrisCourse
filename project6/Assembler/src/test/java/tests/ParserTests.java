package tests;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;

import org.junit.Test;

import assembler.Parser;

public class ParserTests {

	private Parser p;

	@Before
	public void setUp() throws FileNotFoundException{
		p = new Parser(new FileInputStream("c:/Users/littl/Dropbox/Summer 17/nand2tetris/nand2tetris/projects/06/add/At2.asm"));
	}

	@Test
	public void whenTheParserReadsInAtThenAtIsFirstElementInList(){
		p.parseString("@");
		assertEquals("@",p.getList().get(0).get(0));
	}

	@Test public void whenTheParserReadsInAt2Then2IsSecondElementInList(){
		p.parseString("@2");
		List<String> parsedString = new ArrayList<String>();
		parsedString.add("@");
		parsedString.add("2");
		assertEquals(parsedString,p.getList().get(0));
	}

}
