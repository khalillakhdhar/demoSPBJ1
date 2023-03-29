package com.demo.model;
// boilerplat code
public class Utilisateur {
//attribut
	private String nom,prenom;
private String adresse;
private int age;
// encapsulation => créer les attributs privé puis accéder via GET/SET
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Utilisateur(String nom, String prenom, String adresse, int age) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.adresse = adresse;
	this.age = age;
}
public Utilisateur() {
	super();
	// TODO Auto-generated constructor stub
}
public void sayHello()
{
System.out.println("Bonjour");	
}




}
