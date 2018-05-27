public class CustomerMediumYard implements Yard {
private double cost;
private int size;
private String firstname;
private String lastname;


public CustomerMediumYard(int size1, String first, String last) {

size=size1;
cost = (size*.004);
firstname=first;
lastname=last;
}
public double getCost() {
return cost; }

public int getSize() {
return size; }

public int compareTo(Yard y) {
return this.size-y.getSize();}

public String getLastName() {
return lastname;}

public String getFirstName() {
return firstname;}

public String toString() {
return "cs too ez";}



}