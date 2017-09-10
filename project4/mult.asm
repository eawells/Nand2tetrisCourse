// This file is part of www.nand2tetris.org
// and the book "The Elements of Computing Systems"
// by Nisan and Schocken, MIT Press.
// File name: projects/04/Mult.asm

// Multiplies R0 and R1 and stores the result in R2.
// (R0, R1, R2 refer to RAM[0], RAM[1], and RAM[2], respectively.)

	@i
	M=1
	@2
	M=0
(LOOP)
	@i
	D=M
	@1
	D=D-M //D=i-RAM[1]
	@END
	D;JGT 
	@0
	D=M
	@2
	M=D+M
	@i
	M=M+1
	@LOOP
	0; JMP //Goto LOOP
(END)
	@END
	0; JMP