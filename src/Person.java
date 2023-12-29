import java.util.HashMap;


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
 }