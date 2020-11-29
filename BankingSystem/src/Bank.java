import java.io.Serializable;

public class Bank implements Serializable {

private static final long serialVersionUID = 5950169519310163575L;
private String actId;
private String name;
private int balance;
private int operation;

/*public Bank(String  actId, int operation) {
this.actId = actId;
this.operation = operation;
}*/
public Bank(String  actId, int balance,int operation) {
this.actId = actId;
this.balance = balance;
this.operation = operation;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name=name;
}
public String getactId() {
return actId;
}

public void setactId(int id) {
this.actId = actId;
} 

public int getOperation() {
return operation;
}

public void setOperation(String name) {
this.operation = operation;
}


public String toString() {
return "ActId = " + getactId() +  "Operation =  "+ getOperation();
}
}