package project.test;

import java.util.Scanner;

import project.model.Question;

public class QuestionTest {

	public static void main(String[] args) {
		Question q1=new Question(2,"What hihihahahehe??" , "laugh");
		System.out.println("Your Question is" +q1.getQuestion());
		System.out.println("Your answer is ");
		String ans=new Scanner(System.in).nextLine();
		if(q1.answerCorrect(ans)) System.out.println("Yeah, you win");
		else System.out.println("Oh, you lose");
		System.out.println("Infomation question is "+q1);

	}

}
