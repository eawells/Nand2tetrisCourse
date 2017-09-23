package tests;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

import assembler.Parser;

public class ParserTests {
	
	@Test
	public void whenTheParserReadsInAt2ThenAtIsFirstElementInList() throws FileNotFoundException{
		Parser p = new Parser(new FileInputStream("c:/Users/littl/Dropbox/Summer 17/nand2tetris/nand2tetris/projects/06/add/At2.asm"));
		p.parseString("@2");
		assertEquals("@",p.getList().get(0).get(0));
	}

}
