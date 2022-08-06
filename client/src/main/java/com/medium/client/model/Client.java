package com.medium.client.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="client")
public class Client {
    public Client(int id, String name, int age, String address) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.address=address;
	}

	@Id
    @GeneratedValue
    public Integer id;

    @Column(name ="name")
    public String name;

    @Column(name ="age")
    public Integer age;

    @Column(name ="adress")
    public String address;
}
