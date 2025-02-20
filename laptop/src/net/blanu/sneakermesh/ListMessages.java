package net.blanu.sneakermesh;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListMessages {
	public static void main(String[] args) throws IOException {		
		Sneakermesh mesh=new LaptopSneakermesh();
		
		List<Message> msgs=mesh.getMessages();
		Collections.sort(msgs);
		for(Message msg : msgs)
		{
			TextMessage tm=(TextMessage)msg;
			System.out.println(tm.getText());
		}
	}
}
