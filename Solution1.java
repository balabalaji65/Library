package org.dummy.emp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int i=0;
		while(i<3){
			i++;
		}
		session.beginTransaction();
		System.out.println("ID:");
		int id = Integer.valueOf(bf.readLine());
		System.out.println("Book Name:");
		String name = bf.readLine();
		System.out.println("Genre:");
		String genre = bf.readLine();
		System.out.println("Book price:");
		float price = Float.valueOf(bf.readLine());
		System.out.println("Author Name:");
		String authorName = bf.readLine();
		System.out.println("Total Books:");
		int totalBooks = Integer.valueOf(bf.readLine());
		
		Library library = new Library(id, name, genre, price,authorName,totalBooks);
		System.out.println("ID:" + " " + library.getId());
		System.out.println("Book Name:" + " " + library.getName());
		System.out.println("Genre:" + " " + library.getGenre());
		System.out.println("Book price:" + " " + library.getPrice());
		System.out.println("Author Name:" + " " + library.getAuthorName());
		System.out.println("Total Books:" + " " + library.getTotalBooks());
		session.save(library);
		session.getTransaction().commit();
		session.close();
	}
}