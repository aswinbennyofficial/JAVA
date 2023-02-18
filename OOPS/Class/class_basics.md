```java

class Employee{  
    String name;  
    int id;  
}  


public class Company{  
	 public static void main(String args[]){  
        
        Employee harry=new Employee();  // Instantiating a new Employee object
        harry.name="Aswin Benny";  // Setting attributes 
        harry.id=12205631;  
  
        System.out.println(harry.id);  
        System.out.println(harry.name);  
		      }  
        }
```
---

```java
  
class Employee{  
    String name;  
    int id;  
    
    void printDetails(){  
        System.out.println("name is "+name);  
        System.out.println("id is "+id);  
	    }
    }  
  
  
public class Main {  
    public static void main(String args[]){  
  
        Employee harry=new Employee();  
        harry.name="Aswin Benny";  
        harry.id=12205631;  
  
        harry.printDetails();  
		}
    }
```
---

```java
  
class Employee{  
    String name;  
    int salary;  
  
	    String getName(){  
	        return name;  
		    }  
	    int getSalary(){  
	        return salary;  
		    }  
	    void setDetails(String n, int s){  
	        name=n;  
	        salary=s;  
	  
		    }
    }  
  
  
public class Main {  
    public static void main(String args[]){  
  
	    Employee harry=new Employee();  
	    
	    harry.setDetails("willy",32000);  
        
        System.out.println(harry.getName());  
        System.out.println(harry.getSalary());  
  
    }}
```

