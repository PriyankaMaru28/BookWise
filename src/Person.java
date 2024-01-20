import java.util.HashMap;
import java.util.Scanner;

public abstract class Person {

 String username;
 String type;

 public String getUsername() {
  return username;
 }

 public void setUsername(String username) {
  this.username = username;
 }

 public String getType() {
  return type;
 }

 public void setType(String type) {
  this.type = type;
 }

 public abstract void AddUser(HashMap<Integer,Person> p1);

 //Iterate the hashmap to display all users
 public void DisplayUsers(HashMap<Integer,Person> p1){
  System.out.println("Display users called....");

 }
 }