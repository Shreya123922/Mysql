package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbc;

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.print("hellow world");
			/*
			 * System.out.println("enter the no of records to be inserted:"); int records =
			 * sc.nextInt();
			 * 
			 * App arr[] = new App[records];
			 * 
			 * for (int i = 0; i < records; i++) { int id = sc.nextInt(); String name =
			 * sc.nextLine(); String city = sc.nextLine(); arr[i] = new App(id, name, city);
			 * }
			 */

		String sql = "insert into Persons(PersonID,FirstName,City)values(? ,?, ?)";
		int res = jdbc.update(sql,	1,"rahul","canada");
		if (res > 0) {
			System.out.println("rows inserted =" + " " + res);
		} else
			System.out.println("No rows inserted");

	}

}
