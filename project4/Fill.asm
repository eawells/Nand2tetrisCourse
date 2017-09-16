// This file is part of www.nand2tetris.org
// and the book "The Elements of Computing Systems"
// by Nisan and Schocken, MIT Press.
// File name: projects/04/Fill.asm

// Runs an infinite loop that listens to the keyboard input.
// When a key is pressed (any key), the program blackens the screen,
// i.e. writes "black" in every pixel;
// the screen should remain fully black as long as the key is pressed. 
// When no key is pressed, the program clears the screen, i.e. writes
// "white" in every pixel;
// the screen should remain fully clear as long as no key is pressed.

	@8192  //total screen space
	D=A
	@screenSpace
	M=D

(LOOP)
	@i
	M=0
(CHECKINPUT)
	@KBD
	D=M

	@KEYNOTPRESSED
	D;JEQ	//if keyboard = 0, then jump to KEYNOTPRESSED
	
(KEYPRESSED)
	@i
	D=M
	@SCREEN
	A=A+D
	M=-1
	@INCREMENT
	0;JMP
	
(KEYNOTPRESSED)
	@i
	D=M
	@SCREEN
	A=A+D
	M=0
	
(INCREMENT)
	@i
	MD=M+1
	@screenSpace
	D=D-M
	@LOOP
	D;JEQ
	@CHECKINPUT
	0;JMP